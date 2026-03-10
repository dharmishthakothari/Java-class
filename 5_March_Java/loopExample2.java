package basic;

import java.util.Scanner;

public class loopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int number=scan.nextInt();
		int ans=1;
		for(int i=1;i<=10;i++)
		{
//			ans=number*i;
			//System.out.println(ans);
			System.out.println(number+" * "+i+" = "+number*i);
		}
	}

}
