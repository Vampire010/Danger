package Abstraction;

public  class Example12 extends Example11
{


	public static void main (String [] args)
	{
		Example12 ex = new Example12();
		
		
		ex.add(1, 2);
		ex.Div(1, 2);
		ex.Mul(1, 2);
		ex.Sub(1, 2);
	}

	@Override
	public void Mul(int a, int b) 
	{
		// TODO Auto-generated method stub
		int c = a- b;
		System.out.println(c);
		
	}

	@Override
	public void Div(int a, int b) {
		int c = a / b;
		System.out.println(c);
		
	}

	@Override
	public void Sub(int a, int b)
	{
		int c = a - b;
		System.out.println(c);
		
	}

}
