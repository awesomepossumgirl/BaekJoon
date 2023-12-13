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
	}
}	