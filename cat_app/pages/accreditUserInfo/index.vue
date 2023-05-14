<template>
	<view class="viewport">
		<!--pages/accreditUserInfo/index.wxml-->
		<cu-custom bgColor="bg-white" isBack="true">
			<view slot="backText">{{$t('main.goback')}}</view>
			<view slot="content">{{$t('main.appName')}}</view>
		</cu-custom>
		<view class="conent">
			<view class="top margin-left">
				<view class="auth-txt">登录{{$t('main.appName')}}</view>
				<view class="auth-txt margin-top-xs">获得3大专属权益</view>
				<view class="u-m-t-10"><text class="cuIcon-title"></text> 定制个人首页</view>
				<view class="u-m-t-10"><text class="cuIcon-title"></text> 天天有福利</view>
				<view class="u-m-t-10"><text class="cuIcon-title"></text> 内容一键收藏</view>
			</view>
			<view class="auth-op">
				<!-- #ifdef MP -->
				<button class="auth-btn bg-theme" @tap="userLogin">微信登录</button>
				<!-- #endif -->
				<!-- #ifndef MP  -->
				<button class="auth-btn bg-theme" @tap="toLogin">{{$t('main.login')}}</button>
				<!-- #endif -->
			</view>
		</view>
	</view>
</template>

<script>
	// pages/accreditUserInfo/index.js
	import {unauthPath} from "@/utils/constant.js"
	import cache from '@/utils/storage.js'
	import userAPI from '@/api/user.js'
	import {toast} from "@/utils/util.js"
	import {
		mapActions,
		mapGetters
	} from 'vuex'
	export default {
		data() {
			return {};
		},
		computed: {},
		methods: {
			...mapActions('user', ['login']),
			async userLogin() {
				if(this.userLogin.lock){
					return
				}
				try{
					this.userLogin.lock = true
					const {encryptedData,iv,userInfo} = await new Promise((resolve,reject)=>{
						uni.getUserProfile({
							desc: '用于完善会员资料',
							success:resolve,
							fail:reject
						})
					})
					uni.showLoading({
						mask:true,
						title:"登录中..."
					})
					const {code} = await new Promise((resolve,reject)=>{
						wx.login({
							success:resolve,
							fail:reject,
						})
					})
					const res = await userAPI.code2Session({jsCode:code,encryptedData,iv})
					await this.login(res)
					cache.set('catCo_userInfo',userInfo);
					uni.hideLoading()
					uni.navigateBack()
				}catch(e){
					console.info(e)
					if(e.retCode=='100002'){
						toast('当前人数过多，请重试')
					}
				}finally{
					this.userLogin.lock =  false
				}
			},
			toLogin(e) {
				uni.redirectTo({
					url: unauthPath
				});
			}
		}
	};
</script>
<style lang="scss" scoped>
	// @import "./index.css";
	.viewport{
		height: 100vh;
		width: 100vw;
		display: flex;
		flex-direction: column;
		.conent{
			flex:1;
			display: flex;
			flex-direction: column;
			justify-content: space-between;
			background-image: url(/static/assets/images/auth-bg.png);
			background-size: 100% auto;
			background-repeat: no-repeat;
			background-position: 90rpx 166rpx;
		}
		.top{
			margin-top: 60rpx;
			// margin-left: 20rpx;
		}
		.auth-txt{
		  font-size: 50rpx;
		  font-weight: bold;
		}
		.auth-op{
			margin-bottom: 170rpx;
			width: 70%;
			align-self: center;
		}
		.auth-btn{
		  padding: 28rpx 160rpx;
		  font-size: 32rpx;
		  border-radius:1000rpx;
		  border: none;
		  margin: 0;
		  line-height: 1;
		  &::after{
			  content: none;
		  }
		}
	}
</style>