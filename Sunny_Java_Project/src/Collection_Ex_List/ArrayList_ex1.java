package Collection_Ex_List;

import java.util.ArrayList;

public class ArrayList_ex1 
{
	public static void main(String[] args)
	{
		// create ArrayList
		ArrayList<String> languages = new ArrayList<>();
		
		// Add elements to ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("Swift");
		System.out.println("ArrayList: " + languages);
		
		// add() method with the index parameter
		languages.add(1, "JavaScript");
		System.out.println("Updated ArrayList: " + languages);
		
		String str = languages.get(1);
		System.out.println("Element at index 1: " + str);
		
		// change the element of the array list
		languages.set(3, "C#");
		System.out.println("Modified ArrayList: " + languages);
		
		}

}
