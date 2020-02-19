package com.sapient.football.football;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.sapient.football.football.request.Request;
import com.sapient.football.football.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AppService implements Service {

    @Autowired
    RestTemplate restTemplate;

    @Value("${footall.service.url}")
    private String footballServiceURL;


    @Override
    public FinalResponse getTeamStandings(Request json) throws JsonProcessingException {

        String leagueId = "";
        String countryId ="";
        //call Country API to get league ID
        ResponseEntity<Country[]> countryResponse =
                restTemplate.getForEntity(footballServiceURL + "?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978",
                        Country[].class);
        for (Country country : countryResponse.getBody()) {
           countryId = country.getCountryId();
        }
        //Integer countryId =  countryResponse.getBody().getCountryId();
        //call league API to get teams details
        ResponseEntity<League[]> leagueResponse =
                restTemplate.exchange(footballServiceURL + "?action=get_leagues&country_id=" + countryId + "&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", HttpMethod.GET, getObjectHttpEntity(), League[].class);
        //call teams API to get details
        for (League league : leagueResponse.getBody()) {
            leagueId = league.getLeagueId();
        }
        ResponseEntity<Teams[]> teamsResponse =
                restTemplate.exchange(footballServiceURL + "?action=get_teams&league_id=" + leagueId + "&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", HttpMethod.GET, getObjectHttpEntity(), Teams[].class);

        ResponseEntity<Standings[]> standingsResponse =
                restTemplate.exchange(footballServiceURL + "?action=get_standings&league_id=149&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", HttpMethod.GET, getObjectHttpEntity(), Standings[].class);

        /*ResponseEntity<Standings> standingsResponse = restTemplate.getForEntity(footballServiceURL+"?action=get_standings&league_id=149&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978",
                Standings.class);*/

        return findRankOfTeam(countryResponse.getBody(), leagueResponse.getBody(), teamsResponse.getBody(), standingsResponse.getBody());
    }

    private HttpEntity<Object> getObjectHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return new HttpEntity<>(headers);
    }

    private FinalResponse findRankOfTeam(Country[] countryResponse, League[] leagueResponse, Teams[] teamsResponse, Standings[] standingsResponse) throws JsonProcessingException {
        FinalResponse response = new FinalResponse();
        for (Country country : countryResponse) {
            response.setCountryId(country.getCountryId());
            response.setCountryName(country.getCountryName());
        }
        for (League league : leagueResponse) {
            response.setLeagueId(league.getLeagueId());
            response.setLeagueName(league.getLeagueName());
        }
        for (Teams teams : teamsResponse) {
            response.setTeamId(teams.getTeamKey());
            response.setTeamName(teams.getTeamName());
        }
        for (Standings standing : standingsResponse) {
            response.setOverAllLeaguePosition(standing.getOverallLeaguePosition());
        }

        return response;
    }

}
