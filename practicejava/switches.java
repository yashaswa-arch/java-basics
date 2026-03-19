import java.util.Scanner;

public class switches {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int button = sc.nextInt();

      switch (button) {
        case 1 -> System.out.println("hello");
        case 2 -> System.out.println("namaste");
        case 3 -> System.out.println("bonjour");
        default -> System.out.println("invalid");
      }
    }
  }
}
