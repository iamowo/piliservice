package com.bili.pili_service.entity.vo.user;
/*
*  用户-实时数据-（粉丝， 关注， 视频数量， 动态数量）
* */
public class UserNumInfo {
    private Integer id;
    private Integer fans;
    private Integer follows;
    private Integer videos;

    // 动态数量
    private Integer blogs;

    private Integer icons;
}
