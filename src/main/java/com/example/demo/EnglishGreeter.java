package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreeter implements Greeter {
    @Override
    public String greet() {
        return "Hello";
    }
}
