package com.yzp.common.packdto.indto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : I
 * @Description : 统一入参封装
 * @Author : yangzp
 * @Date: 2022-10-24 15:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "全局统一返回结果")
public class I<T> {

    @ApiModelProperty(value = "头信息")
    private String Header;

    @ApiModelProperty(value = "输入数据")
    private T data;

    public I(T t) {
        this.setData(t);
    }
}
