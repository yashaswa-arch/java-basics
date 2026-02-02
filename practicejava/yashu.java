import java.util.Scanner;

public class yashu {
    public static void main(String[] args) {
        // Practice: Basic arithmetic
        // int a = 25;
        // int b = 10;
        // int sum = a + b;
        // System.out.println(sum);
        // int mul = a * b;
        // System.out.println(mul);

        // Active code: Sum of two user inputs
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = (a + b);
        // System.out.println(sum);
       

        // // Step 1: Create Scanner for input
        // Scanner sc = new Scanner(System.in);

        // // Step 2: Ask user to enter a number
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt(); // Example: 153

        // // Step 3: Save original number for comparison
        // int originalNum = num; // originalNum = 153

        // // Step 4: Initialize sum and digit counter
        // int sum = 0;
        // int digits = 0;

        // // Step 5: Count how many digits in the number
        // while (num != 0) {
        //     num = num / 10; // Remove last digit
        //     digits++; // Count digits
        // }

        // // Step 6: Reset num to original value
        // num = originalNum; // num = 153 again

        // // Step 7: Calculate sum of digits raised to power
        // while (num != 0) {
        //     int digit = num % 10; // Extract last digit
        //     sum += Math.pow(digit, digits); // Add digit^digits to sum
        //     num = num / 10; // Remove last digit
        // }

        // // Step 8: Check if sum equals original number
        // if (sum == originalNum) {
        //     System.out.println(originalNum + " is an Armstrong number!");
        // } else {
        //     System.out.println(originalNum + " is NOT an Armstrong number.");
        // }

        // sc.close();
        
        // Step 1: Create Scanner for input
        Scanner sc = new Scanner(System.in);
        
        // Step 2: Ask user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Example: 121
        
        // Step 3: Save original number for comparison
        int originalNum = num;  // originalNum = 121
        
        // Step 4: Initialize reversed number as 0
        int reversedNum = 0;
        
        // Step 5: Reverse the number digit by digit
        while (num != 0) {
            int digit = num % 10;              // Extract last digit
            reversedNum = reversedNum * 10 + digit;  // Build reversed number
            num = num / 10;                    // Remove last digit
        }
        
        // Step 6: Compare original and reversed
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number!");
        } else {
            System.out.println(originalNum + " is NOT a palindrome number.");
        }
        
        sc.close();
    }

}




















