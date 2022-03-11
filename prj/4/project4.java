import java.util.*;

class project4 {

  public static void main(String[] args) {

    // receive user input
    Scanner input = new Scanner(System.in);

    // set the input as first complex number
    System.out.print("Enter the first complex number: ");
    complex firstcomplex = new complex(input.nextDouble(), input.nextDouble());

    // set the input as the second complex number
    System.out.print("Enter the second complex number: ");
    complex secondcomplex = new complex(input.nextDouble(), input.nextDouble());

    // close the scanner
    input.close();

    // create an object called answer, and populate it with instances that provide
    // the desire output
    complex answer = new complex();
    answer.addition_answer = firstcomplex.add(secondcomplex);
    answer.subtraction_answer = firstcomplex.subtract(secondcomplex);
    answer.multiplication_answer = firstcomplex.multiply(secondcomplex);
    answer.division_answer = firstcomplex.divide(secondcomplex);
    answer.absolute_value_answer = firstcomplex.abs();

    System.out.println(firstcomplex + " + " + secondcomplex + " = " + answer.addition_answer);
    System.out.println(firstcomplex + " - " + secondcomplex + " = " + answer.subtraction_answer);
    System.out.println(firstcomplex + " * " + secondcomplex + " = " + answer.multiplication_answer);
    System.out.println(firstcomplex + " / " + secondcomplex + " = " + answer.division_answer);
    System.out.println("|" + firstcomplex + "| = " + answer.absolute_value_answer);

  }
}