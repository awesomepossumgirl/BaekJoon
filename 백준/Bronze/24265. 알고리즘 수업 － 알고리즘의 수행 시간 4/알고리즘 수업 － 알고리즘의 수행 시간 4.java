import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Long n= Long.parseLong(br.readLine());

		System.out.println(n*(n-1)/2);
		System.out.println('2');

		/*
  		i = 1         j = 2 ~ 7 [2, 3, 4, 5, 6, 7] => 6번
		i = 2		  j = 3 ~ 7 [3, 4, 5, 6, 7] => 5번
       		 i = 3 		  j = 4 ~ 7 [4, 5, 6, 7] => 4번
       		 i = 4		  j = 5 ~ 7 [5, 6, 7] => 3번
       		 i = 5 		  j = 6 ~ 7 [6, 7] => 2번
       		 i = 6		  j = 7		[7] => 1번
		1 ~ 6까지 더한 값이 수행 횟수이다.
		이 공식은 익히 알고 있을텐데 1 ~ n까지 합을 구하는 공식은 n(n+1)/2의 공식을 사용하면 된다!
		그렇다면 6은 어떻게 나온 것일까?
		바로 i의 마지막 반복번호(?)이다.
		즉, n-1값이고 그것을 공식에 대입하면, (n-1)((n-1)+1)/2 = n(n-1)/2이다

		수행 횟수 : n(n-1)/2
		시간 복잡도(=최고차항) : O((n^2 - n)/2) => 최고차항빼고 다 무시하면 O(n^2) 이다.
 		 */
	}
}	
