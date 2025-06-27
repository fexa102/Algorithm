import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int soonseo = sc.nextInt();
            
            int XX = soonseo%H;
            int YY = soonseo/H +1;
            if (soonseo%H == 0) {
                XX = H;
                YY = soonseo/H;
            }
            
            System.out.println(XX*100+YY);
        }
	}
}