package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Match {
    public static void getLastRateBySourceAndDest() {
        String url = "https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=1";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        Object res = response.getBody();
        System.out.println(res);
    }

    public static void main(String[] args) {
        getLastRateBySourceAndDest();
        goalsNumber("Barcelona", 2012);
    }

    public static void goalsNumber(String team, int year) {
        String url = "https://jsonmock.hackerrank.com/api/football_matches?year="+year+"&team1="+team+"&page=1";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        Object res = response.getBody();
        System.out.println(res);
    }

}
