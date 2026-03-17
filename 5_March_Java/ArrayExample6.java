package basic;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("Enter size of array ");
		size = scan.nextInt();

		int[] numbers = new int[size];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter element ");
			numbers[i] = scan.nextInt();
		}
		System.out.println("Enter element to search ");
		int search=scan.nextInt();
		for(int i=0;i>numbers.length;i++)
		{
			if(search==numbers[i])
			{
				System.out.println("Element found at "+i);
				break;
			}
		}
	}

}
