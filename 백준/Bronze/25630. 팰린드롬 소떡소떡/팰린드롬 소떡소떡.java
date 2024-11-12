import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int j = 0;
		String str = sc.next();
		for (int i = 0; i < N; i++) {
			int ch1 = N - (N - i);
			int ch2 = N- 1 - i;
			
			if (str.charAt(ch1) != str.charAt(ch2)) {
				j++;
			}
		}
		System.out.println(j/2);
	}

}
