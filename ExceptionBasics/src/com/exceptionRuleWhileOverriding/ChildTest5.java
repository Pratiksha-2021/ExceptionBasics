package com.exceptionRuleWhileOverriding;



public class ChildTest5 extends Parent5{
	
	void msg()
	{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent5 p=new ChildTest5();  
	   
	 //  p.msg();
	   try{  
	   p.msg();  
	   }catch(Exception e){
		   
	   }  
	  } 

}
