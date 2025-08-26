public class loops {
  public static void main(String[] args) {
    // counter++ =>counter=counter+1
    // for (int i = 0; i < 11; i++) {
    // System.out.println(i);
    //
   // int i = 0;
    //while (i < 11) {
  //    System.out.println(i);
   //   i++;
 //   }
 //to print sum of first n natural no?
 //Scanner sc=new Scanner(System.in);
// int n= sc.nextInt();
// int sum=0;
// for(int i=1;i<=n;i++)
// {sum=sum+i;
//}System.out.println(sum);
//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//for(int i=1;i<11;i++){
//System.out.println(i*n);
//}
      
   //   for (int i = 1; i <= n; i++) {  // Outer loop for rows
//for (int j = n; j > i; j--) {  // Inner loop for spaces
    //          System.out.print(" ");
   //       }
   //       for (int k = 1; k <= i; k++) {  // Inner loop for stars
//System.out.print("* ");
    //      }
//System.out.println();  // Move to next line
   //   }
  // int n= 10;
   //for(int i =2;i<=n;i++){
  //  int count=0;
    //for(int j =1;j<=i;j++){
    //  if(i%j==0){
      //  count++; 
    //  }
      //    }      if (count==2){
       //   System.out.println(i);
       // }
       // }    
    //   for (int i = 5; i >= 1; i--) { 
    //    for (int j = 1; j <= 5 - i; j++) { 
    //        System.out.print(" "); // Print spaces
   //     }
   ///     for (int k = 1; k <= (2 * i - 1); k++) { 
   //         System.out.print("*"); // Print stars
   //     }
    //    System.out.println();
   // }
//for (int i = 1; i <= 4; i++) { 
  //for (int j = 4; j > i; j--) { 
  //    System.out.print(" "); 
 // }
 // for (int k = 1; k <= i; k++) { 
//System.out.print(" * "); 
 // }
  //System.out.println();
//}
      
      // 🔹 Upper half of the diamond
     // for (int i = 1; i <= 5; i++) {  // Controls rows (1 to 5)
          
     //     for (int j = 5; j > i; j--) {  // Prints leading spaces
      //        System.out.print(" ");
      //    }
          
       //   for (int k = 1; k <= i; k++) {  // Prints stars with spaces
        //      System.out.print(" *");
        //  }
          
        //  System.out.println();  // Moves to next line
    //  }
      
      // 🔹 Lower half of the diamond
     // for (int i = 4; i >= 1; i--) {  // Controls rows (4 to 1)
          
       //   for (int j = 5 - i; j > 0; j--) {  // Prints leading spaces
        //      System.out.print(" ");
       //   }
          
        //  for (int k = 1; k <= i; k++) {  // Prints stars with spaces
       //       System.out.print(" *");
        //  }
          
       //  System.out.println();  // Moves to next line
    //  }
    //NUMBER PYRAMID
   // for(int i =1;i<=5;i++){
   //   for(int j=5;j>i;j--){
    //    System.out.print(" ");
   // }
   // for(int k =1;k<=i;k++){
   // System.out.print(k+" ");
   // }
   // System.out.println();
 // }
  //INVERSE NUMBER PYRAMID

        //int n = 5; // Change 'n' for a bigger pattern
        
       // for (int i = n; i >= 1; i--) { // Controls rows
            
          //  for (int j = 1; j <= n - i; j++) { // Prints spaces for right alignment
//System.out.print("  "); // Double space for proper alignment
          //  }

         //   for (int k = 1; k <= i; k++) { // Prints numbers
         //       System.out.print(k + " ");
        //    }

         //   System.out.println(); // Moves to the next line
       // }
       //NUMBER PYRAMID

     //  for(int i =1;i<=5;i++){
     //      for(int j=5;j>i;j--){
      //       System.out.print(" ");
      //   }
       //  for(int k =1;k<=i;k++){
       //  System.out.print(k+" ");
       //  }
     //    System.out.println();
//}

   // for (int i = 5; i >= 1; i--) { // Controls rows
     //       
     //   for (int j = 1; j <= 5 - i; j++) { // Prints spaces for right alignment
//System.out.print(" "); // Double space for proper alignment
      //  }

      //  for (int k = 1; k <= i; k++) { // Prints numbers
      //      System.out.print(k + " ");
      //  }

       // System.out.println(); 
//}
//PASCALS TRAINGLE
      // int n = 5; // total number of rows

      // // Outer loop for each row
      // for (int i = 0; i <= n; i++) {

      //     // Print leading spaces to make the triangle shape
      //     for (int j = n; j > i; j--) {
      //         System.out.print(" ");
      //     }

      //     int num = 1; // First number in each row is always 1

      //     // Inner loop for numbers in each row
      //     for (int k = 0; k <= i; k++) {
      //         System.out.print(num + " "); // Print the current number

      //         // Update the number using recurrence relation:
      //         // num = num * (i - k) / (k + 1)
      //         // This avoids using factorial and keeps code efficient
      //         num = num * (i - k) / (k + 1);
      //     }

      //     // Move to next line after completing each row
      //     System.out.println();
      // }

      //HOLLOW DIAMOND
      
            // int n = 5; // number of rows in top half (middle included)
    
            // // ----- Upper Half -----
            // for (int i = 1; i <= n; i++) {
    
            //     // Print leading spaces (n - i times)
            //     for (int j = n; j > i; j--) {
            //         System.out.print(" ");
            //     }
    
            //     System.out.print("*"); // First star in every row
    
            //     // Print inner hollow space & second star
            //     if (i > 1) {
            //         for (int j = 1; j <= 2 * i - 3; j++) {
            //             System.out.print(" ");
            //         }
            //         System.out.print("*");
            //     }
    
            //     System.out.println(); // Move to next line
            // }
    
            // // ----- Lower Half -----
            // for (int i = n - 1; i >= 1; i--) {
    
            //     // Print leading spaces (n - i times)
            //     for (int j = n; j > i; j--) {
            //         System.out.print(" ");
            //     }
    
            //     System.out.print("*"); // First star
    
            //     if (i > 1) {
            //         for (int j = 1; j <= 2 * i - 3; j++) {
            //             System.out.print(" ");
            //         }
            //         System.out.print("*");
            //     }
    
            //     System.out.println();
            // }


            // BUTTERFLY PATTERN

                 // int n = 5;
          
                  // ----- Upper Half -----
                  // for (int i = 1; i <= n; i++) {
                  //     // Left stars (use k)
                  //     for (int k = 1; k <= i; k++) {
                  //         System.out.print("*");
                  //     }
          
                  //     // Middle spaces (use j)
                  //     for (int j = 1; j <= 2 * (n - i); j++) {
                  //         System.out.print(" ");
                  //     }
          
                  //     // Right stars (use k)
                  //     for (int k = 1; k <= i; k++) {
                  //         System.out.print("*");
                  //     }
          
                  //     System.out.println(); // Move to next line
                  // }
          
                  // // ----- Lower Half -----
                  // for (int i = n; i >= 1; i--) {
                  //     // Left stars (use k)
                  //     for (int k = 1; k <= i; k++) {
                  //         System.out.print("*");
                  //     }
          
                  //     // Middle spaces (use j)
                  //     for (int j = 1; j <= 2 * (n - i); j++) {
                  //         System.out.print(" ");
                  //     }
          
                  //     // Right stars (use k)
                  //     for (int k = 1; k <= i; k++) {
                  //         System.out.print("*");
                  //     }
          
                  //     System.out.println(); // Move to next line
                  // }

                  //ARMSTRONG NUMBER  

                  
        // // Step 1: Take user input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();  // Read user input
        
        // // Step 2: Store the original number for comparison later
        // int originalNum = num;
        
        // // Step 3: Initialize variables for sum and digits count
        // int sum = 0;
        // int digits = 0;

        // // Step 4: Find the number of digits in the number
        // while (num != 0) {
        //     num /= 10;  // Remove last digit of the number
        //     digits++;   // Increment the digit count
        // }

        // // Step 5: Reset num to its original value
        // num = originalNum;

        // // Step 6: Calculate the sum of the digits raised to the power of 'digits'
        // while (num != 0) {
        //     int digit = num % 10;  // Extract last digit
        //     sum += Math.pow(digit, digits);  // Add digit raised to the power of 'digits'
        //     num /= 10;  // Remove last digit
        // }

        // // Step 7: Check if the sum equals the original number
        // if (sum == originalNum) {
        //     System.out.println(originalNum + " is an Armstrong number.");
        // } else {
        //     System.out.println(originalNum + " is not an Armstrong number.");
        // }

        //PALINDROME NUMBER

        
        // Take user input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        
        // // Store the original number for comparison later
        // int originalNum = num;
        
        // // Initialize variable for reversed number
        // int reversedNum = 0;
        
        // // Reverse the number
        // while (num != 0) {
        //     int digit = num % 10;   // Extract last digit
        //     reversedNum = reversedNum * 10 + digit;  // Add digit to reversed number
        //     num /= 10;   // Remove last digit
        // }
        
        // // Compare original and reversed numbers
        // if (originalNum == reversedNum) {
        //     System.out.println(originalNum + " is a palindrome number.");
        // } else {
        //     System.out.println(originalNum + " is not a palindrome number.");
        // }
    }
}



              
          
          

        
    
    
  








