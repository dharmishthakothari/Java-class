package basic;
class A1
{
	public void greet()
	{
		System.out.println("Hello ");
	}
}
class B extends A1
{
	
}
public class InheritanceExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.greet();
	}

}
