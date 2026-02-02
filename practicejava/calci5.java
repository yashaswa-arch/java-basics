import java.util.Scanner;

public class calci5 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter num1:");
        num1 = sc.nextDouble();
        
        System.out.println("Enter num2:");
        num2 = sc.nextDouble();
        
        System.out.println("Enter the operation (+, -, *, /):");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.println(num1 / num2);
                }
            }
        }
    }
}

