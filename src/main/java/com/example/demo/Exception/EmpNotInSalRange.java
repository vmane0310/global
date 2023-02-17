package com.example.demo.Exception;

public class EmpNotInSalRange extends RuntimeException
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public EmpNotInSalRange(String msg)
   {
	   super(msg);
   }
}
