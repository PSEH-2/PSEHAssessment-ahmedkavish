package com.sapient.football.football.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Players {

    @JsonProperty("player_key")
    private long playerKey;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("player_number")
    private String playerNumber;
    @JsonProperty("player_country")
    private String playerCountry;
    @JsonProperty("player_type")
    private String playerType;
    @JsonProperty("player_age")
    private String playerAge;
    @JsonProperty("player_match_played")
    private String playerMatchPlayed;
    @JsonProperty("player_goals")
    private String playerGoals;
    @JsonProperty("player_yellow_cards")
    private String playerYellowCards;
    @JsonProperty("player_red_cards")
    private String playerRedCards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
