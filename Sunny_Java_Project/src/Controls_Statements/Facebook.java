package Controls_Statements;

public class Facebook 
{
	
	int user_age = 72;
	
	public void Create_Account()
	{
		if(user_age>=18)
		{	
			System.out.print("User Allowed to Create an Account");	
			if(user_age>=60 & user_age <70 )
			{
				System.out.print("User Allowed to Create an Senior Citizen Account");		
			}
		
		}
		
		else if(user_age>=18)
		{
			System.out.print("User Allowed to Create an Senior Citizen Account Duplicate");		
		}
		
		
		else
		{
			System.out.print("User not Allowed  to Create an Account .User Age Should Be between  18 and 60");

		}
	
	}

	public static void main(String[] args) 
	{
		Facebook fb = new Facebook();
		fb.Create_Account();
	}

}
