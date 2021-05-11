package com.reytech.demo.paizaapi.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TaxiController {

    @GetMapping("/taxi")
    fun taxi(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World");
    }
}