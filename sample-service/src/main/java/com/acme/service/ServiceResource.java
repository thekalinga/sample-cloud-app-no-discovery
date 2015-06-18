package com.acme.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceResource {
    @RequestMapping(value = "/greeting")
    public String greeting() {
        return "Hello you!!";
    }
}
