package com.clima.crudapplication.controller;

import com.clima.crudapplication.service.MockService;
import com.clima.crudapplication.service.SecondBeanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final MockService mockService;
    private final SecondBeanService secondBeanService;

    @GetMapping("/mock")
    public Map<String, String> mockMethod() {
        return mockService.mockMethod();
    }

    @GetMapping("/second-mock")
    public Map<String, String> secondMockMethod() {
        return secondBeanService.mockMethod();
    }

}
