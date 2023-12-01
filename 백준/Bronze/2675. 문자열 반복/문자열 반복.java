import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 테스트케이스 수 T , 몇 회 반복 R, 반복 문자열 str
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int r = sc.nextInt(); // 몇 회 반복
			String st = sc.next(); // 반복 문자열;
			String str = "";

			for (int j = 0; j < st.length(); j++)
			{
				for (int k = 0; k < r; k++) {
					System.out.print(st.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
