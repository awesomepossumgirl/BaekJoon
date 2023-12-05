import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 20;

		String name[] = new String[n];
		float score[] = new float[n];
		String grade[] = new String[n];
		float avg[] = new float[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			name[i] = st.nextToken();
			score[i] = Float.parseFloat(st.nextToken());
			grade[i] = st.nextToken();
		}

		for (int i = 0; i < n; i++) {
			char zero = grade[i].charAt(0); // for문 돌려 과목평점 값 넣기
			if (zero == 'A') {
				avg[i] = 4;
			} else if (zero == 'B') {
				avg[i] = 3;
			} else if (zero == 'C') {
				avg[i] = 2;
			} else if (zero == 'D') {
				avg[i] = 1;
			}

			if (grade[i].length() > 1) {
				char one = grade[i].charAt(1);
				if (one == '+') {
					avg[i] += 0.5;
				}
			}

		}

		double result=0;
		double sum=0;
		
		for(int i=0; i<n; i++) {
			if(!grade[i].equals("P")) {
				result+=(score[i]*avg[i]);
				sum+=score[i];
			}
		}
		System.out.println(result/sum);
		br.close();
	}

}
