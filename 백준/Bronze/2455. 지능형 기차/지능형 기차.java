import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < 4; i++) {
			int D = sc.nextInt();
			int U = sc.nextInt();
			
			sum = sum - D + U;			
			if (max < sum) {
				max = sum ;
			}

		}
		System.out.println(max);
		

	}
	

}
