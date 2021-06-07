package practice;

//hierarchical inheritance
class One
{
	int x,y;
     void value(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void putvalue()
	{
		System.out.println("method of class one");
		System.out.println("value of x"+x);
		System.out.println("value of y"+y);
	}
}
class Two extends One
{
	void add()
	{
		int s=x+y;
		System.out.println("method of class two");
		System.out.println("addition is:"+s);
	}
}
class Three extends One
{
	void mult()
	{
		int v=x*y;
	}
	void display1()
	{
		
		System.out.println("method of class three");
		System.out.println("multiplication is:"+x*y);
	}
}
public class Hierarchicalinheritance9 {
public static void main(String[] args) {
		
		One c=new One();
		c.value(10,20);
		Two a=new Two();
		Three b=new Three();
        c.putvalue();
        a.add();
        b.mult();
        b.display1();
	}

}
