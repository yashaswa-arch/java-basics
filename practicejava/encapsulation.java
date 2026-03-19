//     private String name;
//     private Double balance;
//     // Constructor for modification kept public so it can be accessed from outside the class
//     public Bankaccount(String name, Double balance) {
//         this.name = name;
//         this.balance = balance;
//     }
// //getters for name
// public String getname(){
// return name;
// }
// //getter for balance
// public Double getbalance(){
//     return balance;
// }
// //setters for deposit money

//    public void deposit(double depositmoney) {
//     if (depositmoney > 0) {
//         balance += depositmoney;
//         System.out.printf("Rupees %.2f credited to account. Total balance: %.2f\n", depositmoney,
// balance);
//     } else {
//         System.out.println("Invalid deposit amount!");
//     }
// }

// //setters for withdrawl
// public void withdraw(double wmoney){
//     if(wmoney<=balance){
//         balance-=wmoney;
//         System.out.println("rupees"+wmoney+"withdrwan from account remaining balnce"+balance );

//     }
//     else{
//         System.out.println(" amount exceeds total balance");
//     }

// }
// public class encapsulation{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         //creating an account
//         System.out.println("please enetr your name");
//         String name=sc.nextLine();
//         System.out.println("enetr opening balance");
//         Double balance=sc.nextDouble();
//         Bankaccount ba=new Bankaccount(name, balance);

//         //menu for user
//  int choice = 0;
//         do {
//             System.out.println(" banking menu");
//             System.out.println("1 view balance");
//             System.out.println("2 deposit");
//             System.out.println("3 withdraw");
//             System.out.println("4 exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                 System.out.println("your current balance is"+ba.getbalance());
//                 break;

//                 case 2:
//                 System.out.println("enetr deposit moeny");
//                 double depositAmount = sc.nextDouble();
//                 ba.deposit(depositAmount);
//                 break;

//                 case 3:
//                 System.out.println("enetr withdraw moeny");
//                 double withdrawamn=sc.nextDouble();
//                 ba.withdraw(withdrawamn);
//                 break;

//                 case 4:
//                  System.out.println("Thank you for using our bank!");
//                 break;
//                 default:
//                  System.out.println("Invalid choice.");
//                 }

//         } while (choice!=4);
//         sc.close();
//     }
// }
// }

// 🔹 Problem 1 — Encapsulation (Student Record)

// Create a class Student with private fields:

// name (String, cannot be empty)

// age (int, must be > 5)

// marks (double, must be between 0 and 100)

// 👉 Tasks:

// Use getters and setters with validation.

// Take input using Scanner.

// Print student details using getters

import java.util.Scanner;

class Student {
  // private fields
  private String name;
  private int age;
  private double marks;

  // Constructor uses setters (so validation is applied)
  public Student(String name, int age, double marks) {
    this.name = name;
    this.age = age;
    this.marks = marks;
  }

  // Getters
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getMarks() {
    return marks;
  }

  // Setters with validation
  public void setName(String fname) {
    if (fname == null || fname.trim().isEmpty()) {
      System.out.println("❌ Name cannot be empty.");
    } else {
      this.name = fname;
    }
  }

  public void setAge(int age) {
    if (age > 5) {
      this.age = age;
    } else {
      System.out.println("❌ Age must be greater than 5.");
    }
  }

  public void setMarks(double marks) {
    if (marks >= 0 && marks <= 100) {
      this.marks = marks;
    } else {
      System.out.println("❌ Marks must be between 0 and 100.");
    }
  }
}

public class encapsulation {
  public static void main(String[] args) {
    System.out.println("🌟 Good morning! Welcome to the student portal 🌟");
    try (Scanner sc = new Scanner(System.in)) {

      // Input
      System.out.print("Enter your name: ");
      String name = sc.nextLine();

      System.out.print("Enter your age: ");
      int age = sc.nextInt();

      System.out.print("Enter your marks: ");
      double marks = sc.nextDouble();

      // Create student object (constructor uses validation)
      Student ss = new Student(name, age, marks);

      // Display details
      System.out.println("\n✅ Student Details:");
      System.out.println("Name  : " + ss.getName());
      System.out.println("Age   : " + ss.getAge());
      System.out.println("Marks : " + ss.getMarks());
    }
  }
}
