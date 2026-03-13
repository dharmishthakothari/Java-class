package basic;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int no=scan.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				if(i==1 || i==no || j==1 || j==no)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
