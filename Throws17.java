package practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
	void readFile() throws FileNotFoundException  //ye exception la sakta hai
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException
	{
		String txt="this is demo";
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
	}
}
public class Throws17 {

	public static void main(String[] args) {
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
		   rw.readFile();	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
   System.out.println("Supreet");
	}

}
