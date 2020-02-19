package com.sapient.football.football.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class League extends Country {

    @JsonProperty("league_id")
    private String leagueId;

    @JsonProperty("league_name")
    private String leagueName;

    @JsonProperty("league_season")
    private String leagueSeason;

    @JsonProperty("league_logo")
    private String leagueLogo;

}
