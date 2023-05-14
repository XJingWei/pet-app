package com.cat.modules.pet.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.annotation.TableId;

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
 * 宠物媒体记录
 * </p>
 *
 * @author huangjingwei
 * @date 2021-10-22
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ToString
public class PetRecordMedia extends BaseEntity<PetRecordMedia> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id")
    @TableField("id")
    private String id;

    /**
     * 记录id
     */
    @TableField("record_id")
    private String recordId;

    /**
     * 宠物id
     */
    @TableField("pet_id")
    private String petId;

    /**
     * 媒体地址
     */
    @TableField("media_url")
    private String mediaUrl;

    /**
     * 小媒体地址
     */
    @TableField("small_url")
    private String smallUrl;

    /**
     * 类型(1:图片、2:视频)
     */
    @TableField("type")
    private String type;

    /**
     * 排序值
     */
    @TableField("sort_no")
    private Integer sortNo;

    /**
     * 资源宽度px
     */
    @TableField("width")
    private Integer width;

    /**
     * 资源高度px
     */
    @TableField("height")
    private Integer height;



}
