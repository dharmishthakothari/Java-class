package basic;
class Student
{
	int age,marks;
	String name;
	Student(String name1,int marks1)
	{
		name=name1;
		marks=marks1;
	}
	
	Student(String name1)
	{
		name=name1;
	}
	Student(String name1,int age1,int marks1)
	{
		name=name1;
		age=age1;
		marks=marks1;
	}
	void display()
	{
		System.out.println(name+"\t"+age+"\t"+marks);
	}
	
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("Shivansh",20,120);
		Student s2=new Student("Priyanshu",20,130);
		Student s3=new Student("Dharmishtha",120);
		Student s4=new Student("Dharmishtha");
		
		
		s2.display();
		s1.display();
		s3.display();
		s4.display();
	}

}
