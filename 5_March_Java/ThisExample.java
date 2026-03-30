package oopConcept;

class Employee
{
	String name,address,email,dept;
	int id,salary;
	public Employee() {
		System.out.println("Welcome ");
	}
	public Employee(String name,String email,int salary)
	{
		this.name=name;
		this.email=email;
		this.salary=salary;		
	}
	public Employee(int id,String name,String email,int salary,String dept)
	{
		
		this(name,email,salary);
		this.id=id;
		this.dept=dept;
	}
	public void greet()
	{
		System.out.println("Welcome in this");
	}
	public void display()
	{
		this.greet();
		System.out.println(id+"\t"+name+"\t"+email+"\t"+salary+"\t"+dept);
	}
}


public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee e1=new Employee("emp1", "emp1@gmail.com", 20000);
//		e1.display();
//		
//		Employee e2=new Employee(101, "emp2", "emp2@gmail.com",12000, "Finance");
//		e2.display();
		
		Employee[] e=new Employee[2];
		e[0]=new Employee("emp1", "emp1@gmail.com", 20000);
		e[1]=new Employee(101, "emp2", "emp2@gmail.com",12000, "Finance");
		
		for(Employee obj:e)
		{
			obj.display();
		}
		
		
	}

}
