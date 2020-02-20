package com.example.favteam.networkService;

import com.example.favteam.Models.Teams;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FaveTeamApi {

    @GET("searchteams.php")
    Call<Teams> listAllLaunches(@Query("t") String teamName);
}
