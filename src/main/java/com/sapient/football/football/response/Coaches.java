package com.sapient.football.football.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Coaches {

    @JsonProperty("coach_name")
    private String coachName;
    @JsonProperty("coach_country")
    private String coachCountry;
    @JsonProperty("coach_age")
    private String coachAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
