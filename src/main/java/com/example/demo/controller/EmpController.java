package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.EmpNotFoundException;
import com.example.demo.Exception.EmpNotInSalRange;
import com.example.demo.model.Employee;
import com.example.demo.service.ServiceInt;

@RestController
@RequestMapping("/api")
public class EmpController 
{
	
   @Autowired
   ServiceInt s;
   
   
   
   
   @GetMapping("/getAllEmp")
   public ResponseEntity<List<Employee>> getallemp()
   {
	   List<Employee> el=s.getMyEmployees();
	   return new ResponseEntity<List<Employee>>(el,HttpStatus.OK);
   }
   
   @PostMapping("/addEmp")
   public ResponseEntity<Employee> addEmp(@RequestBody Employee e)
   {
	   Employee emp=s.addMyEmployee(e);
	   return new ResponseEntity<Employee>(emp,HttpStatus.OK);
   }
   
   @GetMapping("/getEmpByid/{eid}")
   public ResponseEntity<Employee> getbyid(@PathVariable Integer eid)
   {
	   Optional<Employee> op=s.getMyEmp(eid);
	   if (op.isPresent())
	   {
		   Employee emp=op.get();
	   return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	   }
	   else
		   throw new EmpNotFoundException("Employee not present in the database");
   }
   
   @GetMapping("/getEmpByName/{ename}")
   public ResponseEntity<Employee> getbyid(@PathVariable String ename)
   {
	   Employee op=s.findempbyname(ename);
	   if (op!=null)
	   {
		   
	   return new ResponseEntity<Employee>(op,HttpStatus.CREATED);
	   }
	   else
		   throw new EmpNotFoundException("Employee with that name not present in the database");
   }
   
   @GetMapping("/getEmpByLoc/{eloc}")
   public ResponseEntity<List<Employee>> getbysal(@PathVariable String eloc)
   {
	   List<Employee> sl=s.findByEloc(eloc);
	   System.out.println(sl);
	   
	   
	   if (sl!=null && !sl.isEmpty())
	   {
		   
	   return new ResponseEntity<List<Employee>>(sl,HttpStatus.OK);
	   }
	   else
		   throw new EmpNotInSalRange("Employee not present in the given salary range");
   }
}
