package com.slmanju.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Properties;

public class Consumer {

  private static Logger LOGGER = LoggerFactory.getLogger(ProducerCallback.class);

  public static void main(String[] args) {
    String bootstrapServers = "127.0.0.1:9092";
    String groupId = "first_topic";

    // create consumer properties
    Properties properties = new Properties();
    properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
    properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

    // create consumer
    KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(properties);

    // poll data
    while (true) {
      ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofMillis(100));
      consumerRecords.forEach(consumerRecord -> {
        LOGGER.info("Key: " + consumerRecord.key());
        LOGGER.info("Value: " + consumerRecord.value());
        LOGGER.info("Partition: " + consumerRecord.partition());
        LOGGER.info("Offset: " + consumerRecord.offset());
      });
    }
  }

}
