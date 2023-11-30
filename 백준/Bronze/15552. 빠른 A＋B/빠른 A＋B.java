
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

		int T = Integer.parseInt(br.readLine()); // 입력 받는 테스트 개수
		StringTokenizer st; // StringTokenizer로 한 줄에 받는 여러개의 입력값 처리 가능

		int[] arr = new int[T]; // 더한 값 담아줄 배열

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()); // (12 34) 더해줄 숫자 입력 받기
			int a = Integer.parseInt(st.nextToken()); // (12) st.nextToken()으로 각 숫자 나눠주기
			int b = Integer.parseInt(st.nextToken()); // (34) 이 때, st.nextToken은 String 형변환
			arr[i] = a + b; // (12 + 34) 두 값을 더해 배열에 담기
		} // 이 과정을 T번 횟수만큼 반복
		br.close();
		for (int j = 0; j < T; j++) {
			bw.write(String.valueOf(arr[j])); // bw.write 안에는 String만. arr배열의 값을 String으로 형변환
			bw.newLine(); // System.out.println()= bw.newLine();으로 한 줄씩 출력(엔터)
		}
		bw.flush();  // 모든 작업이 끝나면 bw.flush()로 데이터를 다 비워줌
		bw.close();
	}

}
