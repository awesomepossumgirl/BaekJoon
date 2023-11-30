import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<(b-a+1)/2; j++) {
				int temp = arr[a-1+j];
				arr[a-1+j]=arr[b-1-j];
				arr[b-1-j]=temp;
			}
		}
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}