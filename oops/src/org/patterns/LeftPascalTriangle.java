package org.patterns;

public class LeftPascalTriangle {

	public static void main(String[] args) {
		
		int n=6;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int space=0;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=space+i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("edureka programs:----");
		int rows=6;
		 for (int i= 1; i<= rows ; i++)
	        {
	            for (int j=i; j <rows ;j++)            
	        {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=i;k++) { System.out.print("*"); } System.out.println(""); } for (int i=rows; i>=1; i--)
	        {
	            for(int j=i; j<=rows;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1; k<i ;k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	}

}
