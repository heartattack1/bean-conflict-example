package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreeterUser {
    private final Greeter greeter;

    public GreeterUser(Greeter greeter) {
        this.greeter = greeter;
    }

    public String message() {
        return greeter.greet();
    }
}
