# 宠友信息-社区/论坛APP

#### 介绍
- 一款基于宠物社区/论坛交友系统APP，支持安卓、苹果、小程序、H5端多端适配。前端uniapp跨平台编译，后端使用SpringBoot微服务架构。可自由修改为其他行业内容。
- 友猫社区做了快5年了，目前你能想到的社区/论坛该有的功能大部分已经具备。
- 具备特点：社区（图文、视频发布、文章、话题、圈子、问答、附近、点赞、评论、关注、IM即时通讯、积分模块、头像挂件、VIP会员、消息推送通知、商城 等等）

#### 项目演示
1. 用户端：https://www.youmao.pro
2. 管理端：https://www.chongyou.info
3. 小程序端：

   <img src="https://foruda.gitee.com/images/1684052166819146365/ef9375fe_911913.jpeg" width="120" alt="微信小程序"/>
4. 手机 H5端：

   <img src="https://www.youmao.pro/image/h5_code.png" width="120" alt="手机H5端"/>

5. 手机 APP端：
 
   <img src="https://foruda.gitee.com/images/1684052614684609431/fbd0b48a_911913.png" width="120" alt="APP端"/>


#### 相关链接

- 官网：https://www.chongyou.info
- 友猫项目演示网站：https://www.youmao.pro
- 详细功能说明：https://www.yuque.com/ecvnlg/bi6m7t


#### 软件架构

![输入图片说明](%E5%8F%8B%E7%8C%AB%E7%B3%BB%E7%BB%9F%E6%8A%80%E6%9C%AF%E6%9E%B6%E6%9E%84%E5%9B%BE.jpg)

- 前端使用uni-app开发, uni-app 是一个使用 Vue.js 开发所有前端应用的框架。
- 开发者编写一套代码，可发布到iOS、Android、H5、以及各种小程序（微信/支付宝/抖音/QQ）等多个平台。
- 后端：SpringBoot微服务架构
- 数据库：MySql、Redis、ES



#### 项目截图
![输入图片说明](%E5%8A%9F%E8%83%BD%E9%A2%84%E8%A7%88%E5%9B%BE.jpg)

#### 功能介绍
```
部分功能介绍：
1.发现
	搜索：用于搜索平台（用户、宠物、话题、文章等），可保留最近搜索记录;
	海报：首页头部可轮播多张海报循环展示用于互动或广告位;
	动态列表：按一定计算权重（点赞、评论、阅读、时间）排名推荐算法展示用户发布的动态信息;

2.关注
	关注列表：展示所关注的用户近期发布的动态信息
	关注用户：用户可自行关注自己喜欢的用户达到互动模式
	推荐关注：系统会按算法不重复模式推荐给可关注用户列表

3.附近人
	地图：用户授权位置信息后，其他人可在系统内查看附近2km内其他用户所在位置，便于用户之间互相知道附近的用户群体
	用户信息：可点击地图用户头像显示用户信息

4.话题内容
	热门圈子：用户发布信息最热的2个话题圈显示（头像、加入人数、名称）
	推荐圈子：按照圈子内容数排名展示圈子列表信息
	我加入的圈子：用户可自行加入自己喜欢的圈子进行互动
	话题详情：展示该话题内所有用户发布的信息列表

5.圈子
	创建圈子：名称、ioc图标、banner背景图、介绍、成员称呼
	圈主管理：内容置顶、内容屏蔽、公告、删除内容、拉黑用户等
	圈子操作：加入/退出圈子，圈子内容发布动态图文、文章

6.发布
	每条动态信息可以选择（宠物、话题、位置）功能。并有图片文字内容AI自动审核（防止不良信息出现），自动审核不收取而外费用！
	图片心得：可选择最多9张图片，1千字文字发布宠物信息
	短视频：15内段视频上传发布可配文字话题位置
	长图文：又称文章需要用户达到一定等级才可发布保证系统内容质量（可调）

7.消息
	互动消息：用户收到的其他人点赞评论内容会以图文形式展示可点击查看查看详情
	关注：新增关注人数列表
	通知公告：由后台发布对所有用户通知信息

8.我的
	签到：每天签到按阶梯获罐头数可后台配置
	基本信息：显示该用户关注、粉丝、动态、获赞数，魅力值（经验值）、罐头数
	侵权上报：用户可上报内容侵权后台可对内容进行二次审核
	客服：在线客服功能可在微信进行对话聊天
	官V认证：后台对用户进行官V认证功能，该用户发布的所有内容头像都会显示小v图标

9.积分管理
	兑换：可在后台设置商品和对于条件用户进行兑换达到营销目的
	我的积分：可查看自己获得罐头记录详情和消耗明细
	赚积分：注册、设置手机号、创建宠物、签到、点赞、评论等操作都可以获得相应的罐头克数，后台可配置管理

10.动态
	详情：显示该动态图片、视频、文字、表情发布时间
	点赞列表：按点赞时间显示点赞人头像信息
	评论列表：评论列表仿今日头条方式显示每条用户评论信息

11.宠物管理
	创建宠物档案：用户可创建自己的宠物信息包括（头像、名称、品种、生日、体重、相亲、绝育等）信息便于其他人查看交友、相亲等
	宠物列表：可添加多个宠物展示列表显示
	宠物详情：显示宠物基本信息和绑定动态以时间轴形式显示
	宠物相册：每次发布动态内容图片会自动保存在该宠物相册中便于查看

12.互动
	每种交互方式都会产生罐头作为奖励给用户（后台可配置）
	投食：每天可对自己喜欢的宠物进行投食并不消耗自己的罐头，该宠物可获得响应克数罐头
	关注：用户可关注人、宠物形式可在列表中查看
	点赞：动态、文章、评论点赞等
	评论：动态、文章、评论回复等
	
上述只是冰山一角
```

