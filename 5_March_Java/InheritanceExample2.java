package basic;

class Person1
{
	String name;
	int age;
	Person1(String name1,int age1)
	{
		name=name1;
		age=age1;
		
	}
	public void display()
	{
		System.out.println(name+"\t"+age);
	}
}
class Employee11 extends Person1
{
	int eid,salary;
	Employee11(String name1,int age1,int eid1,int sal1)
	{
		super(name1,age1);
		eid=eid1;
		salary=sal1;
	}
	public void display1()
	{
		//
		//super.display();
		System.out.println(name+"\t"+age);
		System.out.println(eid+"\t"+salary);
	}
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee11 obj=new Employee11("Priyanshu",20,101,12000);
obj.display();
obj.display1();
		
		
		
	}

}
