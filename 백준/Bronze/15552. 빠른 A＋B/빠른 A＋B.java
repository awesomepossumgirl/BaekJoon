
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st; 

		int[] arr = new int[T]; 

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()); 
			int a = Integer.parseInt(st.nextToken()); 
			int b = Integer.parseInt(st.nextToken()); 
			arr[i] = a + b; 
		} 
		br.close();
		for (int j = 0; j < T; j++) {
			bw.write(String.valueOf(arr[j])); 
			bw.newLine(); 
		}
		bw.flush(); 
		bw.close();
	}

}
