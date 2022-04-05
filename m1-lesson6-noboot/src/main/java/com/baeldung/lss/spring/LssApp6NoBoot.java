package com.baeldung.lss.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LssApp6NoBoot {

    public static void main(String[] args){
        SpringApplication.run(new Class[] { LssApp6NoBoot.class}, args);
    }
}
