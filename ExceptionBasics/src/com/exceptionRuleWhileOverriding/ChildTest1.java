package com.exceptionRuleWhileOverriding;

import java.io.IOException;

public class ChildTest1 extends Parent1 {
/*	1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the 
checked exception.*/
	
/*	void msg()throws IOException{  
	    System.out.println("TestExceptionChild");  
	  }  */
	
	
	public static void main(String args[]){  
		   Parent1 p=new ChildTest1();  
		   p.msg();  
		  }  
	
	
	
	
	
	
}
