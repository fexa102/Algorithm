import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
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
