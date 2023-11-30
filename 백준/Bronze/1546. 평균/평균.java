import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		double sum = 0.0;
		double max = 0.0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) max = arr[i];
		}
		for(int i=0; i<n; i++) {
			sum+=(arr[i]/max)*100.0;
		}
		System.out.println(sum/n);
	}

}