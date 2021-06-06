package com.mj.aop_part4_chapter01.service

import com.mj.aop_part4_chapter01.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/3bf0a0ce-4657-4a34-9f46-81aba523e6ab")
    fun listVideos(): Call<VideoDto>

}