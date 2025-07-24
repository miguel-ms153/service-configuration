package com.mamm.msa.booking_microservice.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/types")
@Data
@RefreshScope
public class TypeController {

    @Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    public String getTestProp() {
        return this.testProp;
    }
}
