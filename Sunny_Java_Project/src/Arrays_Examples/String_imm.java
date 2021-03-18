package Arrays_Examples;

public class String_imm {

	public static void main(String[] args) 
	{
		String s = "Girish";
		s = s.concat(" Rathode");
		
		char [] ch = s.toCharArray();
		
		System.out.println("Lenth "+ s.length());
		
		System.out.println(ch[2]);
		
		char[] b = {'G', 'E', 'E', 'K', 'S'};
		System.out.println("Length : "+ b.length);

		
		
		String A = new String(b);
		System.out.println(A);
	}

}
