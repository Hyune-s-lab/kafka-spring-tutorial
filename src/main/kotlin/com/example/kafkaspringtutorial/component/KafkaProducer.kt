package com.example.kafkaspringtutorial.component

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {
    fun sendMessage(message: String) {
        kafkaTemplate.send("test-topic", message)
            .addCallback(
                { log.info("### produce success={}", message) }
            ) { log.error("### produce failed", it) }
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
    }
}
