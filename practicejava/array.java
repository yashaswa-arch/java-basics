
public class array {
    public static void main(String[] args) {
       //DYANIMC ITIALIZATION OF ARRAY
       
        // int[]num = new int[7];
        // System.out.println(num);

        //STATIC INTIALIZATION AND ACCESSING ELEMENTS
      //  int[]num={1,2,3,4,5,6};
        // System.out.println(num[2]);
        // System.out.println(num[4]);

       // System.out.println(Arrays.toString(num));

       //STATIC ARRAY INTIALIZATIOn AND ACCESSING

// int[][]matrix={
//     {1,2,3},
//     {4,5,6},
//     {7,8,9}

// };
// System.out.println(matrix[1][0]);

//DYANMIC ARRAY INIUTYALIZATIOn

// int[][]num=new int[3][4];
// System.out.println(num); 

//ITERATION OF ARRAYS USING FOR LOOP
// int[]numbers={1,2,3,4,5,6};
// for(int num:numbers){   //direct access of each element in an array
// System.out.print(num+" ");
// }

 //operations on array
 
//  int[]a={1,2,3,4,5,6,7,8,9,0};
//  int sum =0;
// for(int i = 0;i<a.length;i++){
// sum+=a[i];
    
// }
// System.out.println(sum);

//REVERSING AN ARRAY
        // Original array
        // int[] numbers = {1, 2, 3, 4, 5,6,7,8,9};
        
        // // Initialize pointers
        // int start = 0;
        // int end = numbers.length - 1;
        
        // // Reverse the array
        // while (start < end) {
        //     // Swap the elements at start and end
        //     int temp = numbers[start];
        //     numbers[start] = numbers[end];
        //     numbers[end] = temp;
            
        //     // Move pointers
        //     start++;
        //     end--;
        // }
        
        // // Print the reversed array
        // System.out.println("Reversed array:");
        // for (int num : numbers) {
        //     System.out.print(num + " ");
        // }

        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        
        // // Print all elements in the matrix using nested loops
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //   System.out.println();  // New line after each row
        // }
        
        //que on array to print all even numbers
        // int a[]={1,2,3,4,5,6};
        // for(int i=0;i<a.length;i++){
        //   if(a[i]%2==0){
        //     System.out.println(a[i]);
        //   }
        // }
//que on count of array
// int a[]={1,2,3,2,4,2};
// int count=0;
// for(int i =0;i<a.length;i++){
// if(a[i]==2){
//   count++;
//   System.out.println(a[i]);
// }
// }
// System.out.println("2 occurs"+count+"times");


//Copying of an array

// int[] a = {1,2,3,4,5,6,7,8,9};
// int[] b = new int[a.length];  // create an empty array b of same size

// for (int i = 0; i < a.length; i++) {
//     b[i] = a[i];  // copy each element
// }

// // Print the copied array
// for (int i = 0; i < b.length; i++) {
//     System.out.print(b[i] + " ");
// }

//Q4. Print array in reverse order (without modifying original array

// int a[]={1,2,3,4,5,6,7};

//  for(int i =a.length-1;i>=0;i--){
// System.out.print(a[i]); 

// }


      }
}






