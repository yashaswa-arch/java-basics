import java.util.Scanner;

public class CustomStringBuilder {
    public static void main(String args[]) {

        // StringBuilder sb = new StringBuilder("hello everyone");

        // System.out.println(sb.reverse());
        // palindrome check
        // Scanner sc =new Scanner(System.in);
        // System.out.println("heello plz enter your name");
        // String a=sc.nextLine();
        // String reversed=new StringBuilder(a).reverse().toString();//conversts
        // stringbuilder to string using to string
        // if(a.equals(reversed)){
        // System.out.println("string is palindrome "+reversed);
        // }
        // else{
        // System.out.println(" off");
        // }

        // practice que

        // q1
        // String a = "hello";
        // String reversed = "";

        // for (int i = a.length() - 1; i >= 0; i--) {
        // reversed += a.charAt(i);
        // }

        // System.out.println(reversed); // Output: olleh

        // q2
        // palindrome check

        // Scanner sc=new Scanner(System.in);
        // String a=sc.nextLine();
        // StringBuilder sb=new StringBuilder(a).reverse();
        // if(a.equals(sb.toString())){
        // System.out.println(" is pali");

        // }
        // else{
        // System.out.println("no");
        // }

        // q3

        // String a = "abc2d4e6";
        // int sum=0;
        // for(int i=0;i<a.length();i++){
        // char ch=a.charAt(i);
        // if(Character.isDigit(ch)){
        // sum +=ch-'0';

        // System.out.println(sum);
        // }
        // }

        // q4

        // int a =12345;
        // String b=String.valueOf(a);
        // StringBuilder sb=new StringBuilder(b).reverse();
        // System.out.println(sb);

        // q5
        // Scanner bb=new Scanner(System.in);
        // char ab=bb.next().charAt(0);
        // if(ab=='Y'){
        // System.out.println("you opted yes");

        // }
        // else if(ab=='N'){
        // System.out.println("you opted no");
        // }

        // q6
        // String input = "programming";
        // String result = "";

        // for (int i = 0; i < input.length(); i++) {
        // char ch = input.charAt(i);

        // if (input.indexOf(ch) == i) { // first occurrence
        // result += ch;
        // }
        // }

        // System.out.println(result); // Output: progamin

        // q7
     
                // Input string
                // String a = "Hello123!@";
        
                // // Counters for each type
                // int vowels = 0, consonants = 0, digits = 0, special = 0;
        
                // // Loop through each character of the string
                // for (int i = 0; i < a.length(); i++) {
                //     // Get each character and convert to lowercase for easier comparison
                //     char ch = Character.toLowerCase(a.charAt(i));
        
                //     // Check if character is a digit (0–9)
                //     if (Character.isDigit(ch)) {
                //         digits++;
                //     }
                //     // Check if character is a letter (a–z or A–Z)
                //     else if (Character.isLetter(ch)) {
                //         // Check if it's a vowel
                //         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                //             vowels++;
                //         } else {
                //             consonants++;  // If not vowel, then it's a consonant
                //         }
                //     }
                //     // If not digit or letter, it's a special character
                //     else {
                //         special++;
                //     }
                // }
        
                // // Print the results
                // System.out.println("Vowels: " + vowels);
                // System.out.println("Consonants: " + consonants);
                // System.out.println("Digits: " + digits);
                // System.out.println("Special characters: " + special);

                //q8
            
                    //     String a = "my name is yahsaswa";
                
                    //     // Split the sentence into words
                    //     String[] parts = a.split(" ");
                
                    //     // Loop through each word
                    //     for (String part : parts) {
                    //         // Capitalize first letter + add rest of the word
                    //         String capitalized = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
                    //         System.out.print(capitalized + " "); // Add space between words
                    //     }
                
                    //     System.out.println(); // Move to new line after output
                    
                //q9
                
                        // // Input string
                        // String a = "AshRaF123";
                
                        // // Loop through each character in the string
                        // for (int i = 0; i < a.length(); i++) {
                        //     char ch = a.charAt(i);  // Get current character
                
                        //     // If character is uppercase, convert to lowercase
                        //     if (Character.isUpperCase(ch)) {
                        //         System.out.print(Character.toLowerCase(ch));
                        //     }
                        //     // If character is lowercase, convert to uppercase
                        //     else if (Character.isLowerCase(ch)) {
                        //         System.out.print(Character.toUpperCase(ch));
                        //     }
                        //     // If it's neither (like a digit or symbol), keep it as is
                        //     else {
                        //         System.out.print(ch);
                        //     }
                        // }

                        //q10 anagram

// System.out.println("please enter the string");
// Scanner sc =new Scanner (System.in);

// System.out.println("plz enter string 1: ");

// String a = sc.nextLine();
// System.out.println("plz enter string 2: ");
// String b = sc.nextLine();
// //if length are not equal they are not anagram
// if (a.length()!=b.length()){
//     System.out.println("not equal");
//     return;
// }
// //Convert to char array
// char[]arr1=a.toCharArray();
// char[]arr2=b.toCharArray();
// //sort
// Arrays.sort(arr1);
// Arrays.sort(arr2);
// if(Arrays.equals(arr1,arr2)){
//     System.out.println("is anagram");
// }
// else{
//     System.out.println("not");
// }
// int num =12345;
// int digit;
// int reversed = 0; // Initialize reversed to 0
// while(num != 0){
//     digit = num % 10;
//     reversed = reversed * 10 + digit; // Update reversed
//     num = num / 10; // Reduce num
// }
// System.out.println(reversed); // Print the reversed number
Scanner sc=new Scanner (System.in);
String a =sc.nextLine();
String b  = new StringBuilder(a).toString();
for(int i =0;i<b.length();i++){
    char ch = b.charAt(i);
    if(Character.isLowerCase(ch)){
        System.out.print(Character.toUpperCase(ch));
    }
    else if (Character.isUpperCase(ch)){
        System.out.print(Character.toLowerCase(ch));
    }
   
      
    
}
}
}
                                

                    

                

                    
                
                
                

                
            
        
    

