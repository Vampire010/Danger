package Arrays_Practice;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		
		int b[]=new int[a.length];
		
		int c[] = new int[b.length];
		
		for(int i =0 ; i<a.length;i++)
		{
			
			b[i]=a[i];
			System.out.print("Elements of B : " + b[i]);
			
		}
		System.out.println();
		
		c=Arrays.copyOf(b, b.length);
		
		for(int d : c)
		{
			
			System.out.print("Elements of C "+d);

			
		}

		
	}

}
