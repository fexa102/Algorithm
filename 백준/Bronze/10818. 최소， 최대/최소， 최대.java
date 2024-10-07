import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 1000000;
		int max = -1000000;
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			
			if (a < min) {
				min = a;
			}
			if (a > max) {
				max = a;
			}
		}
		System.out.print(min + " " + max);
		

	}

}
