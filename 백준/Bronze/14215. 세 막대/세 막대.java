import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int maxN = 0;
		if (a > b) {
			if (b > c)
				maxN = a;
			else
				maxN = (a > c) ? a : c;
		} else
			maxN = (b > c) ? b : c;
		
		if(a+b+c-maxN>maxN) System.out.println(a+b+c);
		else System.out.println((a + b + c - maxN) * 2 - 1);
		br.close();

		/*
  		C는 결국 A+B보다 작아야하되, 둘레는 최대여야하므로, C의 길이를 최소한으로 줄였을 때의 길이를 찾아야한다.
		즉, C의 길이를 A+B보다 1작게 만들면 되는 것이다. 그렇게 하면 둘레는 다음과 같이 계산 되겠다
		A+B+C=
		A+B+(A+B−1)=
		(A+B)×2−1

	}

}
