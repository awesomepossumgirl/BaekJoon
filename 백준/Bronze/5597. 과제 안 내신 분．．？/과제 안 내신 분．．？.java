import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 30; i++) {
			list.add(i);
		}

		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			list.remove(Integer.valueOf(num));
		}
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
