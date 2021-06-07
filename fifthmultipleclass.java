package practice;

class Circlez
{
	double r,a,b;
	Circlez(int x)
	{
		r=x;
	}
	double area()
	{
		a=3.14*r*r;
		return a;
	}
	double circumference()
	{
		b=2*3.14*r;
		return b;
	}
	
	
}
class Rectanglez
{
	double c,d,length,breadth;
	double area()
	{
		c=length*breadth;
		return c;
	}
	double circumference()
	{
		d=2*(length+breadth);
		return d;
	}
	Rectanglez(int x,int y)
	{
		length=x;
		breadth=y;
	}
}

public class fifthmultipleclass {

	public static void main(String[] args) {
		Circlez c=new Circlez(5);
		//double o=c.area();
		System.out.println(c.area());
		System.out.println(c.circumference());
        Rectanglez z=new Rectanglez(2,4);
        System.out.println(z.area());
        System.out.println(z.circumference());
	}

}
