package practice;
//inheritance
class A
{
	int x,y;
	void getdata(int a,int b)
	{
		x=a;
		y=b;
	}
	int add()
	{
		System.out.println("super class method");
		return(x+y);
		}
}
class B extends A
{
	int mult()
	{
		System.out.println("sub class method");
		return(x*y);
	}
}
public class Seveninheritance {
	public static void main(String[] args) {
		B obj=new B();
		//int add,mult;
		obj.getdata(5, 3);
		int add=obj.add();
		 int mult=obj.mult();
		System.out.println("Addition"+add);
		System.out.println("Multiplication"+mult); 

	}

}
