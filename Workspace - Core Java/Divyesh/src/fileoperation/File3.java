package fileoperation;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.File;
import java.io.IOException;
public class File3 {
	public static void main(String[] args) 
	{
		FileReader freader=null;
		//File f1=new File("E:\\Eclipse\\demo2.txt");
		try {
			 freader=new FileReader("E:\\Eclipse\\demo2.txt");
			try {
				int x=freader.read();
				while(x!=-1)
				{
					char c=(char)x;
					System.out.print(c);
					x=freader.read();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			freader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
