package com.yzp.common.exception;

import com.yzp.common.packdto.outdto.ResultCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : GlobalException
 * @Description : 全局异常处理
 * @Author : yangzp
 * @Date: 2022-09-30 11:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException {
    private ResultCodeEnum resultCodeEnum;
}
