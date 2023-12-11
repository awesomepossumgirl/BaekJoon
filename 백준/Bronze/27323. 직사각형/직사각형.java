import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int result = A*B;
		
		bw.write(result+"");
		bw.close();

		/*
		  result+""에서 빈 문자열을 추가하는 이유는, bw.write() 메서드는 문자열을 인자로 받아야 하기 때문입니다. 
                  result는 정수형 변수이지만, bw.write()는 문자열을 기대합니다.
		  Java에서는 문자열과 다른 타입 간에 + 연산이 가능한데, 이때 자동으로 문자열로 변환됩니다. 
                  따라서 result+""는 result를 문자열로 변환하는 것입니다.
		
		  다른 방법으로는 String.valueOf(result)를 사용할 수 있습니다. String.valueOf(result)는 입력된 값을 문자열로 변환해줍니다.
		
		  종합하면, bw.write(result+"");에서 result를 문자열로 변환하여 bw.write() 메서드에 전달하기 위해서 +""를 사용하였습니다.
  		*/
	}

}
