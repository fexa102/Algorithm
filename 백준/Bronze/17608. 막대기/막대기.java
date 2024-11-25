import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		int count = 0;
		for (int i = (n-1); i >= 0; i--) {
			if (max < a[i]) {
				count++;
				max = a[i];
			}
		}
		System.out.println(count);
		

	}

}
