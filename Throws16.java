package practice;
import java.util.Scanner;

//throw keyword is used inside the method
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}


public class Throws16 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		try
		{
		if(age<18)
		{
			throw new YoungerAgeException("you ar enot eligible for voting");
		}
		else
		{
			System.out.println("you can vote successfully");
		}

	}
		catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
}
}
