package Constructors;

public class Default_Constructor 
{
	
	//int a ; 
	char a;
	int b =20;

	public Default_Constructor()
	{
		System.out.println("No Argument Constructer " + b);

		
	}
	
	public Default_Constructor(int x)
	{
		System.out.println("Argument Constructer " + x);

		
	}
	
	public Default_Constructor(int y , String z)
	{
		System.out.println("Im a Constructer " + z);

		
	}
	
	
	public static void main(String[] args) 
	{
		Default_Constructor obj = new Default_Constructor();
		Default_Constructor obj2 = new Default_Constructor(10);
		Default_Constructor obj3 = new Default_Constructor(10,"Girish");

		
		System.out.println("Default Value:");
		System.out.println("Value of a: " + obj.a);
	}

}
