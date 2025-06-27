import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int su = sc.nextInt();
        int sum = su;

        int arr[] = new int[10];
        
        for (int i = 0; i < 2; i++) {
            su = sc.nextInt();
            sum *= su;
        }

        String str = Integer.toString(sum);

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-48]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
	}
}