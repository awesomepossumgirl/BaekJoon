import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		for (byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		System.out.println(sum);

		/* Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		String st = sc.next();
		for(int i=0; i<n; i++) {
			sum+=st.charAt(i)-'0';
		}
		System.out.println(sum); */
	}
}
