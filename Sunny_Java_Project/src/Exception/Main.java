package Exception;

import java.util.ArrayList;

public class Main 
{
	@SuppressWarnings("unchecked")
	static void wordsList() 
	
	{
		ArrayList wordList = new ArrayList<>();
		// This causes an unchecked warning
		wordList.add("pragramizz");
		System.out.println("Word list => " + wordList);
	}
	
	public static void main(String args[]) 
	{
		wordsList();
	}

}
