package Examples;

import java.util.Scanner;

public class Relational 
{

	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		
			int a; int b;
			
			System.out.print("Eneter Value of A : ");	
			a=input.nextInt();
			
			System.out.print("Eneter Value of B : ");	
			b=input.nextInt();

		/*	//cases 1
			if(a==b)
			{	
				System.out.print(a + " is Equal to " + b);	
			}
	
			//cases 5
			else if(a>b)
			{
				System.out.print(a + " is Grater than " + b);		
			}
			
			//cases 6
			else if(a<b)
			{
				System.out.print(a + " is lesser than " + b);		
			}*/
		
			if(a>=b)
			{	
				System.out.print(a + " is Grater Equal to " + b);	
			}
			
			else if(a<=b)
			{	
				System.out.print(a + " is lesser Equal to " + b);	
			}
			else 
			{	
				System.out.print( " Not a Number ");	
			}
			
					
	}

}
