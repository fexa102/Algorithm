import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[][] = new int[N][M];
        int b[][] = new int[N][M];

        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < M; j++) {
        //         a[i][j] = i;
        //         System.out.print(a[i][j]);
        //     }
        //     System.out.println();
        // }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = 0;
                sum = a[i][j] + b[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}