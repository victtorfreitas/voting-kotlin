package com.poc.votingsystemkotlin.controlles

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class VoteController {

    @GetMapping("/hello-word")
    fun index() = "fabia isabela"

    @GetMapping("/")
    fun index(@RequestParam name: String) = "Hello, $name"
}