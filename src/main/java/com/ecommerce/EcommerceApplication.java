package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {
    public static void main(String[] args) {
        System.out.println("E-commerce application started...");
        SpringApplication.run(EcommerceApplication.class, args);
    }
}
