package basic;

public class Array2DExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix={{12,22,56},{45,67},{23,78,67}};
		int sum=0;
		for(int i=0;i<matrix.length;i++)
		{
			
			for(int j=0;j<matrix[i].length;j++)
			{
				
				System.out.print("\t"+matrix[i][j]);
				if(matrix[i][j]%2==0)
					sum+=matrix[i][j];
			}
			System.out.println();
		}
		System.out.println("SUM of all the array element "+sum);
		
		
	}

}
