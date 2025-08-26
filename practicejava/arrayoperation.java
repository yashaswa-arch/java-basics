public class arrayoperation {
     public static void main(String[] args) {
        //min max in an array

//         int[]a={4,5,3,12,6,7,8,1,};
//         int max=a[0];
//         int min=a[0];
//        for(int i=1;i<a.length;i++){
//         if(a[i]>max){
//             max=a[i];
//             }
//             if(a[i]<min){
// min=a[i];
//         }
//        } 
//        System.out.println(max);
// System.out.println(min);

//LINEAR SEARCH

// int[]a={10000,4567,2345,123546,12345};
// int target=123546;//to find the target element
// boolean found=false;
// for(int i=0;i<a.length;i++){
//     if(a[i]==target){
//         found=true;
//         System.out.println("no. found at index "+i);
//         break;
//     }
// }
// if(!found){
//     System.out.println("no");
// }

//BINARY SEARCH
// int []a={10,20,30,40,50,60,70,80,90,100,200};
// Scanner sc=new Scanner(System.in);
// System.out.println("please enter the target the element  you want find");
// int target=sc.nextInt();
// boolean found =false;
// int low=0;
// int high=a.length-1;
// while(low<=high){
//     int mid=(low+high)/2;
//     if(a[mid]==target){
//         found=true;
    
//         System.out.println("item found at index: "+mid+" \nvalue is "+target);
//         break;
//     }
// else if(a[mid]<target){
//     low=mid+1;
    
// }
// else{
//     high=mid-1;
    
// }
// }
// if(!found){
//     System.out.println("item not found");
// }

//BUBBLE SORTING

// int []a={1,5,2,8,22,45,76,1,2};
// for(int i=0;i<a.length-1;i++){
//     for(int j=0;j<a.length-1-i;j++){
// if(a[j]>a[j+1]){
//     int temp=a[j];
//     a[j]=a[j+1];
//     a[j+1]=temp;
    
// }
// }

// }
// for(int val:a){
//     System.out.print(val+" ");

// }

//FREQUENCY COUNT -TELLS HOW MANY TIMES NUMBER HAS BEEN REPEATED

//int[]a={1,2,3,2,4,3,5,3,2,5,6,1,4,7,1,2};
// for(int i=0;i<a.length-1;i++){
//     if(a[i]==-1){
//         continue;//skip as alreadsy counted
//     }
//     int count=1;
// for(int j=i+1;j<a.length;j++){
//     if(a[i]==a[j]){
//                count++;
//                a[j]=-1;//marks as counted
//             }

// }
// System.out.println(a[i]+" repeated "+count+" times ");
// }
   

//to find second largest without sorting

// int []arr={1,28,3,1,4,2,1,56,78,23,45};
// int largest=Integer.MIN_VALUE;
// int secondlargest=Integer.MIN_VALUE;
// for(int num:arr){     //iterates over every no
// if(num>largest){
//     secondlargest=largest;
//  largest=num;
// }
// else if(num > secondlargest && num != largest){
//     secondlargest = num;
// }
// }
// System.out.println(" no. is second largest "+secondlargest);

// int a[]={12, 5, 7, 99, 3, 45};
// int max=a[0];
// int min=a[0];
// for(int i =0;i<a.length-1;i++){
//     if(a[i]>max){
//         max=a[i];
//     }
// else if(a[i]<min){
//     min=a[i];
// }

// }
// System.out.println(max);
// System.out.println(min);


//PRACTICE QUE 2
// int a[]={2, 5, 9, 1, 7};
// int target=9;
// for(int i =0;i<a.length-1;i++){
//     if(a[i]==target){
// System.out.println("element found at index " +i);
//     }

// }

//practice que 3

// int a[]={4, 2, 9, 1};
// for(int i= 0;i<a.length;i++){
//     for(int j=0;j<a.length-1-i;j++){
//         if(a[j]>a[j+1]){
//        int temp=a[j];
//     a[j]=a[j+1];
//     a[j+1]=temp;    
//     }
//     }

// }
// for(int val:a){
//     System.out.print(val);
// }

//practice que

// int a[]={1, 2, 2, 3, 1, 3, 3};
// int count=1;
// for(int i=0;i<a.length;i++){
//     if( a[i]==-1){
//         continue;//skip that value
        
//     }
//     for(int j=i+1;j<a.length;j++){
// if( a[i]==a[j]){
//     count++;
//     a[j]=-1;

// }
//     }
// System.out.println(a[i]+" "+count);
// }

    }
}
