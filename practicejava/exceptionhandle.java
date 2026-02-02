import java.util.Scanner;

public class exceptionhandle {
    
    // PRACTICE: Access array with multiple exception types
    // static void accessarr(int index, int divisor) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter array elements separated by space:");
    //     String input = sc.nextLine();  // "10 20 30 40"
    //
    //     String[] parts = input.split(" ");  // ["10", "20", "30", "40"]
    //     int[] arr = new int[parts.length];
    //
    //     for (int i = 0; i < parts.length; i++) {
    //         arr[i] = Integer.parseInt(parts[i]);  // Convert string to int
    //     }
    //
    //     try {
    //         int value = arr[index];
    //         int result = value / divisor;
    //         System.out.println("Result: " + result);
    //     }
    //     catch (ArithmeticException e) {
    //         System.out.println("Cannot divide by zero!");
    //     }
    //     catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Array index out of bounds");
    //     }
    //     finally {
    //         System.out.println("Operation completed");
    //     }
    // }

    // ACTIVE CODE: Marks validation with custom exception
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }
            System.out.println("Marks accepted: " + marks);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Program finished.");
        }
    }
}
