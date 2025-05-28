package com.pili_service.service.Imp;

import com.pili_service.entity.vo.video.VideoInfo;
import com.pili_service.entity.vo.video.VideoShow;
import com.pili_service.service.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImp implements VideoService {
    @Override
    public VideoInfo getByVid(Integer videoId, Integer userId) {

        return null;
    }

    @Override
    public List<VideoShow> getRecommendedVideo(Integer userId) {

        return null;
    }
}
