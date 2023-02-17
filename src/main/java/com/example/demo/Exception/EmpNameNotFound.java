package com.example.demo.Exception;

public class EmpNameNotFound extends RuntimeException
{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmpNameNotFound(String msg)
     {
    	 super(msg);
    	 
     }
}
