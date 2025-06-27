import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0]+arr[1]-arr[2]);

        String arr2[] = new String[3];
        for (int i = 0; i < 2; i++) {
            arr2[i] = Integer.toString(arr[i]);
        }
        String first = arr2[0]+arr2[1];

        int second = Integer.valueOf(first);
        System.out.println(second - arr[2]);
        
	}
}