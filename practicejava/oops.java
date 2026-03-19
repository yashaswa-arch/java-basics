// class and obejcts
// class
// its a user defined blueprint
// import java.util.Scanner;

// class House {// we created a class named house which has area and category
//     int area;
//     String category;

//     void automaticScan() {
//         System.out.println("Showing results nearby...");
//     }

//     //  Method to take input for a House object
//     void takeInput() {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter area (in sq ft): ");
//         area = sc.nextInt();
//         sc.nextLine(); // Consume leftover newline

//         System.out.print("Enter category (e.g., flat, villa): ");
//         category = sc.nextLine();

//         sc.close(); // Good practice
//     }

//     // Method to display house info
//     void displayInfo() {
//         System.out.println("Area: " + area + " sq ft");
//         System.out.println("Category: " + category);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         System.out.println("Please enter your needs:");

//         House myHouse = new House();
//         myHouse.takeInput();     //  Taking input in separate method
//         myHouse.displayInfo();   //  Displaying the entered data
//         myHouse.automaticScan(); //  Calling other method
//     }
// }

// constructor
// has same name as that of class
// special method intizalized autmoatically when obejct is created
// now we will again make this program using contructor
// import java.util.Scanner;

// // Define the class
// class House {
//     int area;
//     String category;

//     // 👇 Constructor to initialize area and category
//     House(int area, String category) {
//         this.area = area;               // 'this' refers to the current object
//         this.category = category;
//     }

//     // Method to show a message
//     void automaticscan() {
//         System.out.println("Showing results for a " + category + " in " + area + " sq.ft
// area...");
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking input from user
//         System.out.println("Please enter your needs:");

//         System.out.print("Enter area: ");
//         int area = sc.nextInt();
//         sc.nextLine(); // consume leftover newline

//         System.out.print("Enter category: ");
//         String category = sc.nextLine();

//         // 👇 Object created with constructor
//         House myhouse = new House(area, category);

//         myhouse.automaticscan();
//     }
// }
// import java.util.Scanner;

// // Class to represent Apartment
// class Apartment {
//     int flatnum;
//     String ownername;
//     double maintenancecharge;

//     // Parameterized constructor
//     Apartment(int flatnum, String ownername, double maintenancecharge) {
//         this.flatnum = flatnum;
//         this.ownername = ownername;
//         this.maintenancecharge = maintenancecharge;
//     }

//     // Method to display details
//     void displayDetails() {
//         System.out.println("Flat No: " + flatnum);
//         System.out.println("Owner: " + ownername);
//         System.out.println("Monthly Maintenance: ₹" + maintenancecharge);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking input from the user
//         System.out.println("Please enter the flat number:");
//         int flat = sc.nextInt();
//         sc.nextLine(); // Consume leftover newline

//         System.out.println("Please enter the owner's name:");
//         String name = sc.nextLine();

//         System.out.println("Please enter the maintenance charge:");
//         double charge = sc.nextDouble();

//         // Creating object using parameterized constructor
//         Apartment myApartment = new Apartment(flat, name, charge);

//         // Displaying apartment details
//         myApartment.displayDetails();
//     }
// }
// USE OF contructor method overlaoding and some practice questions....
// q1--Q1. Create an AreaCalculator class
// Overload a method area() to calculate:
// Area of a circle: area(double radius)
// Area of a rectangle: area(int length, int breadth)
// Area of a triangle: area(double base, double height)

// import java.util.Scanner;

// class AreaCalculator {
// // Method to calculate area of a circle
// double area(double r) {
// return Math.PI * r * r;
// }

// // Method to calculate area of a rectangle
// double area(int length, int breadth) {
// return length * breadth;
// }

// // Method to calculate area of a triangle
// double area(double base, double height) {
// return (base * height) / 2;
// }
// }

// public class oops {
// public static void main(String[] args) {
// AreaCalculator calci = new AreaCalculator(); // Object of class
// Scanner sc = new Scanner(System.in);

