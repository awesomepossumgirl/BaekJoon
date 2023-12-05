
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] matrixA = new int [100][100];
		int[][] matrixB = new int [100][100];
		int[][] matrixC = new int [100][100];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				matrixB[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
				System.out.print(matrixC[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
