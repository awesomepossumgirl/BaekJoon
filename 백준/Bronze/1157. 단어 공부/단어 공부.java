
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
				arr[st.charAt(i) - 'A']++; // 대문자 A-Z까지 나온 횟수 증가
			} else
				arr[st.charAt(i) - 'a']++; // 소문자 a-z까지 나온 횟수 증가
		}

		for (int i = 0; i < 26; i++) { // arr 전부 검색
			if (arr[i] > max) {
				max = arr[i]; // 제일 많이 나온 arr[i]<문자>를 구함
				ch = (char) (i + 65); // arr[i]<문자>에 +65로 대문자로 만들어주기
			} else if (arr[i] == max)
				ch = '?';
		}
		System.out.println(ch);

	}
}
