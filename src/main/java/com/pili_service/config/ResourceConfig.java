package com.pili_service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    @Value("${files.videoPath}")
    private String videoPath;
    @Value("${files.avatarPath}")
    private String avatarPath;
    @Value("${files.sysPath}")
    private String sysPath;
    @Value("${files.mgPath}")
    private String mgPath;
    @Value("${files.animationPath}")
    private String animationPath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*
         * 资源映射路径
         * addResourceHandler:访问映射路径
         * addResourceLocations:资源绝对路径
         */
        registry.addResourceHandler("/video/**").addResourceLocations("file:" + videoPath);
        registry.addResourceHandler("/avatar/**").addResourceLocations("file:" + avatarPath);
        registry.addResourceHandler("/sys/**").addResourceLocations("file:" + sysPath);
        registry.addResourceHandler("/mg/**").addResourceLocations("file:" + mgPath);
        registry.addResourceHandler("/animation/**").addResourceLocations("file:" + animationPath);
    }
}
