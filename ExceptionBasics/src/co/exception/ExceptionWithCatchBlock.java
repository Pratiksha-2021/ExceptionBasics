package co.exception;

public class ExceptionWithCatchBlock {
	
	 public static void main(String[] args) {   
		    System.out.println("111");   
		    System.out.println("222");
		  try {
		    System.out.println("before divide");    
		      int a = 1 / 0; 
		    System.out.println("after divide");
		  } 
		  catch (Exception e) {  
		    System.out.println("I am in catch block");
		    }
		    System.out.println("333");   
		    System.out.println("444");
		   } 
		}


