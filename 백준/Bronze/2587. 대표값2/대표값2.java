import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		System.out.println(sum/5);
		System.out.println(arr[2]);

		/*
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int sum = 0;  //수들의 합
	        int mid = 0;  //중앙값
	        int[] arr = new int[5];
	        for (int i = 0; i < 5; i++) {
	            arr[i] = Integer.parseInt(br.readLine());
	            sum += arr[i];
	        }
	        Arrays.sort(arr);  //배열 오름차순으로 정렬
	        int avg = sum / 5;  //평균 구하기
	        mid = arr[2];
	        System.out.print(avg + "\n" + mid);
	  	*/
	}
}
