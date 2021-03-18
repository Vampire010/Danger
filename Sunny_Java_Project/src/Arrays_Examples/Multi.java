package Arrays_Examples;

public class Multi {

	public static void main(String[] args) {
		 int[][][]arr =
			  { 
 				{ {1,  2,10} , {3 , 4 ,12} },
 				{ {6,  7 ,11},  {8,  9 ,13} }
 			
 			};
		  try {
		 // System.out.print( "  "+arr[3][1]); 
		  for(int i=0;i<=arr.length;i++)
		  {
			 // System.out.print( "  "+arr[i][i]); 
			  for(int j=0;j<=arr.length;j++)
			  {
				  for(int k=0;k<=arr.length;k++)
				  {
				  System.out.print( "       " +arr[i][j][k]); 
				  }
				  System.out.println();
			  }
		  } 

		}

		  catch(Exception e)
		  {}

	}

}
