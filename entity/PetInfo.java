package com.cat.modules.pet.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.cat.base.entity.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 宠物信息
 * </p>
 *
 * @author huangjingwei
 * @date 2019-04-10
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("pet_info")
public class PetInfo extends BaseEntity<PetInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 宠物id
     */
    @TableId(value = "pet_id",type = IdType.UUID)
    @TableField("pet_id")
    private String petId;

    /**
     * 头像
     */
    @TableField(value = "avatar_url",strategy = FieldStrategy.NOT_EMPTY)
    private String avatarUrl;

    /**
     * 宠物名
     */
    @TableField("pet_name")
    private String petName;

    /**
     * 宠物类型（1：猫2：狗）
     */
    @TableField("pet_type")
    private String petType;

    /**
     * 品种类型(数据字典)
     */
    @TableField("variety_type")
    private String varietyType;

    /**
     * 出生日期
     */
    @TableField("birth_date")
    private LocalDate birthDate;

    /**
     * 到家日期
     */
    @TableField("home_date")
    private LocalDate homeDate;


    /**
     * 性别(1：男、2：女)
     */
    @TableField("sex")
    private String sex;


    /**
     * 颜色
     */
    @TableField("color")
    private String color;

    /**
     * 长短毛
     */
    @TableField("hait")
    private String hait;

    /**
     * 重量
     */
    @TableField("weight")
    private Integer weight;

    /**
     * 简介
     */
    @TableField("profiles")
    private String profiles;

    /**
     * 是否绝育(0：未绝育，1：绝育)
     */
    @TableField("is_sterilization")
    private String isSterilization;

    /**
     * 相亲意愿(0：无，1：有)
     */
    @TableField("is_married")
    private String isMarried;

    /**
     * 是否完全育苗(0：否，1：是)
     */
    @TableField("is_yumiao")
    private String isYumiao;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;


    /**
     * 点赞数
     */
    @TableField("praise_count")
    private Integer praiseCount;

    /**
     * 粉丝数
     */
    @TableField("fans_count")
    private Integer fansCount;

    /**
     * 获食(g)
     */
    @TableField("food_number")
    private Integer foodNumber;

    /**
     * 出生时间字符串
     */
    @TableField(exist = false)
    private String birthDateStr;

    /**
     * 到家时字符串
     */
    @TableField(exist = false)
    private String homeDateStr;

    /**
     * 品名 （如：金渐层等）
     */
    @TableField("category")
    private String category;

    /**
     * 疫苗：0:未接种 1:已接种
     */
    @TableField("vaccin")
    private String vaccin;

    @TableField("id_number")
    private Integer idNumber;

    /**
     * 拓展数据
     */
    @TableField("data_ext")
    private String dataExt;


}
