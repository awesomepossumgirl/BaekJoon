import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
		br.close();
        
        System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));

	    /*  

		n = 0 일 때, 초기의 점은 4개이고, 즉 2의 제곱이다. 

		중복되는 점을 빼고 총 점의 개수를 구하려면, 한 변의 점 개수² 를 해주면 된다.

		점의 개수가 p라고 할 때,

		n이 하나 늘어날 때 마다 ((p-1) + p)² 이 된다.

		n	0	1	2	3	4
		점 개수	4	9	25	81	289
		한 변 점 개수	2	3	5	9	17
		계산식	-	((2-1)+2)² 	((3-1)+3)² 	((5-1)+5)² 	((9-1)+9)² 

		import java.util.Scanner;
		
		public class Main {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		
		        int res = 2;
		        for (int i = 1; i <= n; i++) {
		            res = (res-1) + res;
		        }
		        System.out.println(res*res);
		    }
		}
  
		*/
    }
}
