package basic;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int no = scan.nextInt();
		int rem = 0,count=0;
		int no1=no;
		while (no != 0) {
			rem = no % 10;
//			System.out.print("REM " + rem);
			no = no / 10;
			count++;
//			System.out.println(" Number " + no);

		}
		System.out.println(no1+" has "+count+" no of digits");

	}

}
