import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				K--;
			}
			if (K == 0) {
				System.out.println(i);
				break;
			}
		}
		if (K != 0) {
			System.out.println(0);
		}
		sc.close();

		/*
  		반복문을 사용하여 1부터 N까지의 숫자에 대해 약수를 찾습니다.
		N % i == 0이면 i는 N의 약수입니다. 따라서 K를 1 감소시킵니다.
		K가 0이 되면 현재의 i가 N의 K번째 약수이므로 해당 값을 출력하고 반복문을 종료합니다.
		만약 반복문이 종료된 후에도 K가 0이 아니라면 N의 약수 중 K번째가 없다는 뜻이므로 0을 출력합니다.
  		*/
	}

}
