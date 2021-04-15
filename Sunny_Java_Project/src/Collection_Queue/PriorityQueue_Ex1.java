package Collection_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Ex1 {

	public static void main(String[] args)
	{
		// Creating Queue using the PriorityQueue class
		Queue<Integer> numbers = new PriorityQueue<>();
		// offer elements to the Queue
		numbers.offer(5);
		numbers.offer(1);
		numbers.offer(2);
		System.out.println("Queue: " + numbers);
		
		// Access elements of the Queue
		int accessedNumber = numbers.peek();
		System.out.println("Accessed Element: " + accessedNumber);
		System.out.println("Updated Queue  after peek: " + numbers);
		

		
		// Remove elements from the Queue
		int removedNumber = numbers.poll();
		System.out.println("Removed Element: " + removedNumber);
		System.out.println("Updated Queue: " + numbers);
		
	}

}
