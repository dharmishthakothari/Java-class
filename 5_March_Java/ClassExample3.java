package basic;

import java.util.Scanner;

class Employee1
{
	int eid,salary;
	String name,city;
	Employee1(int eid1,String name1,int salary1,String city1)
	{
		eid=eid1;
		salary=salary1;
		name=name1;
		city=city1;
	}
	public void display()
	{
		System.out.println(eid+"\t"+name+"\t"+city+"\t"+salary);
	}
}


public class ClassExample3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of employees ");
		int size=scan.nextInt();
		
		Employee1 employees[]=new Employee1[size];
		for(int i=0;i<employees.length;i++)
		{
			System.out.println("Enter eid name city salary ");
			int eid=scan.nextInt();
			String name=scan.next();
			String city=scan.next();
			int sal=scan.nextInt();
			employees[i]=new Employee1(eid, name, sal, city);
		}
		//For printing
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].salary>=20000)
				employees[i].display();
		}
		
		
		
		
		
	}

}
