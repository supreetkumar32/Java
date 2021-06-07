package practice;

public class Trycatch14 {

	public static void main(String[] args) {
		int a=8575;
		int b=0;
		try {
			int c=a/b;
			System.out.println("the result is "+c);
		}
		catch(Exception e)
		{
			System.out.println("We failed to divide. Reason:");
			System.out.println(e);
		}

	}

}
