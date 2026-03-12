package basic;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scan = new Scanner(System.in);
	        System.out.println("Enter number ");
	        int num = scan.nextInt();
	        int k=1;
	        for (int i = 1; i <= num; i++) {
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print("\t"+k);
	        		k+=2;
	        	}
	        	System.out.println();
	        }
	        System.out.println("Second Pattern");
	        for(int i=1;i<=num;i++)
	        {
	        	for(int j=num;j>=i;j--)
	        	{
	        		System.out.print(" *");
	        	}System.out.println();
	        }
	    
	}

}
