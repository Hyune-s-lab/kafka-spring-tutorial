package com.example.kafkaspringtutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaSpringTutorialApplication

fun main(args: Array<String>) {
    runApplication<KafkaSpringTutorialApplication>(*args)
}
