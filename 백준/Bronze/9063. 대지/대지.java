import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.println((A[N-1]-A[0])*(B[N-1]-B[0]));

		/*
  
 		간단하게 생각해야한다.
    		x 좌표 제일 큰수에서 작은수를 빼고, y좌표 큰수에서 작은 수를 뺴면 가로 제일 긴 변이 나온다. 
      		그 두 값을 곱하면 최소 크기의 사각형이 나온다.
		A배열에 x값 저장, B 배열에 y값을 저장한다. 
  		그리고 두 배열을 정렬하면 끝과 끝 인덱스가 최소 최대 값이 되기때문에 최대에서 최소를 빼준다.

*/
	}
}
