public class recursion {
    
// //no from 1 to n
//     static void printNumbers(int n) {
//         if (n == 0) {   // base case
//             return;
//         }

//         printNumbers(n - 1); // recursive call
//         System.out.println(n);
//     }

//     public static void main(String[] args) {
//         printNumbers(5);

//FROM N TO 1
//  static void printNumbers(int n) {
//       if (n == 0) {   // base case
//             return;
//         }
// System.out.println(n);
//         printNumbers(n - 1); // recursive call
        
//     }

//     public static void main(String[] args) {
//         printNumbers(5);

//     }

//Factorial 

//factoiral int works upto on 12!
//factrial long works upto only 20!
//factorial bihgitnger works upto 50!




    // Recursive function to calculate factorial
    // static int factorial(int n) {
    //     if (n == 0 || n == 1) {   // base case
    //         return 1;
    //     }
    //     return n * factorial(n - 1);  // recursive call
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     // Taking input from user
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();

    //     // Calling the recursive function
    //     int result = factorial(num);

    //     // Printing the result
    //     System.out.println("Factorial of " + num + " is: " + result);

    //     sc.close();
    // }

    // for counting digits
    // static int countDigits(int n) {
    //     n = Math.abs(n);
    //     if (n < 10) {   // base case (includes n == 0)
    //         return 1;
    //     }
    //     return 1 + countDigits(n / 10);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Please enter the number: ");
    //     int a = sc.nextInt();
    //     int result = countDigits(a);
    //     System.out.println("Number of digits: " + result);
    //     sc.close();
    // }


    //ARRAYS USING RECUSRION
//      static void reverseArray(int[] arr, int index) {
//         if (index == arr.length)
//         return;
//         //first go deeper
//         reverseArray(arr, index+1);
//         //then print while returning
//         System.out.println(arr[index]+" ");
//     }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enetr  the size of array");
//     int n= sc.nextInt();
//     int[]arr=new int[n];
// System.out.println("enetr the array elemnmts");
// for (int i=0;i<n;i++) {
//     arr[i]=sc.nextInt();
// }
// System.out.println("array in rverse");
// reverseArray(arr, 0);
// sc.close();
// }
    //max element using recursion
    // static int maxelement(int[] arr, int index) {
    //     // base case: if at last element, return it
    //     if (index == arr.length - 1) {
    //         return arr[index];
    //     }
    //     // recursive call to find max in rest of array
    //     int maxInRest = maxelement(arr, index + 1);
    //     return Math.max(arr[index], maxInRest);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of array:");
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     System.out.println("Enter the array elements:");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     int max = maxelement(arr, 0);
    //     System.out.println("Maximum element in array: " + max);
    //     sc.close();
}



