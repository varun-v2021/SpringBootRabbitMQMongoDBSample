package com.example.onlineservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineservice.model.Employee;
import com.example.onlineservice.repository.EmployeeRepository;
import com.example.onlineservice.service.RabbitMQSender;


@RestController
@RequestMapping(value = "/onlineservice-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;
	
	//@Autowired
	//EmployeeRepository employeeRepository;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
	
	Employee emp=new Employee();
	emp.setEmpId(empId);
	emp.setEmpName(empName);
	rabbitMQSender.send(emp);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/swagger-sample")
	public String sayHello() {
		return "Swagger Hello World";
	}

}
