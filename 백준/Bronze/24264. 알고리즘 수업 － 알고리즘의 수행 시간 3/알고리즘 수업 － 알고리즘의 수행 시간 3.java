import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어지는데
        //이거의 n*n을 했을때 int로는 overflow가 발생할 수 있다.
        long n = Long.parseLong(br.readLine()); //입력 크기 입력받음 => 이것이 수행 홧수
        br.close();
        System.out.println(n*n);
        System.out.println(2);

        /*
        i=1, j=1: sum += 1 * 1 = 1
        
        i=1, j=2: sum += 1 * 2 = 3
        
        i=1, j=3: sum += 1 * 3 = 6
        
        i=2, j=1: sum += 2 * 1 = 8
        
        i=2, j=2: sum += 2 * 2 = 12
        
        i=2, j=3: sum += 2 * 3 = 18
        
        i=3, j=1: sum += 3 * 1 = 21
        
        i=3, j=2: sum += 3 * 2 = 27
        
        i=3, j=3: sum += 3 * 3 = 36
        
        최종적으로 sum에 누적된 값은 1 + 3 + 6 + 8 + 12 + 18 + 21 + 27 + 36 = 132. 따라서 MenOfPassion([1, 2, 3], 3)은 132를 반환
        */
    }
}
