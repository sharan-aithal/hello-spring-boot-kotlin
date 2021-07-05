package io.aithal.hellospringbootkotlin

import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController

@GetMapping("/hello")
fun hello() : String {
	return "Hello"
}