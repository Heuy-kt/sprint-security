package com.example.sprintsecurityapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/balance")
    public ResponseEntity<String> balance(){
        return new ResponseEntity<String>("Welcome to balance pabe", HttpStatus.OK);
    }
}
