package Collection_Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet_Ex {

	public static void main(String[] args) 
	{
		// Creating an arrayList of even numbers
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		evenNumbers.add(4);
		evenNumbers.add(2);
		System.out.println("ArrayList: " + evenNumbers);
	
		// Creating a LinkedHashSet from an ArrayList
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
		System.out.println("LinkedHashSet: " + numbers);
	}

}
