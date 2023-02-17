package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer>
{
	//@Query("SELECT u FROM Employee u WHERE u.ename = ?1 and u.name = ?2")
	//User findUserByStatusAndName(Integer status, String name);
	
	@Query("SELECT u FROM Employee u WHERE u.ename = ?1")
	Employee findEmployeeByEname(String ename);
	
	//@Query("SELECT * FROM tutorials t WHERE t.title LIKE %?1%")
	//List<Tutorial> findByTitleAndSort(String title, Sort sort);
	
	@Query("SELECT t FROM Employee t WHERE t.eloc LIKE %?1%")
	List<Employee> findByEloc(String eloc);
	
	@Query("SELECT t FROM Employee t WHERE t.esal>25000")
	List<Employee> findByEsal();
}
