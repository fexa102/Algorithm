import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String new_str = str.trim();
		
		if(new_str.isEmpty()) System.out.println('0');
		else {
			System.out.println(new_str.split(" ").length);
		}
	}
}
