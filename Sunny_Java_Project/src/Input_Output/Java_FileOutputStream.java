package Input_Output;

import java.io.FileOutputStream;

public class Java_FileOutputStream 

{

	public static void main(String[] args)
	{
		

		String data = "This is a line of text inside the file My New text.";
		try
		{
			
		FileOutputStream output = new FileOutputStream("/Users/girishg/eclipse-workspace/Sunny_Java_Project/src/Data_Files/input1.txt");
		
		byte[] array = data.getBytes();
		// Writes byte to the file
		output.write(array);
		output.close();
		}
		
		catch(Exception e) 
		{
		e.getStackTrace();
		}

	}

}
