package basic;

import java.util.Scanner;

public class LoopExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int even_count=0,odd_count=0;
		for(int i=100;i<=200;i++)
		{
			//System.out.println("Hello World "+i);
			if(i%2==0)
			{
				even_count+=1;
			}else
				odd_count++;
		}
		System.out.println("Even number count == "+even_count);
		System.out.println("Odd number count == "+odd_count);
		
		
		
		
	}

}
