package Collection_MAP;

import java.util.HashMap;

public class Create_HashMap_Ex1 {

	public static void main(String[] args)
	{
		// create a hashmap
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap: " + languages);
		System.out.println("######################################################");

		// get() method to get value
		String value = languages.get(2);
		System.out.println("Value at index 1: " + value);
		System.out.println("######################################################");

		// return set view of keys
		// using keySet()
		System.out.println("Keys: " + languages.keySet());
		System.out.println("######################################################");

		// return set view of values
		// using values()
		System.out.println("Values: " + languages.values());
		System.out.println("######################################################");

		// return set view of key/value pairs
		// using entrySet()
		System.out.println("Key/Value mappings: " + languages.entrySet());
		System.out.println("######################################################");

		// change element with key 2
		languages.replace(2, "C++");
		System.out.println("HashMap using replace(): " + languages);
		System.out.println("######################################################");

		
		// remove element associated with key 2
		String value1 = languages.remove(2);
		System.out.println("Removed value: " + value1);
		System.out.println("######################################################");

		
		System.out.println("Updated HashMap: " + languages);
		
		
	}

}
