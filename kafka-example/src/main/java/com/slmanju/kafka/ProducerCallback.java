package com.slmanju.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Properties;

public class ProducerCallback {

  private static Logger LOGGER = LoggerFactory.getLogger(ProducerCallback.class);

  public static void main(String[] args) {
    String bootstrapServers = "127.0.0.1:9092";

    // create producer properties
    Properties properties = new Properties();
    properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

    // create producer
    KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);

    // send data
    ProducerRecord<String, String> producerRecord = new ProducerRecord<>("first_topic", "key_1", "Hello World");
    kafkaProducer.send(producerRecord, (metadata, exception) -> {
      if (Objects.isNull(exception)) {
        LOGGER.info("Topic: " + metadata.topic());
        LOGGER.info("Partition " + metadata.partition());
        LOGGER.info("Offset " + metadata.offset());
        LOGGER.info("Timestamp " + metadata.timestamp());
      } else {
        LOGGER.error("Error while producing data.", exception);
      }
    });

    // close
    kafkaProducer.close();
  }

}
