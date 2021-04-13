package Collection_Ex_List;

import java.util.ArrayList;

public class Remove_all_elements {

	public static void main(String[] args) 
	{
		// create an arraylist
        ArrayList<String> languages = new ArrayList<>();

        // add elements to arraylist
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        int languages_size = languages.size();
        System.out.println("Number of Programming Languages Availble : " + languages_size);

        // remove all elements from arraylist
        
        boolean s =languages.removeAll(languages);
        System.out.println("ArrayList after removeAll(): " + s);
        
        
        
        
        ArrayList<String> Animals = new ArrayList<>();

        // add elements to arraylist
        Animals.add("Cat");
        Animals.add("Dog");
        Animals.add("Horse");
        Animals.clear();

        System.out.println("ArrayList after clear(): " + Animals);


        
	}

}
