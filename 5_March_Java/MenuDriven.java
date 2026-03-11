package basic;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice;
		do {
		String str="\n\n\n1. Check Prime\n2. Count total Digit\n3. Sum of Digit\n4. Count even/odd Digits\n5. Exit";
		System.out.println(str);
		System.out.println("Enter your choice ");
		choice=scan.nextInt();
		switch (choice) {
		case 1: {
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
			
		break;
		case 2:
		{
			System.out.println("Enter number ");
			int no = scan.nextInt();
			int rem = 0,count=0;
			int no1=no;
			while (no != 0) {
				rem = no % 10;
//				System.out.print("REM " + rem);
				no = no / 10;
				count++;
//				System.out.println(" Number " + no);

			}
			System.out.println(no1+" has "+count+" no of digits");
		}
		default:System.out.println("Enter valid choice");
			
		}
		}while(choice!=5);
		

	}

}
