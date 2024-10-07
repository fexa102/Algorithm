import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int a[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] < X) System.out.print(a[i] + " ");
		}

	}

}
