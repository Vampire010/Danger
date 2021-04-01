package User_Defiend;

public class String_ex1 {

	public static void main(String[] args) 
	{
	
		// create first string
		String first = "Java ";
		System.out.println("First String: " + first);
		
		// create second
		String second = "Programming ";
		System.out.println("Second String: " + second);
		
		
		
		
		String third = "Java ";
		
		// join two strings
		String joinedString = first.concat(second);
		System.out.println("Joined String: " + joinedString);
		
		// compare first and third strings
		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + result2);
		
		System.out.println("Sub String: " + joinedString.substring(5));
		
		String replacing_string = joinedString.replace("Programming ", "Python ");
		System.out.println("After replacing joinedString : " + replacing_string );
		
		String Ecape_char = "This is the \"String\" classes";
		
		System.out.println("Ecape_char String: " + Ecape_char);

		
	}

}
