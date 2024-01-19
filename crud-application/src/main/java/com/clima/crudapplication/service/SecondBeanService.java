package com.clima.crudapplication.service;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SecondBeanService {

    public Map<String, String> mockMethod() {
        return Map.of("test", "hello from second controller");
    }

}
