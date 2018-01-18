package com.project.emailservice.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")

public class MessageServiceV1 {


    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ResponseEntity newMessage(String s) throws IOException {

        String body = "Ok";
        return ResponseEntity.ok().body(body);
    }
}


