package fileoperation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class file2 
{
	public static void main(String[] args) 
	{
		File f1 = new File("E:\\Eclipse\\demo2.txt");
		FileWriter fileWriter = null;
		try 
		{
		fileWriter = new FileWriter(f1);
		f1.createNewFile();
		fileWriter.write("file is created using file write class \n");
		fileWriter.write("thank you...");
		fileWriter.flush();
		}
		catch (IOException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fileWriter.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
