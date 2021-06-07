package practice;

class Apple
{
	int num1,num2,num3;
	Apple(int x,int y)
	{
		num1=x;
		num2=y;
		
	}
	void multiply()
	{
		num3=num1*num2;
		System.out.println(num3);
	}
	void add()
	{
		num3=num1+num2;
		System.out.println(num3);
	}
	void substract()
	{
		num3=num1-num2;
		System.out.println(num3);
	}
}

public class fourth {

	public static void main(String[] args) {
		Apple obj=new Apple(20,10);
		obj.multiply();
		obj.add();
		obj.substract();

	}

}
