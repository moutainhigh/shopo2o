package com.huotu.shopo2o.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取 cookie 相关方法
 * Created by helloztt on 2017-06-27.
 */
public class CookieUtils {
    /**
     * 根据 key 从 cookies 获取 Integer 的值
     * @param request 请求数据
     * @param key 键名
     * @return
     */
    public static int getCookieValInteger(HttpServletRequest request, String key) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(key)) {
                    return Integer.parseInt(cookie.getValue());
                }
            }
        }
        return -1;
    }

    /**
     *  根据 key 从 cookies 获取值
     * @param request 请求数据
     * @param key 键名
     * @return
     */
    public static String getCookieVal(HttpServletRequest request, String key){
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(key)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    /**
     * 设置cookie
     *
     * @param response
     * @param key
     * @param value
     */
    public static void setCookie(HttpServletResponse response, String key, String value, String domain) {
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(1209600);
        cookie.setPath("/");
        cookie.setDomain(domain.substring(1));
        response.addCookie(cookie);
    }
}
