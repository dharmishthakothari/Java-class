package basic;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int size;
		System.out.println("Enter size of array ");
		size=scan.nextInt();
		
		int[] numbers=new int[size];
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("Enter element ");
			numbers[i]=scan.nextInt();
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
			
		}
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(max<numbers[i])
			{
				max=numbers[i];
			}
			
		}
		System.out.println("Maximum number is "+max);
		
	}

}
