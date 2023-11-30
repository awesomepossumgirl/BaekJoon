import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;

		// 모두 같은 눈
		if (a == b && b == c && a == c) {
			result = 10000 + (a * 1000);
		}

		// 모두 다른 눈
		if (a != b && b != c && a != c) {
			int max = Math.max(a, Math.max(c, b));
			result = max * 100;
		}

		// 같은 눈이 2개만 나오는 경우
		if (a == b && b != c) {
			result = 1000 + (a * 100);
		} else if (a != b && b == c) {
			result = 1000 + (b * 100);
		} else if (a == c && b != c) {
			result = 1000 + (c * 100);
		}

		System.out.println(result);

	}

}