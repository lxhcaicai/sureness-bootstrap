package com.github.surenessbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SurenessBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SurenessBootstrapApplication.class, args);
    }

}
