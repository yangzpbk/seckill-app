package com.yzp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* <p>
* 
* </p>
*
* @author yangzp
* @since 2022-10-24
*/
@Data
@TableName("t_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id,手机号码")
    private String id;

    private String nickname;

    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    private String password;

    private String salt;

    @ApiModelProperty("头像")
    private String head;

    @ApiModelProperty("注册时间")
    private LocalDate registerDate;

    @ApiModelProperty("最后一次登录时间")
    private LocalDate lastLoginDate;

    @ApiModelProperty("登录次数")
    private Integer loginCount;


}