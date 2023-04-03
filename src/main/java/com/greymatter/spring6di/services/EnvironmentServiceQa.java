package com.greymatter.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQa implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "QA";
    }
}
