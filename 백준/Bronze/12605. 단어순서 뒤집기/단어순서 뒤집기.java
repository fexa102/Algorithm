import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String str = sc.nextLine();
		
		for (int j = 1; j <= a; j++) {
			str = sc.nextLine();
			String[] arr = str.split(" ");
			System.out.print("Case #" + j + ": ");
			for (int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
		}
		

	}

}
