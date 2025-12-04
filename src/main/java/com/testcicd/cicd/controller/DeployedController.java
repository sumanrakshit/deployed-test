package com.testcicd.cicd.controller;

import com.testcicd.cicd.service.DeployedExm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeployedController {
    private DeployedExm deployedExm;

    @Autowired
    public DeployedController(DeployedExm deployedExm)
    {
        this.deployedExm=deployedExm;
    }


    @GetMapping
    public ResponseEntity<?> getMessage()
    {
        try
        {
            return new ResponseEntity<>(deployedExm.getMessage(),HttpStatus.OK);

        }catch (Exception ex)
        {
            return  new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
}
