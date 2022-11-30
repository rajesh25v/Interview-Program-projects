package org.patterns;

public class DownTriangle {
	
	public static void main(String[] args) {
		
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("reverse process ****");
		
		 for (int i= n-1; i>=0 ; i--)
		    {
		    for (int j=0; j<=i; j++)
		    {
		    System.out.print("*" + " ");
		    }
		    System.out.println();
		    }
	}

}
