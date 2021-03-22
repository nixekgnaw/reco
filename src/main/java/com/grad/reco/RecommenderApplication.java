package com.grad.reco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.grad.reco"})
public class RecommenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecommenderApplication.class, args);
    }

}
