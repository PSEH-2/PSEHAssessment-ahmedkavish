package com.sapient.football.football.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Teams {

    @JsonProperty("team_key")
    private String teamKey;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonProperty("players")
    private Players[] players;
    @JsonProperty("coaches")
    private Coaches[] coaches;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
