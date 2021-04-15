package Collection_Queue;

import java.util.PriorityQueue;

public class PriorityQueue_ex2 {

	public static void main(String[] args)
	{
		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		// Using the add() method
		numbers.add(4);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		
		
		//System.out.println("PriorityQueue: " + numbers);
		
		// Using the offer() method
		numbers.offer(5);
		numbers.offer(7);
	
		
		System.out.println("Updated PriorityQueue: " + numbers);
	}
}