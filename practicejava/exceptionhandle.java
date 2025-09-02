import java.util.Scanner;

public class exceptionhandle {
  static void accessarr(int index,int divisor) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array elements separated by space:");
        String input = sc.nextLine();  // "10 20 30 40"

        // 2. Split by spaces into String array
        String[] parts = input.split(" ");  // ["10", "20", "30", "40"]
        int[] arr = new int[parts.length];
        // 3. Convert each String to int
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);  // Convert "10" → 10
        }
        try{
           int value = arr[index];
           int sec=value/divisor;
           System.out.println("answer is"+sec);
        }
        catch(ArithmeticException e){
            System.out.println("invalid answer");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array is out bound cannot be taken");
        }
        catch(ExceptionInInitializerError e){
            System.out.println("fuck off");
        }
        finally{
            System.out.println(" valid answer ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ll=sc.nextInt();
        System.out.println("enetred index"+ll);
        int ss = sc.nextInt();
        System.out.println("enetred divior"+ss);
        accessarr(ll, ss);
System.out.println("taken format of index , divisor");
    }
}
