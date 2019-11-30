package com.example.onlineservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineservice.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

	//public Employee findByEmpName(String empName);
}
