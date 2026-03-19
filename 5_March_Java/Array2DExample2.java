package basic;

import java.util.Scanner;

public class Array2DExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int matrix[][];
		System.out.println("Please enter no of row and col");
		int size = scan.nextInt();
		matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Enter element for ["+i+"]["+j+"] ");
				matrix[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}

}
