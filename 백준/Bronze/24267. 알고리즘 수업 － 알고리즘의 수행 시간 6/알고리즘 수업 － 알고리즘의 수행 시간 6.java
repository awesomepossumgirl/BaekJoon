import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println((n*(n-1)*(n-2))/6);
        System.out.println(3);

        br.close();

        /*
        import java.io.IOException;
        import java.io.InputStreamReader;
        
        public class n24267{
        	public static void main(String[] args) throws IOException{
        		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        		Long n= Long.parseLong(br.readLine());
        
        		int sum=0;
        		int count=0;
        		for( int i=1;i<=n-2;i++) {
        			for(int j= i+1;j<=n-1;j++) {
        				for(int k=j+1;k<=n;k++) {
        					sum=sum +i*j*k;
        					count++;
        				}
        			}
        		}
        		System.out.println(count);
        		System.out.println(n*(n-1)*(n-2));
        		System.out.println('3');
        	}
        }
                
        */
    }
}
