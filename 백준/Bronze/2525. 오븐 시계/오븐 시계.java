
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int am = a * 60;

		if ((am + b + c) / 60 >= 24)
			System.out.printf("%d %d", (am + b + c) / 60 - 24, (am + b + c) % 60);
		else
			System.out.printf("%d %d", (am + b + c) / 60, (am + b + c) % 60);
	}

}