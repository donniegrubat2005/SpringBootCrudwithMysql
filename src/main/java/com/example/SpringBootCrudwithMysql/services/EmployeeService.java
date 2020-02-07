package com.example.SpringBootCrudwithMysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBootCrudwithMysql.model.Employee;
import com.example.SpringBootCrudwithMysql.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> listAll() {
		return empRepo.findAll();
	}
	
	public Employee getById(Long id) {
		return empRepo.findById(id).get();
		
	}
	
	public void save(Employee emp) {
		empRepo.save(emp);
	}
	
	public void delete(long id) {
		empRepo.deleteById(id);
    }
	
}
