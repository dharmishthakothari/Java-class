package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int no=scan.nextInt();
		int i=2,temp=0;
		
		while(i<no) {
			if(no%i==0)
			{
				temp=0;
				System.out.println("Number is not prime ");
				break;
			}else
			{
				temp=1;
			}
			i++;
		}
		if(temp==1)
		{
			System.out.println("Number is prime ");
		}
	}

}
