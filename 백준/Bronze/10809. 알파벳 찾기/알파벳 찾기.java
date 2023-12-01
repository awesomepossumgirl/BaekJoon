import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String s = br.readLine();

		int[] arr = new int[26];
		Arrays.fill(arr, -1);

		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 'a'] != -1) {
				continue;
			} else {
				arr[s.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i : arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
	}

}