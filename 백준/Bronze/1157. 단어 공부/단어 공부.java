
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		char ch = ' ';

		int[] arr = new int[26];
		String st = br.readLine();
		for (int i = 0; i < st.length(); i++) {
			if ('A' <= st.charAt(i) && st.charAt(i) <= 'Z') {
				arr[st.charAt(i) - 'A']++;
			} else
				arr[st.charAt(i) - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max)
				ch = '?';
		}
		System.out.println(ch);

	}
}