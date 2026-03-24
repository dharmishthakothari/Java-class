package basic;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodExample obj=new MethodExample();
		obj.greet("Priyanshu");
		obj.greet("Dharmishtha");
		
		MethodExample obj1=new MethodExample();
		System.out.println(obj1.calculateInterest(10000, 10, 10));
		System.out.println(obj1.calculateInterest(10000, 5, 1));
		System.out.println(obj1.calculateInterest(5000, 5, 1));


		
	}
	
	
	void greet(String name)
	{
		System.out.println("Good Afternoon "+name);
	}
	float calculateInterest(int p,int r,int n)
	{
		float ans;
		ans=p*r*n/100;
		return ans;
	}

}
