package com.yzp.utils;

import com.yzp.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @ClassName : SessionUtil
 * @Description : session工具类
 * @Author : yangzp
 * @Date: 2022-10-10 09:17
 */
public class SessionUtil {
    private static final String USER = "user";

    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

    public static User getAccount() {
        HttpSession session = getRequest().getSession();
        return (User) session.getAttribute(USER);
    }

    public static void setAccount(User user) {
        HttpSession session = getRequest().getSession();
        if (user != null) {
            session.setAttribute(USER, user);
            //session过期时间设置，以秒为单位，即在没有活动30分钟后，session将失效
            session.setMaxInactiveInterval(30 * 60);
        }
    }
}
