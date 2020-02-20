package com.example.favteam.Models

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("idTeam")
    var idTeam: String?,
    @SerializedName("idSoccerXML")
    var idSoccerXML: String?,
    @SerializedName("idAPIfootball")
    var idAPIfootball: String?,
    @SerializedName("intLoved")
    var intLoved: Any?,
    @SerializedName("strTeam")
    var strTeam: String?,
    @SerializedName("strTeamShort")
    var strTeamShort: Any?,
    @SerializedName("strAlternate")
    var strAlternate: String?,
    @SerializedName("intFormedYear")
    var intFormedYear: String?,
    @SerializedName("strSport")
    var strSport: String?,
    @SerializedName("strLeague")
    var strLeague: String?,
    @SerializedName("idLeague")
    var idLeague: String?,
    @SerializedName("strDivision")
    var strDivision: Any?,
    @SerializedName("strManager")
    var strManager: String?,
    @SerializedName("strStadium")
    var strStadium: String?,
    @SerializedName("strKeywords")
    var strKeywords: String?,
    @SerializedName("strRSS")
    var strRSS: String?,
    @SerializedName("strStadiumThumb")
    var strStadiumThumb: Any?,
    @SerializedName("strStadiumDescription")
    var strStadiumDescription: String?,
    @SerializedName("strStadiumLocation")
    var strStadiumLocation: String?,
    @SerializedName("intStadiumCapacity")
    var intStadiumCapacity: String?,
    @SerializedName("strWebsite")
    var strWebsite: String?,
    @SerializedName("strFacebook")
    var strFacebook: String?,
    @SerializedName("strTwitter")
    var strTwitter: String?,
    @SerializedName("strInstagram")
    var strInstagram: String?,
    @SerializedName("strDescriptionEN")
    var strDescriptionEN: String?,
    @SerializedName("strDescriptionDE")
    var strDescriptionDE: Any?,
    @SerializedName("strDescriptionFR")
    var strDescriptionFR: Any?,
    @SerializedName("strDescriptionCN")
    var strDescriptionCN: Any?,
    @SerializedName("strDescriptionIT")
    var strDescriptionIT: Any?,
    @SerializedName("strDescriptionJP")
    var strDescriptionJP: Any?,
    @SerializedName("strDescriptionRU")
    var strDescriptionRU: Any?,
    @SerializedName("strDescriptionES")
    var strDescriptionES: Any?,
    @SerializedName("strDescriptionPT")
    var strDescriptionPT: Any?,
    @SerializedName("strDescriptionSE")
    var strDescriptionSE: Any?,
    @SerializedName("strDescriptionNL")
    var strDescriptionNL: Any?,
    @SerializedName("strDescriptionHU")
    var strDescriptionHU: Any?,
    @SerializedName("strDescriptionNO")
    var strDescriptionNO: Any?,
    @SerializedName("strDescriptionIL")
    var strDescriptionIL: Any?,
    @SerializedName("strDescriptionPL")
    var strDescriptionPL: Any?,
    @SerializedName("strGender")
    var strGender: String?,
    @SerializedName("strCountry")
    var strCountry: String?,
    @SerializedName("strTeamBadge")
    var strTeamBadge: String?,
    @SerializedName("strTeamJersey")
    var strTeamJersey: String?,
    @SerializedName("strTeamLogo")
    var strTeamLogo: Any?,
    @SerializedName("strTeamFanart1")
    var strTeamFanart1: Any?,
    @SerializedName("strTeamFanart2")
    var strTeamFanart2: Any?,
    @SerializedName("strTeamFanart3")
    var strTeamFanart3: Any?,
    @SerializedName("strTeamFanart4")
    var strTeamFanart4: Any?,
    @SerializedName("strTeamBanner")
    var strTeamBanner: Any?,
    @SerializedName("strYoutube")
    var strYoutube: String?,
    @SerializedName("strLocked")
    var strLocked: String?
)
