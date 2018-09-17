package com.poc.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Client {

    public String getResponse() {
        RestTemplate restTemplate = new RestTemplate();
        String url = System.getenv("EXPECTED_URI") + "/api/backend";
        System.out.println(url);
        ResponseEntity<String> response
                = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}
