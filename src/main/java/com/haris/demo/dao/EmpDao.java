package com.haris.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.haris.demo.model.Employee;

public interface EmpDao extends JpaRepository<Employee, Integer>
{

	Employee getEmpById(int id);
	
//	List<Employee> findByDesignation(String designation);
   

}
