import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			} else if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
		
	}

}