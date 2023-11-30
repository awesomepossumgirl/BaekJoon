
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) { // 0 1 2 3 4
			
			for(int j=n; j>i+1; j--) { // " " 4 3 2 1 0
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) { // "*" 1 2 3 4 5
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
