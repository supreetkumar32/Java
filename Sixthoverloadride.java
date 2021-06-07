package practice;
// In method overloading, more than one method shares the same method name with different signature in the
//class. In method overloading, return type can or can not be be same, but we must have to change the parameter
//because in java, we can not achieve the method overloading by changing only the return type of the method.

public class Sixthoverloadride {
	 
		   static int add(int a, int b)
		   {
			   return a+b;
		   }  
		   static int add(int a, int b, int c)
		   {
			   return a+b+c;
		   }  
		 
		    public static void main(String args[]) {
		      System.out.println(add(4, 6));
		      System.out.println(add(4, 6, 7));
		    
		} 
}

//Method Overriding is a Run time polymorphism. In method overriding, derived class provides the specific
//implementation of the method that is already provided by the base class or parent class. In method overriding,
//return type must be same or co-variant

class Animal{  
    void eat()
    {
    	System.out.println("eating.");
    }  
    }  
  class Dog extends Animal{  
  void eat()
  {
	  System.out.println("Dog is eating.");
   }  
   }  
 class MethodOverridingEx{  
  public static void main(String args[]) {
    Dog d1=new Dog();
    Animal a1=new Animal();
    d1.eat();
    a1.eat();
  }
} 
