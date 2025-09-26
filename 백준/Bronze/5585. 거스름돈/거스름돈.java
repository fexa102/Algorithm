
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin[] = {500, 100, 50, 10, 5, 1};

        int a = 1000 - sc.nextInt();
        int time = 0;

        for(int i : coin) {
            time += a/i;
            a = a%i;
        };

        System.out.println(time);

        
        
    }
}