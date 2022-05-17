package com.hf.test.infrastructure.dummy.inbound.controller;

import com.hf.test.application.dummy.inbound.ServiceExample;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class ExampleController {

    private final ServiceExample serviceExample;

    public ExampleController(ServiceExample serviceExample) {
        this.serviceExample = serviceExample;
    }

    @GetMapping(value = "/controller")

    public String exampleMethod() {
        return "Hello";
    }

    @GetMapping(value = "/test")
    public ResponseEntity test() throws ExecutionException, InterruptedException {

        return ResponseEntity.ok(serviceExample.obtenerChistes());
    }
}
