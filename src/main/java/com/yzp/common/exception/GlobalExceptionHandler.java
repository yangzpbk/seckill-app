package com.yzp.common.exception;

import com.yzp.common.packdto.outdto.R;
import com.yzp.common.packdto.outdto.ResultCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private R r;

    /**
     * @ClassName : GlobalExceptionHandler
     * @Description :权限码异常
     * @Author : yangzp
     * @Date: 2022-09-30 11:03
     */
    @ExceptionHandler(GlobalException.class)
    @ResponseBody
    public R handleNotPermissionException(GlobalException globalException) {
        ResultCodeEnum resultCodeEnum = globalException.getResultCodeEnum();
        log.error("java程序执行出错了，出错原因是:'{}'", globalException.getResultCodeEnum().getMessage());
        r = r.error(resultCodeEnum);
        return r;
    }
}


