package com.sapient.football.football;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sapient.football.football.request.Request;
import com.sapient.football.football.response.FinalResponse;

public interface Service {
    FinalResponse getTeamStandings(Request json) throws JsonProcessingException;
}
