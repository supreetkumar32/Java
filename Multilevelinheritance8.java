package practice;

//multilevel inheritance

class Student
{
	int roll;
	void getroll(int x)
	{
		roll=x;
	}
	void putroll()
	{
		System.out.println("roll number"+roll);
	}
}
class Test extends Student
{
	int m1,m2;
	void getmark(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void putmark()
	{
		System.out.println("test1:" +m1);
		System.out.println("test2:" +m2);
	}
}
class Result extends Test
{
	int total;
	void display()
	{
		putroll();
		putmark();
		total=m1+m2;
		System.out.println("total"+total);
	}
}
public class Multilevelinheritance8 {

	public static void main(String[] args) {
		
			Result obj=new Result();
			obj.getroll(101);
			obj.getmark(80, 85);
			obj.display();

	}

}
