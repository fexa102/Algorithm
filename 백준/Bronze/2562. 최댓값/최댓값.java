import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int max = -1000000;
		int count = 0;
		for (int i = 0; i < 9; i++) {
			int num = scanner.nextInt();
			if (num > max) {
				max = num;
				count = i + 1;
			}
				
		}
		System.out.println(max);
		System.out.println(count);
	}

}
