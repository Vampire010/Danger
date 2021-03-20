package PolyMorphisms;

public class Web_WhatsApp extends WhatsApp
{
	
	@Override
	public void WhatsApp_V1( String Text , int photo , double Video )
	{
		
		System.out.println(" Web WhatsApp  Uplaoding your Video Status   :  " + Video  );
		
	}

	public static void main(String[] args) 
	{
		Web_WhatsApp wb = new Web_WhatsApp();
		wb.WhatsApp_V1("WEb ", 2, 2.1);
		WhatsApp wa = new WhatsApp();
		wa.WhatsApp_V1("Feeeling Awsome", 24, 24.9);
		
	}

}
