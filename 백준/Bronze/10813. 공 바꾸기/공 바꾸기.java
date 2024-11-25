import java.awt.GraphicsDevice.WindowTranslucency;
import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[N + 1];
		int A, B;
		
		
		for (int i = 1; i <= N; i++) {
			a[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			int temp = a[A];
			a[A] = a[B];
			a[B] = temp;
			
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(a[i] + " ");
		}
		
		

	}

}
