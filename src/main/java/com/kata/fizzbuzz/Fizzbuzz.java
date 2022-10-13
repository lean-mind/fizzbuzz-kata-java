package com.kata.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Fizzbuzz {

    public static void main(String[] args) {
        SpringApplication.run(Fizzbuzz.class, args);
    }

    public static List<String> stage1(int number) {
        return Collections.singletonList("1");
    }

    public static List<String> stage2(int number) {
        return Collections.singletonList("1");
    }
}
