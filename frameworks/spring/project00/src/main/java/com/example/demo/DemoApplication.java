package com.example.demo;

import org.springframework.boot.SpringApplication; //per avviare l'applicaizone
import org.springframework.boot.autoconfigure.SpringBootApplication; //per funzionalità di springboot

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication //Questa è la classe principale dell'app. Fai partire tutto da qui
public class DemoApplication 
{
    public static void main(String[] args)
    {
        /*SpringApplication.run(...):
            1. Avvia il framework Spring
            2. Scansiona il pacchetto com.example.demo e i suoi sottopacchetti
            3. Crea gli oggetti (@Component, @Service, ecc.)
            4. Avvia il web server (se c’è un'app web)*/
        SpringApplication.run(DemoApplication.class, args); //gli passo anche la classe da cui partire e gli argomenti

   


    }

//     @Bean
// public CommandLineRunner run(Car car) {
//     return args -> {
//         car.drive();
//     };
//}


}