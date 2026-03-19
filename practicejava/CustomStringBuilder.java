import java.util.Scanner;

public class CustomStringBuilder {
  public static void main(String args[]) {

    // PALINDROME CHECK
    // StringBuilder sb = new StringBuilder("hello everyone");
    // System.out.println(sb.reverse());

    // PALINDROME CHECK USING SCANNER
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your name:");
    // String a = sc.nextLine();
    // String reversed = new StringBuilder(a).reverse().toString();
    // if (a.equals(reversed)) {
    //     System.out.println("String is palindrome: " + reversed);
    // } else {
    //     System.out.println("Not a palindrome");
    // }

    // Q1: Reverse string without StringBuilder
    // String a = "hello";
    // String reversed = "";
    // for (int i = a.length() - 1; i >= 0; i--) {
    //     reversed += a.charAt(i);
    // }
    // System.out.println(reversed);  // Output: olleh

    // Q2: Palindrome check
    // Scanner sc = new Scanner(System.in);
    // String a = sc.nextLine();
    // StringBuilder sb = new StringBuilder(a).reverse();
    // if (a.equals(sb.toString())) {
    //     System.out.println("Is palindrome");
    // } else {
    //     System.out.println("Not palindrome");
    // }

    // Q3: Sum of digits in string
    // String a = "abc2d4e6";
    // int sum = 0;
    // for (int i = 0; i < a.length(); i++) {
    //     char ch = a.charAt(i);
    //     if (Character.isDigit(ch)) {
    //         sum += ch - '0';
    //     }
    // }
    // System.out.println("Sum: " + sum);

    // Q4: Reverse integer
    // int a = 12345;
    // String b = String.valueOf(a);
    // StringBuilder sb = new StringBuilder(b).reverse();
    // System.out.println(sb);

    // Q5: Character input
    // Scanner bb = new Scanner(System.in);
    // char ab = bb.next().charAt(0);
    // if (ab == 'Y') {
    //     System.out.println("You opted yes");
    // } else if (ab == 'N') {
    //     System.out.println("You opted no");
    // }

    // Q6: First occurrence of characters
    // String input = "programming";
    // String result = "";
    // for (int i = 0; i < input.length(); i++) {
    //     char ch = input.charAt(i);
    //     if (input.indexOf(ch) == i) {
    //         result += ch;
    //     }
    // }
    // System.out.println(result);  // Output: progamin

    // Q7: Count vowels, consonants, digits, special characters
    // String a = "Hello123!@";
    // int vowels = 0, consonants = 0, digits = 0, special = 0;
    // for (int i = 0; i < a.length(); i++) {
    //     char ch = Character.toLowerCase(a.charAt(i));
    //     if (Character.isDigit(ch)) {
    //         digits++;
    //     } else if (Character.isLetter(ch)) {
    //         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //             vowels++;
    //         } else {
    //             consonants++;
    //         }
    //     } else {
    //         special++;
    //     }
    // }
    // System.out.println("Vowels: " + vowels + ", Consonants: " + consonants +
    //                    ", Digits: " + digits + ", Special: " + special);

    // Q8: Capitalize first letter of each word
    // String a = "my name is yashaswa";
    // String[] parts = a.split(" ");
    // for (String part : parts) {
    //     String capitalized = part.substring(0, 1).toUpperCase() +
    // part.substring(1).toLowerCase();
    //     System.out.print(capitalized + " ");
    // }

    // Q9: Toggle case
    // String a = "AshRaF123";
    // for (int i = 0; i < a.length(); i++) {
    //     char ch = a.charAt(i);
    //     if (Character.isUpperCase(ch)) {
    //         System.out.print(Character.toLowerCase(ch));
    //     } else if (Character.isLowerCase(ch)) {
    //         System.out.print(Character.toUpperCase(ch));
    //     } else {
    //         System.out.print(ch);
    //     }
    // }

    // Q10: Anagram check
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter string 1:");
    // String a = sc.nextLine();
    // System.out.println("Enter string 2:");
    // String b = sc.nextLine();
    //
    // if (a.length() != b.length()) {
    //     System.out.println("Not anagrams");
    //     return;
    // }
    //
    // char[] arr1 = a.toCharArray();
    // char[] arr2 = b.toCharArray();
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    //
    // if (Arrays.equals(arr1, arr2)) {
    //     System.out.println("Is anagram");
    // } else {
    //     System.out.println("Not anagram");
    // }

    // ACTIVE CODE: Toggle case for user input
    try (Scanner sc = new Scanner(System.in)) {
      String a = sc.nextLine();

      for (int i = 0; i < a.length(); i++) {
        char ch = a.charAt(i);
        if (Character.isLowerCase(ch)) {
          System.out.print(Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
          System.out.print(Character.toLowerCase(ch));
        } else {
          System.out.print(ch);
        }
      }
    }
  }
}
