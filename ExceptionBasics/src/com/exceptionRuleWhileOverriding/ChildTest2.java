package com.exceptionRuleWhileOverriding;

public class ChildTest2 extends Parent2{
	public void msg()throws ArithmeticException{  
		    System.out.println("child");  
		  }  
	
	
		  public static void main(String args[]){  
		   Parent2 p=new ChildTest2();  
		   p.msg();  
		  } 
}
