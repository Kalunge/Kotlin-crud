package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/welcome")
class TestController {

    @GetMapping
    fun welcome(): String {
        return "Welcome to my kotlin API"
    }
}