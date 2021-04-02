package Exception;

public class ex2 
{
	
	public static void divideByZero() 
	{
		// throw an exception
		throw new ArrayIndexOutOfBoundsException("Trying to divide by 0");
		
	}
	
	
	
	public static void main(String[] args)
	{
		divideByZero();
		
		}
	

}
