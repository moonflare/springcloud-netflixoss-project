package com.project.emailservice.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/v1/message/")

public class MessageServiceV1 {


    @RequestMapping(value="/new", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity newMessage() throws IOException {

        String body = "Ok";
        return ResponseEntity.ok().body(body);
    }
}


