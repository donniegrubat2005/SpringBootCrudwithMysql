package com.example.SpringBootCrudwithMysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootCrudwithMysql.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
