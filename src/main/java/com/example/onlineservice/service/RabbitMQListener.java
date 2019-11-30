package com.example.onlineservice.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("Consuming Message - " + new String(message.getBody()));
		
	}

}
