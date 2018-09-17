package com.poc.controller;

import com.poc.service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendController {

    @Autowired
    private Client client;

    @RequestMapping("/api/frontend")
    public String getData() {
        return " Welcome frontend " + client.getResponse();
    }

}
