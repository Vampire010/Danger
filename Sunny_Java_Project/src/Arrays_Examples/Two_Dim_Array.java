package Arrays_Examples;

public class Two_Dim_Array {

	public static void main(String[] args) 
	{
		  int[][] arr =
			  { 
  				{ 1,  2,  3 , 4 , 5 },
  				{ 6,  7,  8,  9,  10 },
  				{ 11, 12, 13, 14, 15 },
  				{ 16, 17, 18, 19, 20 }
  			};
		  try {
		 // System.out.print( "  "+arr[3][1]); 
		  for(int i=0;i<5;i++)
		  {
			 // System.out.print( "  "+arr[i][i]); 
			  for(int j=0;j<5;j++)
			  {
				  System.out.print( "       " +arr[i][j]); 
			  }
			  
			  System.out.println();
  	
		  } 

 		}
 
		  catch(Exception e)
		  {}
	}

}
