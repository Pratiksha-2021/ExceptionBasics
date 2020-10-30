package co.exception;

public class ExceptionWithMulticatch{
	//only one catch shoud be executed at a time
	public static void multicatch(){
	 try{    
         String s=null;  
         System.out.println(s.length());  
        }    
        catch(ArithmeticException e1)  
           {  
            System.out.println("Arithmetic Exception occurs");  
           }    
        catch(ArrayIndexOutOfBoundsException e2)  
           {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }    
        catch(Exception e3)  
           {  
            System.out.println("Parent Exception occurs");  
           }             
        System.out.println("rest of the code");    
}  
	public static void main(String[] args) {
		
		ExceptionWithMulticatch.multicatch();
	}
}  



