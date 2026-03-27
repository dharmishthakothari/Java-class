package oopConcept;

abstract class Bank
{
	abstract float calculateInterest();
}
class Axis extends Bank
{
	int amount;
	public Axis(int amount1)
	{
		amount=amount1;
	}
	
	
	float calculateInterest() {
		// TODO Auto-generated method stub
		return amount*0.6f;
	}
}
class SBI extends Bank
{
	int amount;
	public SBI(int amount1)
	{
		amount=amount1;
	}
	
	float calculateInterest() {
		// TODO Auto-generated method stub
		return amount*0.8f;
	}
	
}

public class AbstarctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI objSBI=new SBI(10000);
		System.out.println(objSBI.calculateInterest());
		
		
		Axis objAxis=new Axis(10000);
		System.out.println(objAxis.calculateInterest());
		

		
		
		
		
	}

}
