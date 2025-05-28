package com.pili_service.controller;

import com.pili_service.entity.vo.video.VideoInfo;
import com.pili_service.entity.vo.video.VideoShow;
import com.pili_service.service.VideoService;
import com.pili_service.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    /**
     * @description 根据 video_id 获取视频信息
     * @param videoId 视频id
     * @param userId 用户id
     * @return
     */
    @GetMapping("/getVideoById")
    public Response getByVid(@RequestParam Integer videoId, @RequestParam Integer userId) {
        try {
            VideoInfo res = videoService.getByVid(videoId, userId);
            return Response.success("200");
        } catch (Exception e) {
            return Response.failure(500, "error: "+e);
        }
    }

    /**
     * @description 获取个人推荐视频
     * @param userId 用户id
     * @return
     */
    @GetMapping("/getRecommendedVideo")
    public Response getRecommendedVideo(@RequestParam Integer userId) {
        try {
            List<VideoShow> res = videoService.getRecommendedVideo(userId);
            return Response.success(res);
        } catch (Exception e) {
            return Response.failure(500, "error: "+e);
        }
    }
}
