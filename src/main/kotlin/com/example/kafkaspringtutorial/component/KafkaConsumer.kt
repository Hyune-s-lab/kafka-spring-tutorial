package com.example.kafkaspringtutorial.component

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {
    @KafkaListener(topics = [topic], groupId = "test-group-id")
    fun receive(consumerRecord: ConsumerRecord<String?, String>) {
        log.info("### consume record: '{}'", consumerRecord.toString())
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
        private const val topic = "test-topic"
    }
}
