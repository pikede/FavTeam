package com.example.favteam.Models

import com.google.gson.annotations.SerializedName

data class Teams(
    @SerializedName("teams")
    var teams: List<Team>?
)

