package com.example.demo.Exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException 
{
    @ExceptionHandler(EmpNotFoundException.class)
    public ResponseEntity<ResponeError> empNotFoundHandler(EmpNotFoundException ex,HttpServletRequest request)
    {
    	ResponeError error=new ResponeError(new Date(),HttpStatus.NOT_FOUND.value(),ex.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
    	return new ResponseEntity<ResponeError>(error,HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(EmpNameNotFound.class)
    public ResponseEntity<ResponeError> empNameNotFoundHandler(EmpNameNotFound ex,HttpServletRequest request)
    {
    	ResponeError error=new ResponeError(new Date(),HttpStatus.NOT_FOUND.value(),ex.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
    	return new ResponseEntity<ResponeError>(error,HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(EmpNotInSalRange.class)
    public ResponseEntity<ResponeError> empSalNotFoundHandler(EmpNotInSalRange ex,HttpServletRequest request)
    {
    	ResponeError error=new ResponeError(new Date(),HttpStatus.NOT_FOUND.value(),ex.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
    	return new ResponseEntity<ResponeError>(error,HttpStatus.NOT_FOUND);
    }
}
