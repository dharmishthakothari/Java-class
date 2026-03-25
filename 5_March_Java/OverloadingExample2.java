package basic;
class Person11
{
	int id,c_no;
	String name;
	Person11(String name1)
	{
		name=name1;
	}
	Person11(String name1,int c_no1)
	{
		
		//name=name1;
		this(name1);
		c_no=c_no1;
	}
	Person11(String name1,int c_no1,int id1)
	{
		this(name1,c_no1);
		id=id1;
	}
	void display()
	{
		System.out.println(name+"\t"+id+"\t"+c_no);
	}
}
public class OverloadingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person11 p=new Person11("per1");
		Person11 p1=new Person11("per11",2323,45);
		p.display();
		p1.display();
	}

}
