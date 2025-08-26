import java.util.Scanner;
public class condition {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //int age=sc.nextInt();
        // if (age>18){
            //System.out.println("Adult");
       // }else{
            //System.out.println("not Adult");
        //}
       // int x=sc.nextInt();
       // if(x%2==0){
         //   System.out.println("even");
      //  }else{
           // System.out.println("odd");
    //}
         //  int a=sc.nextInt();
         //  int b=sc.nextInt();
//if(a==b){
          //  System.out.println("equal");
    //    }
       //     else if(a>b){
           //         System.out.println("a is greater");
           //     }
                
            //    else{
                  //  System.out.println("a is lesser");
             //   }                     
             int button=sc.nextInt();
         //    if (button==1){
           //     System.out.println("hello");
          //   }
          //   else if(button==2){
          //      System.out.println("namaste");
          //   }
           //  else if(button==3){
           //     System.out.println("bonjour");
          //   }
           //  else{
           //     System.out.println("invalid");
           //  }
                 
             switch (button){
               case 1:
               System.out.println("hello");
               break;
            
            case 2:
            System.out.println("namaste");
            break;
            case 3:
            System.out.println("bonjour");
            break;
            default:
            System.out.println("sayonara");
             }
            
             

    }
    
}
