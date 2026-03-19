import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class calci {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Hello! Welcome to Calci\n");

      System.out.print("Enter the first number: ");
      double a = sc.nextDouble();

      String expression = "" + a; // store expression for history
      double b;

      while (true) {
        System.out.print("Enter operator (+, -, *, /, =): ");
        char operator = sc.next().charAt(0);

        if (operator == '=') break; // stop if user types =

        System.out.print("Enter next number: ");
        b = sc.nextDouble();

        expression += " " + operator + " " + b; // build expression

        switch (operator) {
          case '+' -> a += b;
          case '-' -> a -= b;
          case '*' -> a *= b;
          case '/' -> {
            if (b != 0) {
              a /= b;
            } else {
              System.out.println("❌ Cannot divide by zero!");
            }
          }
          default -> System.out.println("Invalid operator!");
        }
      }

      System.out.println("Result = " + a);

      try (FileWriter writer = new FileWriter("history.txt", true)) {
        writer.write(expression + " = " + a + "\n");
        System.out.println("✅ Operation saved in history.txt");
      } catch (IOException e) {
        System.out.println("❌ Error writing to file!");
      }
    }
  }
}
