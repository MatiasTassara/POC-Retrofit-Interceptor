package com.example.demo

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}