// System.out.println("Please enter your choice:");
// System.out.println("1 for Circle\n2 for Rectangle\n3 for Triangle");

// int choice = sc.nextInt();

// switch (choice) {
// case 1:
// System.out.println("Enter radius of the circle:");
// double r = sc.nextDouble();
// System.out.println("Area of Circle: " + calci.area(r));
// break;

// case 2:
// System.out.println("Enter length and breadth of the rectangle:");
// int length = sc.nextInt();
// int breadth = sc.nextInt();
// System.out.println("Area of Rectangle: " + calci.area(length, breadth));
// break;

// case 3:
// System.out.println("Enter base and height of the triangle:");
// double base = sc.nextDouble();
// double height = sc.nextDouble();
// System.out.println("Area of Triangle: " + calci.area(base, height));
// break;
// default:
// System.out.println("Invalid choice! Please enter 1, 2, or 3.");
// }
// sc.close(); // Good practice to close scanner
// }
// }
// q2
// // Q2. Create a Greeting class
// Overload the method greet():
// greet() – prints “Hello!”
// greet(String name) – prints “Hello, [name]!”
// Hint: Think of function default messages vs customized greeting.

// import java.util.Scanner;
// // Class for greeting with overloaded methods
// class Greeting {

//     // No-parameter greet method
//     void greet() {
//         System.out.println("Hello!");
//     }

//     // Overloaded greet method with a name
//     String greet(String name) {
//         String message = "Hello, " + name + "!";
//         System.out.println(message);
//         return message;
//     }
// }

// // Main class
// public class oops {
//     public static void main(String[] args) {
//         Greeting g = new Greeting(); // Create object

//         g.greet(); // Call no-argument method

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         g.greet(name); // Call overloaded method with name

//         sc.close(); // Good practice
//     }
// }
// Q3. Bank Interest Calculator
// Create a method calculateInterest:

// calculateInterest(double principal) → fixed 5% interest

// calculateInterest(double principal, double rate) → custom interest rate

// calculateInterest(double principal, double rate, int years) → calculate compound interest

// 🧠 Formula: principal * Math.pow((1 + rate/100), years)

// import java.util.Scanner;

// class Interest {
//     // Method 1: Fixed 5% interest
//     double calculateInterest(double principal) {
//         return principal * 0.05;
//     }

//     // Method 2: Custom simple interest
//     double calculateInterest(double principal, double rate) {
//         return principal * (rate / 100);
//     }

//     // Method 3: Compound interest
//     double calculateInterest(double principal, double rate, int years) {
//         return principal * Math.pow((1 + rate / 100), years);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Interest it = new Interest(); // Object of Interest class
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Good morning! Please enter the principal amount:");
//         double amount = sc.nextDouble();

//         System.out.println("\nChoose an option:");
//         System.out.println("1. Fixed 5% Interest");
//         System.out.println("2. Custom Simple Interest");
//         System.out.println("3. Compound Interest");

//         int choice = sc.nextInt(); // user's choice for type of interest

//         switch (choice) {
//             case 1:
//                 // Case 1: Fixed 5% interest
//                 System.out.println("Interest at 5%: " + it.calculateInterest(amount));
//                 break;

//             case 2:
//                 // Case 2: Custom simple interest
//                 System.out.println("Enter custom interest rate:");
//                 double customRate = sc.nextDouble(); // Use double for accuracy
//                 System.out.println("Interest at " + customRate + "%: " +
// it.calculateInterest(amount, customRate));
//                 break;

//             case 3:
//                 // Case 3: Compound interest
//                 System.out.println("Enter annual interest rate:");
//                 double compoundRate = sc.nextDouble(); // Use double
//                 System.out.println("Enter number of years:");
//                 int years = sc.nextInt();
//                 System.out.println("Compound Interest: " +
//                     it.calculateInterest(amount, compoundRate, years));
//                 break;

//             default:
//                 System.out.println("Invalid choice. Please enter 1, 2 or 3.");
//         }

//         sc.close(); // Close the scanner to avoid memory leak
//     }
// }
