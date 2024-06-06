package com.sharanyag.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	@KafkaListener(topics = "Sharanya_Topic",groupId = "Sharanya_group")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message received is "+ receivedMessage);
	}
}
