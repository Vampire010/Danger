package Input_Output;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class skip_Method {

	public static void main(String[] args) 
	{
		// Create an array of bytes
		byte[] array = { 4, 5, 6, 7,8 };
		try {
		ByteArrayInputStream input = new ByteArrayInputStream(array);
		
		// Using the skip() method
		input.skip(3);
		System.out.print("Input stream after skipping 2 bytes: ");
		int data = input.read();
		while (data != -1) {
		System.out.print(data + ", ");
		data = input.read();
		}
		// close() method
		//input.close();
		}
		catch (Exception e) 
		{
		e.getStackTrace();
		}
	}

}
