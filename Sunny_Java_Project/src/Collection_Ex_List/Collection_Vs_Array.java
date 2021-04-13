package Collection_Ex_List;

import java.util.LinkedList;
import java.util.List;

public class Collection_Vs_Array 
{
	public static void main(String[] args) 
	{
		// Creating list using the LinkedList class
		List numbers = new LinkedList<>();
		
		//LinkedList<Integer> numbers = new LinkedList<>();

		
		// Add elements to the list
		numbers.add(5);
		numbers.add(9);
		numbers.add(13);
		numbers.add("java");
		numbers.add(17.727);
		numbers.add('R');



		System.out.println("LinkedList Elements : " + numbers);
		
		// Access element from the list
		Object number = numbers.get(2);
		System.out.println("Accessed Element: " + number);
		
		// Using the indexOf() method
		int index = numbers.indexOf(5);
		System.out.println("Position of 5 is " + index);
		
		// Remove element from the list
		Object removedNumber = numbers.remove(1);
		System.out.println("Removed Element: " + removedNumber);
	}

}
