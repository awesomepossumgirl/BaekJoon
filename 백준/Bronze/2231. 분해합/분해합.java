import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int size = String.valueOf(N).length();
		int start = N -(9*size);
		int result = 0;
		
		for(int i=start; i<N; i++) {
			int sum = i;
			int k = i;
			while(k>0) {
				sum+=k%10;
				k/=10;
			}
			if(sum==N) {
				result=i;
				break;
			}
		}
		System.out.println(result);

		/*
  		예를 들어, i가 216이라고 가정해봅시다.
		k를 초기화하여 i의 값인 216을 할당합니다.
		while 루프는 k가 0보다 큰 동안 계속 실행됩니다.
		sum에 k의 일의 자릿수를 더합니다. k % 10은 k의 일의 자릿수를 나타냅니다. 초기에는 sum이 216이므로, 첫 번째 루프에서는 sum이 216 + 6이 됩니다.
		k를 10으로 나누어 일의 자릿수를 제거합니다. 두 번째 루프에서 k는 21이 됩니다.
		위의 과정을 반복하면 sum은 216 + 6 + 1 + 2가 되어 최종적으로 225가 됩니다.
		k가 0보다 작거나 같아질 때까지 이 과정을 반복합니다.
		이렇게 하면 i의 각 자릿수를 더한 값을 sum에 구할 수 있습니다. 코드는 이 과정을 이용하여 sum이 N과 일치하는 생성자를 찾고, 일치하는 경우에는 해당 생성자를 result에 저장하고 반복문을 종료합니다.
  		*/
	}
}	
