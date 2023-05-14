package com.cat.modules.pet.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.extern.slf4j.Slf4j;
import com.cat.base.entity.BaseEntity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 宠物投食记录
 * </p>
 *
 * @author huangjingwei
 * @date 2019-06-28
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PetFeedLog extends BaseEntity<PetFeedLog> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "feed_id")
    @TableField("feed_id")
    private String feedId;

    /**
     * 宠物ID
     */
    @TableField("pet_id")
    private String petId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;

    @TableField("food_number")
    private Integer foodNumber;

    /**
     * 宠物主人id
     */
    @TableField("to_user_id")
    private String toUserId;


}
