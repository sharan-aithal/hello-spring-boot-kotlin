package io.aithal.hellospringbootkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSpringBootKotlinApplication

fun main(args: Array<String>) {
	runApplication<HelloSpringBootKotlinApplication>(*args)
}
