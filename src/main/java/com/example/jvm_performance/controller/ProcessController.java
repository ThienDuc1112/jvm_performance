package com.example.jvm_performance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

    @GetMapping("/process")
    public String processData() {
        long startTime = System.currentTimeMillis();

        String result = "";

        for (int i = 0; i < 150_000; i++) {
            result += " " + i;
        }

        long endTime = System.currentTimeMillis();

        return "Processing finished in " + (endTime - startTime)
                + "ms. Result length: " + result.length();
    }
}