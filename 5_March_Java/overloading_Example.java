package basic;

public class overloading_Example {

	int addition(int no1,int no2)
	{
		return no1+no2;
	}
	float addition(int no1,int no2,int no3)
	{
		return no1+no2+no3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading_Example obj=new overloading_Example();
		System.out.println(obj.addition(23, 22,560));
		
		
	}

}
