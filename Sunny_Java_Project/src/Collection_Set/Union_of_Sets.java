package Collection_Set;

import java.util.HashSet;

public class Union_of_Sets {

	public static void main(String[] args) 
	{
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: " + evenNumbers);
		
		HashSet<Integer> oddnumbers = new HashSet<>();
		oddnumbers.add(1);
		oddnumbers.add(3);
		oddnumbers.addAll(evenNumbers);
		System.out.println("HashSet2: " + oddnumbers);
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(5);
		System.out.println("HashSet3: " + numbers);
		
		// Union of two set
		numbers.addAll(oddnumbers);
		System.out.println("Union is: " + numbers);
		
		

	}

}
