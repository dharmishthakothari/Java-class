package oopConcept;
abstract class A
{
	public void greet()
	{
		System.out.println("Good Morning ");
	}
	abstract public void bye() ;
}
class B extends A
{
	public void bye()
	{
		System.out.println("BYE");
	}
}

public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj=new B();
		obj.greet();
		obj.bye();
	}

}
