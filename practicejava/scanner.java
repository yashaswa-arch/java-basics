
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Practice: Reading string input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();  // next() takes only one token
        // System.out.println(name);
        
        // String name2 = sc.nextLine();
        // System.out.println(name2);

        // Active code: Adding two numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
