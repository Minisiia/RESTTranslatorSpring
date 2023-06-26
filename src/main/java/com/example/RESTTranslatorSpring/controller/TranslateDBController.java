package com.example.RESTTranslatorSpring.controller;

import com.example.RESTTranslatorSpring.service.TranslateDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateDBController {

    public TranslateDBService  translateDBService;
    @Autowired
    public TranslateDBController(TranslateDBService translateDBService) {
        this.translateDBService = translateDBService;
    }

    @GetMapping("/translator")
    public String doGet(@RequestParam("ukrainian_word") String ukrainianWord) {
        return translateDBService.translate(ukrainianWord);
    }
}
