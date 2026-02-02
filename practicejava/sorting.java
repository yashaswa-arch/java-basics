public class sorting {
    public static void main(String[] args) {
        //BUBBLE SORT
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

    //SELECTION SORT
  
        int[] ar = {5, 8, 6, 1, 3, 2};
        int swaps = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            int minIndex = i;

            // find index of minimum element
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }

            // swap only once per pass
            if (minIndex != i) {
                int temp = ar[i];
                ar[i] = ar[minIndex];
                ar[minIndex] = temp;
                swaps++;
            }
        }

        System.out.print("Sorted array: ");
        for (int x : ar) {
            System.out.print(x + " ");
        }

        System.out.println("\nNumber of swaps: " + swaps);
    }
}
