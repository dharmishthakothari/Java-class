package oopConcept;

import java.util.Scanner;

public class StringEaxmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter String ");
		String name=scan.next();
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='A' || name.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("count of a is "+count);
		
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	String name1=name.replace('a', 'e');
	System.out.println(name1);
	System.out.println(name);


	}

}
