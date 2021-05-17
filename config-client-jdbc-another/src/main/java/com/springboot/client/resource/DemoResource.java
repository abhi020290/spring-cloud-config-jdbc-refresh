package com.springboot.client.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RefreshScope
public class DemoResource {


    @Value("${dummy.message:dummy}")
    private String dummyMessage;

    @Value("${welcome.message:welcome}")
    private String welcomeMessage;

    @GetMapping
    public String dummyMessage() {
        return this.dummyMessage;
    }

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return this.welcomeMessage;
    }

}


