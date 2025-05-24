package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final Car car;

    public CarController(Car car) {
        this.car = car;
    }

    @GetMapping("/drive")
    public void drive() {
        car.drive();
    }
}
