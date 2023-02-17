package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class ServiceImpl implements ServiceInt
{
    @Autowired
    EmpRepository erepo;
    
	@Override
	public List<Employee> getMyEmployees() 
	{
		List<Employee> elist=erepo.findAll();
		return elist;
		
	}

	@Override
	public Optional<Employee> getMyEmp(Integer eid) 
	{
		Optional<Employee> e=erepo.findById(eid);
		
		return e;
	}

	@Override
	public Employee addMyEmployee(Employee e) 
	{
		Employee emp=erepo.save(e);
		return emp;
	}

	 @Override
	public Employee findempbyname(String name) 
	 {
		Employee e=erepo.findEmployeeByEname(name);
		return e;
	}
	 
	 @Override
	public List<Employee> findByEsal() 
	 {
		List<Employee> el=erepo.findByEsal();
		return null;
	}
	 
	 @Override
	public List<Employee> findByEloc(String eloc) 
	 {
		List<Employee> el=erepo.findByEloc(eloc);
		return el;
	}
	 
	 
}
