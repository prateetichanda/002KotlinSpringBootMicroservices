package com.kotlin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.boot.SpringApplication

@SpringBootApplication
@EnableEurekaServer

open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
	//SpringApplication.run(Application::class,*args)
	println("hello")
}
