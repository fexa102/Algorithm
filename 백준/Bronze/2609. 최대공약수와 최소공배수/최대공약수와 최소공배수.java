import java.util.Scanner;

public class Main {
    public static int abcd(int a ,int b) {
        if (b == 0) {
            return a;
            
        }
        
        
        else {
            return abcd(b, a%b);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        abcd(a, b);
        
        System.out.println(abcd(a, b));
        System.out.println((a * b) / abcd(a, b));
        
        

        
        
    }
    
}
