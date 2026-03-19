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
    // try (Scanner sc = new Scanner(System.in);
    //     FileWriter writer = new FileWriter("userdata.txt", true)) {
    //   System.out.println("Enter your name:");
    //   String name = sc.nextLine();
    //   System.out.println("Enter your age:");
    //   int age = sc.nextInt();
    //   sc.nextLine();
    //   System.out.println("Enter city:");
    //   String city = sc.nextLine();
    //
    //   writer.write("--- Full Details ---\n");
    //   writer.write("Name: " + name + "\n");
    //   writer.write("Age: " + age + "\n");
    //   writer.write("City: " + city + "\n");
    // } catch (Exception e) {
    //   System.out.println("An error occurred");
    // }

    // READ DATA FROM FILE
    try {
      File read = new File("userdata.txt");
      try (Scanner sc = new Scanner(read)) {
        System.out.println("=== Reading Data ===");
        while (sc.hasNextLine()) {
          String line = sc.nextLine();
          System.out.println(line);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File is missing or corrupt");
    }
  }
}
