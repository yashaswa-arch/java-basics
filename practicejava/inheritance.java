// inheritance 
// child class inherits property from their parent class
// types of inheritance single multilevel heirarchial

// single inheritance
// class animal{
//     void eat(){
//         System.out.println("ican eat");
// }
// }
// class dog extends animal{
//     void bark(){
//         System.out.println("i can bark");
//     }
// }
// public class ineheritance{
//     public static void main(String[] args) {
//         dog d=new dog();
//         d.eat();
//         d.bark();
//     }
// }

//Mutlilevel inheritance
//  class Animal {
//      void eat() {
//         System.out.println("I can eat");
//     }
//  }

//  class Dog extends Animal {
//     void bark() {
//         System.out.println("I can bark");
//      }
//  }

//  class Puppy extends Dog {
//      void weep() {
//          System.out.println("I weep softly");
//      }
//  }
//  public class inheritance{
//      public static void main(String[] args) {
//         Puppy p = new Puppy();
//         p.weep();
//         p.bark();
//          p.eat();
//      }
//  }

// Problem 1: University System
// Scenario:
// You're designing a system where:

// Every Person in the university has a name and ID.

// A Student is a person with a department and course.

// A Professor is a person with a specialization and salary.
// import java.util.Random;
// import java.util.Scanner;
// class person{
//     int ID;
//     String name;
//     void inputdetails(int ID,String name){
//         this.ID=ID;
//         this.name=name;
//     }
//     void display(){
//         System.out.println("name " + name + "\nID " + ID);
//     }
// }
// class student extends person{
//     String department;
//     String course;
//     void type(String department,String course){
//         this.department=department;
//         this.course=course;
//     }
//     void info(){
//         System.out.println("which he is enrolled in " + department + "\ncourse " + course);
//     }
// }

// class professor extends person{
//     String specialization;
//     float salary;
//     void his(String specialization,float salary){
//         this.specialization=specialization;
//         this.salary=salary;


//     }void info2(){
//      System.out.println("professor is in"+ specialization+"\nwith sal"+salary);
//     }
// }
// public class inheritance{
//     public static void main(String[] args) {
//         System.out.println("hello what info would you like to retrive");
//         Scanner sc=new Scanner(System.in);
// student s = new student();
// System.out.print("Enter student ID: ");
// int id = sc.nextInt();
// sc.nextLine(); // consume newline
// System.out.print("Enter student name: ");
// String name = sc.nextLine();
// System.out.println("enetr deparment");
// String department=sc.nextLine();
// System.out.println("enter course");
// String course=sc.nextLine();
// s.inputdetails(id, name);
// s.type(department, course);
// System.out.println("student details");
// s.display();
// s.info();
// professor p = new professor();
// System.out.println("enetr prfessor specialization");
// String specialization=sc.nextLine();

// System.out.println("enter slaray");
// Random v=new Random();
// float salary = v.nextInt(1000);
// System.out.println(salary);
// p.his(specialization, salary);
// p.info2();
//     }
// }