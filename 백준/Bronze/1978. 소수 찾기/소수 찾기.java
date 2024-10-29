import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 1; i <= N; i++) {
			int num = sc.nextInt();
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count1++;
				}
			}
			if (count1 == 2) count2++;
		count1 = 0;
		}
		System.out.println(count2);
	}
	
}






