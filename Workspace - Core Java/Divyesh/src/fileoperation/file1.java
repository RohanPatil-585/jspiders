package fileoperation;
import java.io.File;
import java.io.IOException;
public class file1
{
	public static void main(String[] args) 
	{
		File f1=new File("E:\\Eclipse\\demo1.txt"); 
		File f2=new File("E:\\Eclipse\\music");
		
		try {
			f2.mkdir();
			f1.createNewFile();
			String path=f1.getAbsolutePath();
			System.out.println(path);
			System.out.println("read permision="+f1.canRead());
			System.out.println("read permision="+f1.canExecute());
			System.out.println("read permision="+f1.canWrite());
			f1.delete();
			f2.delete();
			
			
			
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
