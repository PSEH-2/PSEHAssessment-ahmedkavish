package com.sapient.football.football;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sapient.football.football.request.Request;
import com.sapient.football.football.response.FinalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    Service service;

    @PostMapping("v1/teamStandings")
    public FinalResponse getTeamStandings(@RequestBody Request jsonRequest) throws JsonProcessingException {
        return service.getTeamStandings(jsonRequest);
    }
}
