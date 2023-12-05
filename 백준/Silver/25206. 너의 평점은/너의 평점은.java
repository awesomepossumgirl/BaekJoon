import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 20; // 20과목

		String name[] = new String[n]; // 과목명
		float score[] = new float[n]; // 학점
		String grade[] = new String[n]; // 등급
		float avg[] = new float[n]; // 과목평점

		for (int i = 0; i < n; i++) { // for문 돌려 배열에 값 넣기
			StringTokenizer st = new StringTokenizer(br.readLine()); // 입력 받기
			name[i] = st.nextToken(); // 배열에 과목명 넣기
			score[i] = Float.parseFloat(st.nextToken()); // 배열에 학점 넣기
			grade[i] = st.nextToken(); // 배열에 등급 넣기
		}

		for (int i = 0; i < n; i++) { // for문 돌려 과목평점 값 넣기
			char zero = grade[i].charAt(0); // 등급 첫번째 자리
			if (zero == 'A') {
				avg[i] = 4;
			} else if (zero == 'B') {
				avg[i] = 3;
			} else if (zero == 'C') {
				avg[i] = 2;
			} else if (zero == 'D') {
				avg[i] = 1;
			}

			if (grade[i].length() > 1) { // 등급이 한 글자 이상일 경우
				char one = grade[i].charAt(1); // 등급 두 번째 자리
				if (one == '+') {
					avg[i] += 0.5;
				}
			}

		}

		double result=0; // 전공과목별의 합
		double sum=0; // 학점의 총합
		
		for(int i=0; i<n; i++) { // 등급이 P인 과목은 제외
			if(!grade[i].equals("P")) { // 전공과목별의 합
				result+=(score[i]*avg[i]); // 학점의 총합
				sum+=score[i];
			}
		}
		System.out.println(result/sum); // 전공평점 출력
		br.close();
	}

}
