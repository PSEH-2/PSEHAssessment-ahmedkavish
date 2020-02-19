package com.sapient.football.football.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class Standings {

    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("overall_promotion")
    private String overallPromotion;
    @JsonProperty("overall_league_position")
    private String overallLeaguePosition;
    @JsonProperty("overall_league_payed")
    private String overallLeaguePayed;
    @JsonProperty("overall_league_W")
    private String overallLeagueW;
    @JsonProperty("overall_league_D")
    private String overallLeagueD;
    @JsonProperty("overall_league_L")
    private String overallLeagueL;
    @JsonProperty("overall_league_GF")
    private String overallLeagueGF;
    @JsonProperty("overall_league_GA")
    private String overallLeagueGA;
    @JsonProperty("overall_league_PTS")
    private String overallLeaguePTS;
    @JsonProperty("home_league_position")
    private String homeLeaguePosition;
    @JsonProperty("home_promotion")
    private String homePromotion;
    @JsonProperty("home_league_payed")
    private String homeLeaguePayed;
    @JsonProperty("home_league_W")
    private String homeLeagueW;
    @JsonProperty("home_league_D")
    private String homeLeagueD;
    @JsonProperty("home_league_L")
    private String homeLeagueL;
    @JsonProperty("home_league_GF")
    private String homeLeagueGF;
    @JsonProperty("home_league_GA")
    private String homeLeagueGA;
    @JsonProperty("home_league_PTS")
    private String homeLeaguePTS;
    @JsonProperty("away_league_position")
    private String awayLeaguePosition;
    @JsonProperty("away_promotion")
    private String awayPromotion;
    @JsonProperty("away_league_payed")
    private String awayLeaguePayed;
    @JsonProperty("away_league_W")
    private String awayLeagueW;
    @JsonProperty("away_league_D")
    private String awayLeagueD;
    @JsonProperty("away_league_L")
    private String awayLeagueL;
    @JsonProperty("away_league_GF")
    private String awayLeagueGF;
    @JsonProperty("away_league_GA")
    private String awayLeagueGA;
    @JsonProperty("away_league_PTS")
    private String awayLeaguePTS;
    @JsonProperty("league_round")
    private String leagueRound;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("league_id")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("league_name")
    public String getLeagueName() {
        return leagueName;
    }

    @JsonProperty("league_name")
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("overall_promotion")
    public String getOverallPromotion() {
        return overallPromotion;
    }

    @JsonProperty("overall_promotion")
    public void setOverallPromotion(String overallPromotion) {
        this.overallPromotion = overallPromotion;
    }

    @JsonProperty("overall_league_position")
    public String getOverallLeaguePosition() {
        return overallLeaguePosition;
    }

    @JsonProperty("overall_league_position")
    public void setOverallLeaguePosition(String overallLeaguePosition) {
        this.overallLeaguePosition = overallLeaguePosition;
    }

    @JsonProperty("overall_league_payed")
    public String getOverallLeaguePayed() {
        return overallLeaguePayed;
    }

    @JsonProperty("overall_league_payed")
    public void setOverallLeaguePayed(String overallLeaguePayed) {
        this.overallLeaguePayed = overallLeaguePayed;
    }

    @JsonProperty("overall_league_W")
    public String getOverallLeagueW() {
        return overallLeagueW;
    }

    @JsonProperty("overall_league_W")
    public void setOverallLeagueW(String overallLeagueW) {
        this.overallLeagueW = overallLeagueW;
    }

    @JsonProperty("overall_league_D")
    public String getOverallLeagueD() {
        return overallLeagueD;
    }

    @JsonProperty("overall_league_D")
    public void setOverallLeagueD(String overallLeagueD) {
        this.overallLeagueD = overallLeagueD;
    }

    @JsonProperty("overall_league_L")
    public String getOverallLeagueL() {
        return overallLeagueL;
    }

    @JsonProperty("overall_league_L")
    public void setOverallLeagueL(String overallLeagueL) {
        this.overallLeagueL = overallLeagueL;
    }

    @JsonProperty("overall_league_GF")
    public String getOverallLeagueGF() {
        return overallLeagueGF;
    }

    @JsonProperty("overall_league_GF")
    public void setOverallLeagueGF(String overallLeagueGF) {
        this.overallLeagueGF = overallLeagueGF;
    }

    @JsonProperty("overall_league_GA")
    public String getOverallLeagueGA() {
        return overallLeagueGA;
    }

    @JsonProperty("overall_league_GA")
    public void setOverallLeagueGA(String overallLeagueGA) {
        this.overallLeagueGA = overallLeagueGA;
    }

    @JsonProperty("overall_league_PTS")
    public String getOverallLeaguePTS() {
        return overallLeaguePTS;
    }

    @JsonProperty("overall_league_PTS")
    public void setOverallLeaguePTS(String overallLeaguePTS) {
        this.overallLeaguePTS = overallLeaguePTS;
    }

    @JsonProperty("home_league_position")
    public String getHomeLeaguePosition() {
        return homeLeaguePosition;
    }

    @JsonProperty("home_league_position")
    public void setHomeLeaguePosition(String homeLeaguePosition) {
        this.homeLeaguePosition = homeLeaguePosition;
    }

    @JsonProperty("home_promotion")
    public String getHomePromotion() {
        return homePromotion;
    }

    @JsonProperty("home_promotion")
    public void setHomePromotion(String homePromotion) {
        this.homePromotion = homePromotion;
    }

    @JsonProperty("home_league_payed")
    public String getHomeLeaguePayed() {
        return homeLeaguePayed;
    }

    @JsonProperty("home_league_payed")
    public void setHomeLeaguePayed(String homeLeaguePayed) {
        this.homeLeaguePayed = homeLeaguePayed;
    }

    @JsonProperty("home_league_W")
    public String getHomeLeagueW() {
        return homeLeagueW;
    }

    @JsonProperty("home_league_W")
    public void setHomeLeagueW(String homeLeagueW) {
        this.homeLeagueW = homeLeagueW;
    }

    @JsonProperty("home_league_D")
    public String getHomeLeagueD() {
        return homeLeagueD;
    }

    @JsonProperty("home_league_D")
    public void setHomeLeagueD(String homeLeagueD) {
        this.homeLeagueD = homeLeagueD;
    }

    @JsonProperty("home_league_L")
    public String getHomeLeagueL() {
        return homeLeagueL;
    }

    @JsonProperty("home_league_L")
    public void setHomeLeagueL(String homeLeagueL) {
        this.homeLeagueL = homeLeagueL;
    }

    @JsonProperty("home_league_GF")
    public String getHomeLeagueGF() {
        return homeLeagueGF;
    }

    @JsonProperty("home_league_GF")
    public void setHomeLeagueGF(String homeLeagueGF) {
        this.homeLeagueGF = homeLeagueGF;
    }

    @JsonProperty("home_league_GA")
    public String getHomeLeagueGA() {
        return homeLeagueGA;
    }

    @JsonProperty("home_league_GA")
    public void setHomeLeagueGA(String homeLeagueGA) {
        this.homeLeagueGA = homeLeagueGA;
    }

    @JsonProperty("home_league_PTS")
    public String getHomeLeaguePTS() {
        return homeLeaguePTS;
    }

    @JsonProperty("home_league_PTS")
    public void setHomeLeaguePTS(String homeLeaguePTS) {
        this.homeLeaguePTS = homeLeaguePTS;
    }

    @JsonProperty("away_league_position")
    public String getAwayLeaguePosition() {
        return awayLeaguePosition;
    }

    @JsonProperty("away_league_position")
    public void setAwayLeaguePosition(String awayLeaguePosition) {
        this.awayLeaguePosition = awayLeaguePosition;
    }

    @JsonProperty("away_promotion")
    public String getAwayPromotion() {
        return awayPromotion;
    }

    @JsonProperty("away_promotion")
    public void setAwayPromotion(String awayPromotion) {
        this.awayPromotion = awayPromotion;
    }

    @JsonProperty("away_league_payed")
    public String getAwayLeaguePayed() {
        return awayLeaguePayed;
    }

    @JsonProperty("away_league_payed")
    public void setAwayLeaguePayed(String awayLeaguePayed) {
        this.awayLeaguePayed = awayLeaguePayed;
    }

    @JsonProperty("away_league_W")
    public String getAwayLeagueW() {
        return awayLeagueW;
    }

    @JsonProperty("away_league_W")
    public void setAwayLeagueW(String awayLeagueW) {
        this.awayLeagueW = awayLeagueW;
    }

    @JsonProperty("away_league_D")
    public String getAwayLeagueD() {
        return awayLeagueD;
    }

    @JsonProperty("away_league_D")
    public void setAwayLeagueD(String awayLeagueD) {
        this.awayLeagueD = awayLeagueD;
    }

    @JsonProperty("away_league_L")
    public String getAwayLeagueL() {
        return awayLeagueL;
    }

    @JsonProperty("away_league_L")
    public void setAwayLeagueL(String awayLeagueL) {
        this.awayLeagueL = awayLeagueL;
    }

    @JsonProperty("away_league_GF")
    public String getAwayLeagueGF() {
        return awayLeagueGF;
    }

    @JsonProperty("away_league_GF")
    public void setAwayLeagueGF(String awayLeagueGF) {
        this.awayLeagueGF = awayLeagueGF;
    }

    @JsonProperty("away_league_GA")
    public String getAwayLeagueGA() {
        return awayLeagueGA;
    }

    @JsonProperty("away_league_GA")
    public void setAwayLeagueGA(String awayLeagueGA) {
        this.awayLeagueGA = awayLeagueGA;
    }

    @JsonProperty("away_league_PTS")
    public String getAwayLeaguePTS() {
        return awayLeaguePTS;
    }

    @JsonProperty("away_league_PTS")
    public void setAwayLeaguePTS(String awayLeaguePTS) {
        this.awayLeaguePTS = awayLeaguePTS;
    }

    @JsonProperty("league_round")
    public String getLeagueRound() {
        return leagueRound;
    }

    @JsonProperty("league_round")
    public void setLeagueRound(String leagueRound) {
        this.leagueRound = leagueRound;
    }

    @JsonProperty("team_badge")
    public String getTeamBadge() {
        return teamBadge;
    }

    @JsonProperty("team_badge")
    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
