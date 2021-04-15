package Collection_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implementing_the_LinkedList_Class {

	public static void main(String[] args) 
	{
		// Creating Queue using the LinkedList class
		Queue<Integer> numbers = new LinkedList<>();
		// offer elements to the Queue
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue: " + numbers);
		
		// Access elements of the Queue
		int accessedNumber = numbers.peek();
		System.out.println("Accessed Element: " + accessedNumber);
		System.out.println("Updated Queue  after peek: " + numbers);

		
		// Remove elements from the Queue
		int removedNumber = numbers.poll();
		System.out.println("Removed Element : " + removedNumber);
		
		System.out.println("Updated Queue  after poll: " + numbers);
	}

}
