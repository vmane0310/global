package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface ServiceInt 
{
   public List<Employee> getMyEmployees();
   public Optional<Employee> getMyEmp(Integer eid);
   public Employee addMyEmployee(Employee e);
   public Employee findempbyname(String name);
   public List<Employee> findByEsal();
   List<Employee> findByEloc(String eloc);
   
}
