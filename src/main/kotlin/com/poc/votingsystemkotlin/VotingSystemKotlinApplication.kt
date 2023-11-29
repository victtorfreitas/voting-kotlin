package com.poc.votingsystemkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VotingSystemKotlinApplication

fun main(args: Array<String>) {
	runApplication<VotingSystemKotlinApplication>(*args)
}
