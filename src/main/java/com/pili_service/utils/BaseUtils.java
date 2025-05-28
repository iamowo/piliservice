package com.pili_service.utils;

import org.springframework.beans.factory.annotation.Value;

/*
*   基础工具包
* */
public class BaseUtils {
    @Value("${resource.prefix}")
    private static String prefix;
    @Value("${ip}")
    private static String ip;
    public static String addResourcePath(String path) {
        return ip +  prefix + path;
    }
}
