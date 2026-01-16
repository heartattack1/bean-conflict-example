package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DutchGreeter implements Greeter {
    @Override
    public String greet() {
        return "Hallo";
    }
}
