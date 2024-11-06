
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 0; i < a ; i++) {
			String str = sc.next();
			int count = 0;
			int point = 0;
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					point += count + 1;
					count++;
				}
				else if (str.charAt(j) == 'X') {
					count = 0;
				}
			}
			System.out.println(point);
		}
		
				
	}

}
