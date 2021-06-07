package practice;

class Circle
{
	int radius;
	Circle(int r)
	{
		radius=r;
	}
	void area()
	{
		double area;
		
		area=3.14*radius*radius;
		System.out.println("area of circle"+area);
	}
}

public class third {

	public static void main(String[] args) {
		Circle obj=new Circle(10);
		obj.area();

	}

}
