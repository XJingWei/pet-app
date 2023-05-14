package com.cat.modules.pet.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.annotation.TableId;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.cat.base.entity.BaseEntity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.annotation.TableField;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 宠物记录
 * </p>
 *
 * @author huangjingwei
 * @date 2021-10-22
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PetRecord extends BaseEntity<PetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id")
    @TableField("id")
    private String id;

    /**
     * 宠物id
     */
    @TableField("pet_id")
    private String petId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 内容类型(养育、清洁、随手记、大事件等)
     */
    @TableField("type")
    private String type;

    /**
     * 标签
     */
    @TableField("tag")
    private String tag;

    /**
     * 记录时间
     */
    @TableField("record_date")
    private LocalDateTime recordDate;

    /**
     * 点赞数
     */
    @TableField("praise_count")
    private Integer praiseCount;

    /**
     * 评论数
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 记录类型(1:文字、2:图文、3:视频)
     */
    @TableField("media_type")
    private String mediaType;

    /**
     * 封面图
     */
    @TableField("cover_image")
    private String coverImage;

    /**
     * 资源高度px
     */
    @TableField("height")
    private Integer height;

    /**
     * 资源宽度px
     */
    @TableField("width")
    private Integer width;

    /**
     * 媒体数
     */
    @TableField("media_count")
    private Integer mediaCount;

    /**
     * 扩展数据
     */
    @TableField("data_ext")
    private String dataExt;

    /**
     * 可见范围(public，private等)
     */
    @TableField("scope")
    private String scope;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private String isDelete;



}
