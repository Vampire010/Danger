package User_Defiend;

import java.util.HashMap;
import java.util.Map;

public class HashCodeDemo 
{

	public static void main(String[] args)
	{
		Integer a = 201;
		Integer b = 201;

        if(a==b)
        {
            System.out.println("Equal variables:");
            
            System.out.println(a.hashCode() + "\n" + b.hashCode());
        }

        String c = "10";
        String d = "50";

        if(!c.equals(d))
        {
            System.out.println("\nUn-equal variables:");
            System.out.println(c.hashCode() + "\n" + d.hashCode());
        }
    }

}
