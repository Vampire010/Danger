package Collection_Ex_List;

import java.util.Stack;

public class Stack_Methods {

	public static void main(String[] args)
	{
		Stack<String> animals= new Stack<>();
		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		animals.push("Cat");
		
		System.out.println("Stack: " + animals);
		
		/*// Access element from the top
		String element = animals.peek();
		System.out.println("Element at top: " + element);*/
		
		// Search an element
		int position = animals.search("Horse");
		System.out.println("Position of Horse: " + position);
		
		// Remove element stacks
		String element1 = animals.pop();
		System.out.println("Removed Element: " + element1);
		
		// Check if stack is empty
		boolean result = animals.empty();
		System.out.println("Is the stack empty? " + result);
	}

}
