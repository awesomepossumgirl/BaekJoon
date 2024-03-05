
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a-b;
		
		switch (Integer.compare(result, 0)) {
		case 1:
			System.out.println(">");
			break;
		case -1:
			System.out.println("<");
			break;
		default:
			System.out.println("==");
		}
	}
}