package org.example.bj_h_api;

import org.example.bj_h_api.Controller.GameController;
import org.example.bj_h_api.Model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BjHApiApplication {
    public static void main(String[] args) {
        new Data();
        SpringApplication.run(BjHApiApplication.class, args);
    }
}
