package Arrays_Examples;

public class Three_Dim_Array {

	public static void main(String[] args) 
	{
		 int[][][] arr =
			  { 
					  { {1,2,13 }, {3,4,14} ,{5,6,15 }},
					  { {7,8,16} , {9,10,17} ,{1,12,18}},
					  { {19,20,21 }, {22,23,24} ,{25,26,27}}
		  
 			   };
		  try 
		  {
		  for(int i=0;i<arr.length;i++)
		  {
			 // System.out.print( "  "+arr[i][i]); 
			  for(int j=0;j<arr.length;j++)
			  {
				  
				  for(int k=0;j<arr.length;k++)
				  {
				  System.out.print( i+" " + j+" " + k); 
				  }
					 

			  }
			  
			  
		  } 
		  System.out.println();
		}

		  catch(Exception e)
		  {}
	}

}
