package com.wd.tech.bean

/**
 * FileName: CinemaBean
 * Author: 杨明森
 * Date: 2019/4/7 15:22
 */
data class CinemaBean(
    val message: String,
    val result: List<Result>,
    val status: String
) {
    data class Result(
        val followMovie: Int,
        val id: Int,
        val imageUrl: String,
        val name: String,
        val rank: Int,
        val releaseTime: Long,
        val releaseTimeShow: String,
        val summary: String
    )
}