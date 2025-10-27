import java.io.FileWriter;
import java.util.Scanner;
//| Class                                  | Purpose                                                             |
// | -------------------------------------- | ------------------------------------------------------------------- |
// | `File`                                 | Represents a file or directory path (create/delete/check existence) |
// | `FileWriter`                           | Used to write text to a file                                        |
// | `FileReader`                           | Used to read text from a file                                       |
// | `BufferedReader`                       | Reads text efficiently (line-by-line)                               |
// | `Scanner`                              | Can read user input **and** read from a file                        |
// | `FileOutputStream` / `FileInputStream` | For binary data (images, PDFs, etc.)                                |

public class filehandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("please enter you name");
            String name=sc.nextLine();

            System.out.println("please enter your age");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("please enter city");
            String city=sc.nextLine();


           FileWriter Writer=new FileWriter("userdata.txt",true) ;

           //write data in txt using the fromat
           Writer.write(" the full details\n" );
           Writer.write("Name "+name+"\n");
           Writer.write("age  "+age+"\n");
           Writer.write("city  "+city+"\n");
        Writer.close();
           } catch (Exception e) {
            System.out.println("an error occured");
         e.printStackTrace();//often used at the time of production for detail error otherwisw you can just write the exception what it is
        }

sc.close();
    }
    
}
