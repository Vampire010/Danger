package Collection_Ex_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_Array_to_ArrayList_Conversion {

	public static void main(String[] args)
	{
		// create an array of String type
		String[] arr = { "Java", "Python", "C++" };
		System.out.print("Array: ");
		
		// print array
		for (String str : arr) 
		{
			System.out.print(str);
			System.out.print(" ");
		}
		
		// create an ArrayList from an array
		ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
		languages.add("C#");
		System.out.println("\nArrayList: " + languages);
	}

}
