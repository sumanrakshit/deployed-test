package com.testcicd.cicd.service;

import org.springframework.stereotype.Service;

@Service
public class DeployedExm {
    public  String getMessage()
    {
        return "First ci cd pipeline example";
    }
}
