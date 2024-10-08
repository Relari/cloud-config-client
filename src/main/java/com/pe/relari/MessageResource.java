package com.pe.relari;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(path = "/v1/client")
public class MessageResource {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/message")
    public String sayHello() {
        return message;
    }
}
