import java.util.Scanner;

import javax.naming.ldap.StartTlsRequest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isUpperCase(str.charAt(i))) {
				ch = Character.toLowerCase(str.charAt(i));
			}
			else {
				ch = Character.toUpperCase(str.charAt(i));
			}
			System.out.print(ch);
		}
	}

}
