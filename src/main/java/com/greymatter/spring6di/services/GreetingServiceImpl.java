package com.greymatter.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello a todos desde el Service";
    }
}
