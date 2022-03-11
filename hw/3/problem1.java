//package module3;

import java.util.Scanner;

public class problem1 {

  public static void main(String[] args) {

    // take input from user
    System.out.print("Enter a  numerator: ");
    Scanner numerator_scanner = new Scanner(System.in);
    double n = numerator_scanner.nextDouble();
    int numerator = (int) n;

    // take input from user
    System.out.print("Enter a  denominator: ");
    Scanner denom_scanner = new Scanner(System.in);
    double d = denom_scanner.nextDouble();
    int denominator = (int) d;

    // unfreeze all that after done testing

    int rem = numerator % denominator;

    if ((numerator > denominator) && (rem == 0)) {
      System.out.println(numerator + "/" + denominator +
          " is an improper fraction "
          + "and it can be reduced to " + (numerator / denominator));

    } else if ((numerator > denominator) && (rem != 0)) {
      int count = 0;
      int user_input_numerator = numerator;
      while (numerator > denominator) {
        numerator = numerator - denominator;
        count++;

      }
      System.out.println(user_input_numerator + "/" + denominator +
          " is an improper fraction and its a mixed fraction. "
          + "it can be reduced to " + count + " " + numerator
          + "/" + denominator);

    } else if (numerator < denominator)
      System.out.println(numerator + "/" + denominator
          + " is a proper fraction");
  }

}
