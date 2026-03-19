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

    // // Step 1: Create Scanner for input with try-with-resources
    // try (Scanner sc = new Scanner(System.in)) {
    //     // Step 2: Ask user to enter a number
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();  // Example: 121

    //     // Step 3: Save original number for comparison
    //     int originalNum = num;  // originalNum = 121

    //     // Step 4: Initialize reversed number as 0
    //     int reversedNum = 0;

    //     // Step 5: Reverse the number digit by digit
    //     while (num != 0) {
    //         int digit = num % 10;              // Extract last digit
    //         reversedNum = reversedNum * 10 + digit;  // Build reversed number
    //         num = num / 10;                    // Remove last digit
    //     }

    //     // Step 6: Compare original and reversed
    //     if (originalNum == reversedNum) {
    //         System.out.println(originalNum + " is a palindrome number!");
    //     } else {
    //         System.out.println(originalNum + " is NOT a palindrome number.");
    //     }
    // }  // Scanner automatically closes here

    // Scanner sc = new Scanner(System.in);
    // System.out.println("eneter length of an array");
    // int n=sc.nextInt();
    // System.out.println("eneter the array");

    // int []arr=new int[n];
    // for(int i = 0 ;i<n;i++){
    //     arr[i]=sc.nextInt();
    //     }
    //     int max=arr[0];

    //     int min=arr[0];
    //     for(int j = 0;j<arr.length;j++){
    //         if(arr[j] > max){
    //             max = arr[j];
    //         }
    //         if(arr[j] < min){
    //             min = arr[j];
    //         }
    //     }

    //     for(int c:arr){
    //         System.out.println(c);

    //     }
    //     System.out.println("Max: " + max);
    //     System.out.println("Min: " + min);
    // Linear search
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enetr size of the aaray");
    // int n = sc.nextInt();
    // System.out.println("enetr the array");
    // int arr[]=new int[n];
    // for(int i =0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    // }
    // System.out.println("enter the target element");
    // int target=sc.nextInt();
    // for(int j=0;j<arr.length;j++){
    //     if(arr[j]==target){
    //         System.out.println("elemnt found at index"+j);
    //     }

    // }
    // binary search
    //  int []a={10,20,30,40,50,80,90,};
    //  int target = 80;
    // int low=0;
    // int high=a.length-1;
    // while(low<=high){
    //     int mid=((low+high)/2);
    //     if (target==mid){
    //         boolean found = true;
    //         System.out.println("no found in mid");
    //     }
    //     else if(a[mid]<target){
    //         low=mid+1;
    //     }
    //     else{
    //         high=mid-1;
    //         System.out.println("no found on index at right");
    //     }

    // }
    // frequency count

    // int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

    // boolean[] visited = new boolean[arr.length];

    // for (int i = 0; i < arr.length; i++) {
    //     if (visited[i]) continue; // skip already counted

    //     int count = 1;
    //     for (int j = i + 1; j < arr.length; j++) {
    //         if (arr[i] == arr[j]) {
    //             count++;
    //             visited[j] = true; // mark as counted
    //         }
    //     }
    //     System.out.println(arr[i] + " occurs " + count + " times");
    // }
  }
}
