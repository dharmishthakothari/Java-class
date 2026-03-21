package basic;

import java.util.Scanner;

public class ClassExample1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			Person p = new Person();
			System.out.println("Enter name ");
			String name=scan.next();
			
			System.out.println("Enter address ");
			String address=scan.next();
			
			System.out.println("Enter c_no ");
			int c_no=scan.nextInt();
			
			p.getDetails(name, c_no, address);
			p.display();
		}
			
		
		
		
	}

}

class Person {
	int c_no;
	String name, address;

	void getDetails(String pName,int pCno,String pAddress)
	{
		name=pName;
		c_no=pCno;
		address=pAddress;
	}
	void display() {
		System.out.println(name + "-" + address + "-" + c_no);
	}

}
class Vehical
{
	
}
