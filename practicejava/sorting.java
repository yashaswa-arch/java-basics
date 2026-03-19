

// import java.util.Scanner;

// public class sorting {
 
//     // BUBBLE SORT
    // int swap=0;
    //     int [] arr={5,4,2,1,8};
    //     int n=arr.length;
    //     for(int i =0;i<=n-1;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //                 swap++;
    //             }
    //         }

    //     }
    //     System.out.print("sorted arr: ");
    //     for(int a:arr){
    //         System.out.print(a+" ");
    //     }
    //     System.out.println();
    //     System.out.println("swaps: "+swap);

    // SELECTION SORT

    // int[] ar = {5, 8, 6, 1, 3, 2};
    // int swaps = 0;

    // for (int i = 0; i < ar.length ; i++) {
    //   int minIndex = i;

    //   // find index of minimum element
    //   for (int j = i + 1; j < ar.length; j++) {
    //     if (ar[j] < ar[minIndex]) {
    //       minIndex = j;
    //     }
    //   }

    //   // swap only once per pass
    //   if (minIndex != i) {
    //     int temp = ar[i];
    //     ar[i] = ar[minIndex];
    //     ar[minIndex] = temp;
    //     swaps++;
    //   }
    // }

    // System.out.print("Sorted array: ");
    // for (int x : ar) {
    //   System.out.print(x + " ");
    // }

    // System.out.println("\nNumber of swaps: " + swaps);
    
    //INSERTION SORT

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enetr array size");
    // int n = sc.nextInt();
    //  int arr[]=new int[n];
    //  System.out.println("enter the array ");
    //  for(int i = 0 ;i<n;i++){
    //   arr[i]=sc.nextInt();
    //  }
    //  //main part of the insertion sort creating key
    //  for(int i=1;i<n;i++){
    //   int key=arr[i];
    //   int j=i-1;
    //   //keep moving left until right positon is found
    //   while(j>=0&&arr[j]>key){
    //     arr[j+1]=arr[j];
    //     j--;
    //   }
    //   arr[j+1]=key;
    //  }
    //  for(int x :arr){
    //   System.out.println(x+" ");
    //  }
//MERGE SORT
//in divide si is starting index and ei is ending index
// public static void conquer(int arr[],int si,int mid,int ei){
//   int merge[]=new int[ei - si + 1];//to store the divided array and merge and equal it to the total size
// int idx1=si;//tracking first array 
// int idx2=mid+1;//tracking second array
// int x = 0;//for tracking of merged array

// while(idx1<=mid&&idx2<=ei){
//   if(arr[idx1]<=arr[idx2]){
//     merge[x++]=arr[idx1++];//in merge array we will put array of idx 1
//   }
//   else{
//     merge[x++]=arr[idx2++];
//   }
// }

// while(idx1<=mid){
//    merge[x++]=arr[idx1++];//jab tak esa rahe tab tak elemnts aisa ke aisa copy krdo
// }

// while(idx2<=ei){
//    merge[x++]=arr[idx2++];
// }

// for (int i = 0, j = si; i < merge.length; i++, j++) {
//     arr[j] = merge[i];//copying the elemts in original array
// }
// }


// public static void divide(int arr[],int si,int ei){
//   if(si>=ei){
//     return;
//   }

// int mid=si+(ei-si)/2; //why not? si+ei/2 cause of space complexity
// divide(arr, si, mid);
// divide(arr,mid+1,ei);
// conquer(arr,si,mid,ei);
// }
//  public static void main(String[] args) {
// Scanner sc  = new Scanner(System.in);
// System.out.println("enter size of AN ARRAY");
// int n = sc.nextInt();
//  int[]arr=new int[n];
//  System.out.println("enter array");
//  for (int i =0; i < n; i++) {
//   arr[i]=sc.nextInt();   
//  }
// divide(arr,0,n-1);
// for (int i = 0; i < n; i++) {
//   System.out.print(arr[i]+"");
    
// }
//   }
// }
