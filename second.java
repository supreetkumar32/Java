package practice;

class Rectangle{
	int length,width,result;
	Rectangle(int x,int y)
	{
		length=x;
		width=y;
	}
	void area()
	{
		result=length*width;
		System.out.println("arae of rectangle "+result);
	}
}

public class second {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle(10,20);
         obj.area();
	}

}
