package com.example.demo.Exception;

public class EmpNotFoundException extends RuntimeException
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public EmpNotFoundException(String msg)
  {
	  super(msg);
  }
}
