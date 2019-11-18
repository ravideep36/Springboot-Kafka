package com.example.springbootkafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "test-topic";
	
	public void send(String msg) {
		kafkaTemplate.send(kafkaTopic, msg);
	}

}
