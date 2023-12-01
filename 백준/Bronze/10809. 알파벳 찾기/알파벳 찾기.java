import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(); // String은 변경 불가능한 문자열 vs StringBuffer 변경가능

		String s = br.readLine();

		int[] arr = new int[26]; // 알파벳 길이만큼 배열
		Arrays.fill(arr, -1); // 배열 26칸을 -1로 초기화

		for (int i = 0; i < s.length(); i++) {
			// 배열 값이 -1이 아닐 때 이미 알파벳이 나왔기 때문에 continue
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
