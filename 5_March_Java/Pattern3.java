package basic;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int no=scan.nextInt();
		for(int i=1;i<=no*2-1;i++)
		{
			if(i<=no)
			{
				for(int j=i;j<=no;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for(int j=1;j<=i-no+1;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
