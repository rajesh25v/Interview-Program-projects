package org.patterns;

public class RightPascalTriangle {

	public static void main(String[] args) {

		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= n - i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("edureka program:------");
		int rows=6;
		
		  for (int i= 0; i<= rows-1 ; i++)
	        {
	            for (int j=0; j<=i; j++)
	            { 
	            	System.out.print("*"+ " ");
	            	} 
	            System.out.println(""); 
	            	} 
		  for(int i=rows-1; i>=0; i--){
			 
	            for(int j=0; j <= i-1;j++)
	            {
	                System.out.print("*"+ " ");
	            }
	            System.out.println("");
		  }
	}
}
