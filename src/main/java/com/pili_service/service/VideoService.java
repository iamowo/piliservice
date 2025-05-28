package com.pili_service.service;

import com.pili_service.entity.vo.video.VideoInfo;
import com.pili_service.entity.vo.video.VideoShow;

import java.util.List;

public interface VideoService {
    VideoInfo getByVid(Integer videoId, Integer userId);

    List<VideoShow> getRecommendedVideo(Integer userId);
}
