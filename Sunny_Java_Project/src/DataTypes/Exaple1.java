package DataTypes;

public class Exaple1 
{
  //static 
  int b = 10;
  
  
  double q = b;
  
  double c =b;
  double y = 6.1;
  int T = (int)y;
  
  double u = 123;
  char a ='A';
  
  
  
	public static void main(String[] args) 
	{
		Exaple1 e = new Exaple1();

		Double obj = 78.6;

	    // convert obj to int
	    // using intValue()
	    String num = obj.toString();

	    // print the int value
	    System.out.println(num);  
	    
	    boolean result;
		result = num instanceof String;
		System.out.println("Is test an object of String? " + result);

	}

}
