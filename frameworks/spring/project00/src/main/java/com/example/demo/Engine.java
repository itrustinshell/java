package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public String start() {
        return "Motore acceso!";
    }
}