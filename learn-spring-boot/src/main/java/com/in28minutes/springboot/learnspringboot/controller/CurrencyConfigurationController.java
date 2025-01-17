package com.in28minutes.springboot.learnspringboot.controller;

import com.in28minutes.springboot.learnspringboot.configuration.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllConfiguration(){
        return configuration;
    }
}


