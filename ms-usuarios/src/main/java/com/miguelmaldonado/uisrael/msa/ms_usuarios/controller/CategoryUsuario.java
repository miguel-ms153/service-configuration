package com.miguelmaldonado.uisrael.msa.ms_usuarios.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/types")
@RefreshScope
public class CategoryUsuario {

        @Value("${app.testProp}")
        private String testProp;

        @GetMapping("test-prop")
        public String getTestProp() {
            return this.testProp;
        }
}
