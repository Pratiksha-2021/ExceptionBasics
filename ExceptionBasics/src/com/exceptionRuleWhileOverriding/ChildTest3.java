package com.exceptionRuleWhileOverriding;
public class ChildTest3 extends Parent3 {
	
	// void msg()throws Exception
	 {System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent3 p=new ChildTest3();  
	  
	   try{  
		   p.msg();  
		   }catch(Exception e){}  
	     

}
}