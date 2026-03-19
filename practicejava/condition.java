import java.util.Scanner;

public class condition {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      // Practice: Age check
      // int age = sc.nextInt();
      // if (age > 18) {
      //     System.out.println("Adult");
      // } else {
      //     System.out.println("not Adult");
      // }

      // Practice: Even/Odd check
      // int x = sc.nextInt();
      // if (x % 2 == 0) {
      //     System.out.println("even");
      // } else {
      //     System.out.println("odd");
      // }

      // Practice: Compare two numbers
      // int a = sc.nextInt();
      // int b = sc.nextInt();
      // if (a == b) {
      //     System.out.println("equal");
      // } else if (a > b) {
      //     System.out.println("a is greater");
      // } else {
      //     System.out.println("a is lesser");
      // }

      // Active code: Language selection
      int button = sc.nextInt();

      switch (button) {
        case 1 -> System.out.println("hello");
        case 2 -> System.out.println("namaste");
        case 3 -> System.out.println("bonjour");
        default -> System.out.println("sayonara");
      }
    }
  }
}
