import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[10][10];
        int max = Integer.MIN_VALUE;
        int position = 0;
        int position2 = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                a[i][j] = sc.nextInt();
                if (max <= a[i][j]) {
                    max = a[i][j];
                    position = i;
                    position2 = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(position + " " + position2);
    }
}