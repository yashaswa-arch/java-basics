//#POLYMORPHISM means many form 
// there can be two types of polymorphism compile time,run time
// compile time generally refers to methosd overloading ex code
//compile time example
// import java.util.Scanner;
// class calculator{
//     int add(int a,int b){
//         return a+b;
//     }
//     int add(int a,int b,int c){
//         return a+b+c;
//     }
// double add(double a,double b){
//     return a+b;
// }
// }
// public class polymorphism {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// calculator calci=new calculator();
// System.out.println("welcome if you want to add two int press 1");
// System.out.println("for three int press 2");
// System.out.println("for two big decimal press 3");
// int choice=sc.nextInt();
// switch(choice){
//     case 1: {
//         System.out.println("type no.1");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("total is: " + calci.add(a, b));
//         break;
//     }
//     case 2: {
//         System.out.println("selected no 2");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println("totalk is: " + calci.add(a, b, c));
//         break;
//     }
//     case 3: {
//         System.out.println("type two decimal numbers");
//         double a = sc.nextDouble();
//         double b = sc.nextDouble();
//         System.out.println("total is: " + calci.add(a, b));
//         break;
//     }
//     default: {
//         System.out.println("Invalid choice");
//         break;
//     }
    
// }
// sc.close();
// }
// }


//run time ploymorphism refers method OVERRIDING
//method overriding means changing the method of parent class by sub class
//ex code

// import java.util.Scanner;

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks!");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows!");
//     }
// }

// public class polymorphism {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Choose animal: 1 for Dog, 2 for Cat");
//         int choice = sc.nextInt();

//         Animal myAnimal; // Reference of parent class

//         if (choice == 1) {
//             myAnimal = new Dog();
//         } else {
//             myAnimal = new Cat();
//         }

//         myAnimal.sound(); // Calls the overridden method at runtime
//     }
// }
// super keyword 
//used for refers to immediate parent class 
//access parent class varibles and methods
//invoke parent class contructor
// import java.util.Scanner;

// class Person {
//     String name;
//     Person(String name) {
//         this.name = name;
//         System.out.println("Person constructor called");
//     }

//     void greet() {
//         System.out.println("Hello from Person, " + name);
//     }
// }

// class Student extends Person {
//     int roll;

//     Student(String name, int roll) {
//         super(name); // Calls the parent class constructor
//         this.roll = roll;
//         System.out.println("Student constructor called");
//     }

//     void greet() {
//         super.greet(); // Calls greet() from Person
//         System.out.println("And hello from Student, roll no: " + roll);
//     }
// }

// public class polymorphism {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter student name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter roll number: ");
//         int roll = sc.nextInt();

//         Student s = new Student(name, roll);
//         s.greet();
//     }
// }

//FINAL KEYWORD
//used to prevent method overriding iheritance reassignment of variable
// class Base {
//     final void show() {
//         System.out.println("Base show method (cannot be overridden)");
//     }
// }

// // This will cause an error if uncommented:
// // class Derived extends Base {
// //     void show() { // ❌ Not allowed
// //         System.out.println("Trying to override");
// //     }
// // }

// public class polymorphism {
//     public static void main(String[] args) {
//         Base b = new Base();
//         b.show();
//     }
// }
