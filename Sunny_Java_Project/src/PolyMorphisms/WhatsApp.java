package PolyMorphisms;

public class WhatsApp 
{
	public void WhatsApp_V1( String Text )
	{
		
		System.out.println(" WhatsApp_V1  Uplaoding yout Text Status   :  " + Text);
		
	}
	
	public void WhatsApp_V1(String Text , int photo )
	{
		
		System.out.println(" WhatsApp_V1  Uplaoding yout photo Status   :  " + photo + "  " + Text );
		
	}
	
	
	public void WhatsApp_V1( String Text , int photo , double Video )
	{
		
		System.out.println(" WhatsApp_V1  Uplaoding yout photo Status   :  " + Video);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		WhatsApp wap = new WhatsApp();
		wap.WhatsApp_V1("Feeeling Awsome");
		wap.WhatsApp_V1("Feeeling Awsome", 12);
		wap.WhatsApp_V1("Feeeling Awsome", 24, 24.9);
		
		

	}

}
