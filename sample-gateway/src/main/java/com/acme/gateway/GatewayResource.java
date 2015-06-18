package com.acme.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayResource {
    @Autowired
    private SampleServiceProxy sampleServiceProxy;

    @RequestMapping(value = "/greeting")
    public String greeting() {
        return sampleServiceProxy.greeting();
    }
}
