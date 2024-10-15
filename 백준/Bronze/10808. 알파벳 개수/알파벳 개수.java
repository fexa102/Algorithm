import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		
		int a[] = new int[26];
		
		for (int i = 0; i < S.length(); i++) {
			int ch = S.charAt(i) - 'a';
			a[ch]++;
			
			
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
