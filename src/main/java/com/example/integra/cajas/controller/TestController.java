package com.example.integra.cajas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hola desde la API.";
    }
}
