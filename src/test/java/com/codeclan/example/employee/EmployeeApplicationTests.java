package com.codeclan.example.employee;

import com.codeclan.example.employee.models.Employee;
import com.codeclan.example.employee.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void CREmployee() {
		Employee employee = new Employee("Alison Babington", 25, "AD15", "abab@company.com");
		employeeRepository.save(employee);
	}

}
