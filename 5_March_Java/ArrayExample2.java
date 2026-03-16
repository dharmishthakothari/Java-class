package basic;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]=new int[100];
//		numbers[0]=12.23;
//		numbers[1]=345345.34324;
//		numbers[4]=324234.234;
//		numbers[19]=434.45345;
//		numbers[11]=434.234324;
		
		
		
		//display
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=100+(5*i);
			System.out.println(numbers[i]);
		}
		
		
	}

}
