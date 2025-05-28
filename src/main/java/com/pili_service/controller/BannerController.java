package com.pili_service.controller;

import com.pili_service.service.BannerService;
import com.pili_service.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * @description 根据一类轮播图
     * @param type 类别
     * @return
     */
    @GetMapping("/getBanners")
    public Response getBanners(@RequestParam Integer type) {
        try {
            return Response.success("200");
        } catch (Exception e) {
            return Response.failure(500, "error: "+e);
        }
    }


}
