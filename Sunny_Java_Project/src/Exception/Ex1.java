package Exception;

public class Ex1 {

	public static void main(String[] args) 
	{

		try
		{
		//int c = 1/0;
		//System.out.println(c);
		int[] arr = new int[4];
		
		System.out.println("array value" + arr[5]);

		
		}
		
		catch(ArithmeticException e)
		{		
			System.out.println("Cant divide zero");
		}
		
		catch(ArrayIndexOutOfBoundsException np)
		{		
		 np.printStackTrace();
		 
		}
		
		finally
		{
			int a = 10/2 ;
			System.out.println(a);
		}
		
		
		try
		{
		//int c = 1/0;
		//System.out.println(c);
			int[] arr = new int[4];
		
			System.out.println("array value" + arr[5]);

		}
		
		finally
		{
			int a = 10/2 ;
			System.out.println(a);
		}
		
		

	}

}
