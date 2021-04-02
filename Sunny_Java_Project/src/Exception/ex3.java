package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex3 
{

	public static void findFile() throws FileNotFoundException 
	{
		// code that may produce IOException
		File newFile=new File("/Users/girishg/git/repository/Sunny_Java_Project/src/Exception/test.txt");
		FileInputStream stream=new FileInputStream(newFile);
		
	}
		public static void main(String[] args) throws FileNotFoundException
		{
			
				findFile();
			
			
		}
		
}
