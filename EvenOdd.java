
// Print all even numbers till n.

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    System.out.println("Enter number to print even numbers: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // taking input from user
System.out.println("Even numbers till "+ n);
    for (int i = 0; i <= n; i++) {     // for loop to print even number upto specified value
      if (i % 2 == 0) {               // checking whether the number is divisible by 2 or not
        System.out.println(i);       // prints even numbers
      }

    }

    sc.close();   // closing of scannar class
  }
}
