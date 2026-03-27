package oopConcept;

public class FirstImpl implements FirstInterface,MathInterface {

	public int addition(int no1,int no2)
	{
		return no1+no2;
	}
	public int substraction(int no1,int no2)
	{
		return no1-no2;
	}
	public void sayHello()
	{
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstImpl obj=new FirstImpl();
		obj.sayHello();
		
		System.out.println(obj.addition(20, 56));
		
	}

}
