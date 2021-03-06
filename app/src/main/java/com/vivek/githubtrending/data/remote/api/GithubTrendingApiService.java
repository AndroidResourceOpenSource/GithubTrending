package com.vivek.githubtrending.data.remote.api;


import androidx.lifecycle.LiveData;

import com.vivek.githubtrending.data.local.entity.GithubEntity;
import com.vivek.githubtrending.data.remote.model.ApiResponse;

import java.util.List;

import retrofit2.http.GET;

public interface GithubTrendingApiService {

    @GET("/repositories")
    LiveData<ApiResponse<List<GithubEntity>>> fetchTrendingRepositories();
}
