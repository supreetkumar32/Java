package practice;
//Super keyword is a reference variable which is used to refer immediate parent class members.
class Animala
{
	String color="white";
}
class Doga extends Animala
{
	String color="black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Superclass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Doga d=new Doga();
         d.printcolor();
	}

}
