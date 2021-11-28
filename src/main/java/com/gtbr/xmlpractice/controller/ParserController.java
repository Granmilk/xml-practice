package com.gtbr.xmlpractice.controller;

import com.gtbr.xmlpractice.model.User;
import com.gtbr.xmlpractice.service.ParserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/parser")
public class ParserController {

    private final ParserService parserService;

    @GetMapping
    public ResponseEntity<User> getUser() throws IOException {
        return ResponseEntity.ok(parserService.parseUser());
    }

}
