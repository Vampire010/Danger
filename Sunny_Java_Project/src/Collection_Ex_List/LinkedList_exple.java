package Collection_Ex_List;

import java.util.*;

public class LinkedList_exple {

	public static void main(String[] args) 
	{
		// Creating list using the LinkedList class
		List<Integer> numbers = new LinkedList<>();
		
		//LinkedList<Integer> numbers = new LinkedList<>();

		
		// Add elements to the list
		numbers.add(5);
		numbers.add(9);
		numbers.add(13);
		System.out.println("LinkedList Elements : " + numbers);
		
		// Access element from the list
		int number = numbers.get(2);
		System.out.println("Accessed Element: " + number);
		
		// Using the indexOf() method
		int index = numbers.indexOf(5);
		System.out.println("Position of 5 is " + index);
		
		// Remove element from the list
		int removedNumber = numbers.remove(1);
		System.out.println("Removed Element: " + removedNumber);
	}

}
