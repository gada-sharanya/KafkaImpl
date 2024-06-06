package com.sharanyag.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	//its a kafka template including kafka topic name and message i.e., String,String
	
	public void sendMessage(String message) {
		kafkaTemplate.send("Sharanya_Topic",message);
	}
}
