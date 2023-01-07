package com.example.kafkaspringtutorial.web

import com.example.kafkaspringtutorial.component.KafkaProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class KafkaMessageController(private val kafkaProducer: KafkaProducer) {
    @PostMapping(value = ["/sendMessage"])
    fun sendMessage(@RequestBody message: String) {
        kafkaProducer.sendMessage(message)
    }
}
