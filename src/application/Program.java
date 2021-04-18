package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows will the matrix have: ");
		int rows = sc.nextInt();	
		System.out.println("Enter how many columns your matrix will have: ");
		int columns = sc.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				System.out.println("Insert your matrix values into the index: " + i +", column: "+ j);
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("What value do you want to check? ");
		int number = sc.nextInt();
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.println("Position of number " + number+ ": " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close(); 
	}
}