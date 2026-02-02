import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// FILE HANDLING CLASSES
// ┌─────────────────────┬──────────────────────────────────────┐
// │ Class               │ Purpose                              │
// ├─────────────────────┼──────────────────────────────────────┤
// │ File                │ File/directory path operations       │
// │ FileWriter          │ Write text to file                   │
// │ FileReader          │ Read text from file                  │
// │ BufferedReader      │ Efficient line-by-line reading       │
// │ Scanner             │ Read user input & file content       │
// │ FileOutputStream    │ Write binary data (images, PDFs)     │
// │ FileInputStream     │ Read binary data                     │
// └─────────────────────┴──────────────────────────────────────┘

public class filehandling {
    public static void main(String[] args) {
        
        // WRITE DATA TO FILE
        // try {
        //     System.out.println("Enter your name:");
        //     String name = sc.nextLine();
        //     System.out.println("Enter your age:");
        //     int age = sc.nextInt();
        //     sc.nextLine();
        //     System.out.println("Enter city:");
        //     String city = sc.nextLine();
        //
        //     FileWriter writer = new FileWriter("userdata.txt", true);  // append mode
        //     writer.write("--- Full Details ---\n");
        //     writer.write("Name: " + name + "\n");
        //     writer.write("Age: " + age + "\n");
        //     writer.write("City: " + city + "\n");
        //     writer.close();
        // } catch (Exception e) {
        //     System.out.println("An error occurred");
        //     e.printStackTrace();
        // }
        // sc.close();

        // READ DATA FROM FILE
        try {
            File read = new File("userdata.txt");
            Scanner sc = new Scanner(read);
            
            System.out.println("=== Reading Data ===");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is missing or corrupt");
            e.printStackTrace();
        }
    }
}