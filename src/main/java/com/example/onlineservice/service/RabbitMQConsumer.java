package com.example.onlineservice.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.onlineservice.model.Employee;
import com.example.onlineservice.repository.EmployeeRepository;

@Service
public class RabbitMQConsumer {

	@Autowired
	MongoTemplate mongoTemplate;

	@RabbitListener(queues = "${onlineservice.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Received Message From RabbitMQ: " + employee);
		mongoTemplate.save(employee);
		System.out.println("Inserted employee into MongoDB: " + employee);
	}
}
