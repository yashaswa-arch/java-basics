public class arrayoperation {
  public static void main(String[] args) {

    // FIND MIN AND MAX IN ARRAY
    // int[] a = {4, 5, 3, 12, 6, 7, 8, 1};
    // int max = a[0];
    // int min = a[0];
    // for (int i = 1; i < a.length; i++) {
    //     if (a[i] > max) {
    //         max = a[i];
    //     }
    //     if (a[i] < min) {
    //         min = a[i];
    //     }
    // }
    // System.out.println("Max: " + max);
    // System.out.println("Min: " + min);

    // LINEAR SEARCH
    // int[] a = {10000, 4567, 2345, 123546, 12345};
    // int target = 123546;
    // boolean found = false;
    // for (int i = 0; i < a.length; i++) {
    //     if (a[i] == target) {
    //         found = true;
    //         System.out.println("Element found at index " + i);
    //         break;
    //     }
    // }
    // if (!found) {
    //     System.out.println("Element not found");
    // }

    // BINARY SEARCH (Array must be sorted)
    // int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200};
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the element to find:");
    // int target = sc.nextInt();
    // boolean found = false;
    // int low = 0;
    // int high = a.length - 1;
    //
    // while (low <= high) {
    //     int mid = (low + high) / 2;
    //     if (a[mid] == target) {
    //         found = true;
    //         System.out.println("Item found at index: " + mid + " | Value: " + target);
    //         break;
    //     } else if (a[mid] < target) {
    //         low = mid + 1;
    //     } else {
    //         high = mid - 1;
    //     }
    // }
    // if (!found) {
    //     System.out.println("Item not found");
    // }

    // BUBBLE SORT
    // int[] a = {1, 5, 2, 8, 22, 45, 76, 1, 2};
    // for (int i = 0; i < a.length - 1; i++) {
    //     for (int j = 0; j < a.length - 1 - i; j++) {
    //         if (a[j] > a[j + 1]) {
    //             int temp = a[j];
    //             a[j] = a[j + 1];
    //             a[j + 1] = temp;
    //         }
    //     }
    // }
    // for (int val : a) {
    //     System.out.print(val + " ");
    // }

    // FREQUENCY COUNT - Count how many times each number is repeated
    // int[] a = {1, 2, 3, 2, 4, 3, 5, 3, 2, 5, 6, 1, 4, 7, 1, 2};
    // for (int i = 0; i < a.length - 1; i++) {
    //     if (a[i] == -1) {
    //         continue;  // Skip already counted
    //     }
    //     int count = 1;
    //     for (int j = i + 1; j < a.length; j++) {
    //         if (a[i] == a[j]) {
    //             count++;
    //             a[j] = -1;  // Mark as counted
    //         }
    //     }
    //     System.out.println(a[i] + " repeated " + count + " times");
    // }

    // FIND SECOND LARGEST WITHOUT SORTING
    // int[] arr = {1, 28, 3, 1, 4, 2, 1, 56, 78, 23, 45};
    // int largest = Integer.MIN_VALUE;
    // int secondlargest = Integer.MIN_VALUE;
    // for (int num : arr) {
    //     if (num > largest) {
    //         secondlargest = largest;
    //         largest = num;
    //     } else if (num > secondlargest && num != largest) {
    //         secondlargest = num;
    //     }
    // }
    // System.out.println("Second largest: " + secondlargest);

    // PRACTICE QUE 1: Find max and min
    // int a[] = {12, 5, 7, 99, 3, 45};
    // int max = a[0];
    // int min = a[0];
    // for (int i = 0; i < a.length - 1; i++) {
    //     if (a[i] > max) {
    //         max = a[i];
    //     } else if (a[i] < min) {
    //         min = a[i];
    //     }
    // }
    // System.out.println("Max: " + max);
    // System.out.println("Min: " + min);

    // PRACTICE QUE 2: Search element
    // int a[] = {2, 5, 9, 1, 7};
    // int target = 9;
    // for (int i = 0; i < a.length - 1; i++) {
    //     if (a[i] == target) {
    //         System.out.println("Element found at index " + i);
    //     }
    // }

    // PRACTICE QUE 3: Bubble sort
    // int a[] = {4, 2, 9, 1};
    // for (int i = 0; i < a.length; i++) {
    //     for (int j = 0; j < a.length - 1 - i; j++) {
    //         if (a[j] > a[j + 1]) {
    //             int temp = a[j];
    //             a[j] = a[j + 1];
    //             a[j + 1] = temp;
    //         }
    //     }
    // }
    // for (int val : a) {
    //     System.out.print(val + " ");
    // }

    // PRACTICE QUE 4: Frequency count
    // int a[] = {1, 2, 2, 3, 1, 3, 3};
    // for (int i = 0; i < a.length; i++) {
    //     if (a[i] == -1) {
    //         continue;
    //     }
    //     int count = 1;
    //     for (int j = i + 1; j < a.length; j++) {
    //         if (a[i] == a[j]) {
    //             count++;
    //             a[j] = -1;
    //         }
    //     }
    //     System.out.println(a[i] + " appears " + count + " times");
    // }
  }
}
