package Collection_Ex_List;

import java.util.ArrayList;

public class Iterate_through_ArrayList 
{
	public static void main(String[] args) 
	{
		// creating an array list
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Cow");
		languages.add("Cat");
		languages.add("Dog");
		System.out.println("ArrayList: " + languages);
		
		// iterate using for-each loop
		System.out.println("Accessing individual elements: ");
		
		for (String lang : languages) 
		{
			System.out.print(lang);
			System.out.print(", ");
		}
	}

}
