package practice;
import java.util.*;
public class Finally18 {

	public static void main(String[] args) {
		   
			  try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e)
			  {
				  System.out.println(e);
			  }  
			  finally
			  {
				  System.out.println("finally block is always executed");
			   }  
			  System.out.println("rest of the code...");  
			  } 

	}


