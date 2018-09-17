package com.poc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

@ComponentScan("com.poc")
@SpringBootApplication
public class FrontendApplication {
    public static void main(String[] args) {
        run(FrontendApplication.class, args);
    }
}
