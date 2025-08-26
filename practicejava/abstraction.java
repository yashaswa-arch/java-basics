// import java.util.Scanner;

// // Step 1: Interface (contract)
// interface Payment {
//     boolean pay(double amount); // every payment must implement this
// }

// // Step 2: Implementations (different HOWs)

// // CardPayment
// class CardPayment implements Payment {
//     private String cardNumber;

//     public CardPayment(String cardNumber) {
//         // Simple validation with if-else
//         if (cardNumber.length() == 16) {
//             this.cardNumber = cardNumber;
//         } else {
//             System.out.println("❌ Invalid card number, setting default.");
//             this.cardNumber = "0000000000000000";
//         }
//     }

//     public boolean pay(double amount) {
//         if (amount > 0) {
//             System.out.println("💳 Paid " + amount + " using Card " + cardNumber);
//             return true;
//         } else {
//             System.out.println("❌ Invalid amount");
//             return false;
//         }
//     }
// }

// // UPI Payment
// class UPIPayment implements Payment {
//     private String upiId;

//     public UPIPayment(String upiId) {
//         if (upiId.contains("@")) {
//             this.upiId = upiId;
//         } else {
//             System.out.println("❌ Invalid UPI ID, setting default.");
//             this.upiId = "default@upi";
//         }
//     }

//     public boolean pay(double amount) {
//         if (amount > 0) {
//             System.out.println("📱 Paid " + amount + " using UPI " + upiId);
//             return true;
//         } else {
//             System.out.println("❌ Invalid amount");
//             return false;
//         }
//     }
// }

// // Step 3: Main program
// public class abstraction {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Choose payment method (card/upi): ");
//         String method = sc.next();

//         Payment payment; // interface reference//Payment is an interface (a contract).
// //payment is a reference variable that can point to any object of a class which implements Payment. 

//         if (method.equalsIgnoreCase("card")) {
//             System.out.print("Enter 16-digit card number: ");
//             String card = sc.next();
//             payment = new CardPayment(card);
//         } else {
//             System.out.print("Enter UPI ID (like name@bank): ");
//             String upi = sc.next();
//             payment = new UPIPayment(upi);
//         }

//         System.out.print("Enter amount: ");
//         double amount = sc.nextDouble();

//         // OLD CODE – works for both card & UPI
//         boolean success = payment.pay(amount);

//         if (success) {
//             System.out.println("✅ Payment successful");
//         } else {
//             System.out.println("❌ Payment failed");
//         }
//     }
// }

//que on interface 
// 🔹 Problem 3 — Abstraction with Interface (Playable)

// Create an interface Playable with method play().
// Classes:

// Music → prints “Playing music…”

// Video → prints “Playing video…”

// 👉 Tasks:

// Ask user which one to play.

// Call play() on that object.
import java.util.Scanner;

// Step 1: Interface (contract)
interface Playable {
    void play(String fileName); // says "every playable thing must have play()"
}

// Step 2: Audio class implements Playable
class Audio implements Playable {
    public void play(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}

// Step 3: Video class implements Playable
class Video implements Playable {
    public void play(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }
}

// Step 4: Main program
public class abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name to play: ");
        String fileName = sc.nextLine();

        Playable player; // interface reference

        // Choose implementation based on extension
        if (fileName.endsWith(".mp3")) {
            player = new Audio();   // use Audio class
        } else if (fileName.endsWith(".mp4")) {
            player = new Video();   // use Video class
        } else {
            System.out.println("❌ Unsupported file format.");
            return;
        }

        // Call the method (same for both classes)
        player.play(fileName);
    }
}
