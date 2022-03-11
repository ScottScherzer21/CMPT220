import java.util.Scanner;

public class problem1 {

  public static double m(int i, double weightLimit, double[] w) {

    // Check for valid input first.
    // check if i is less than or equal to 0, or the weight limit is less than or
    // equal to zero.
    // if either of those are true it is impossible to proceed. Return m as null
    if (i <= 0 || weightLimit <= 0) {
      return 0;
    }
    // check if i - 1 index position is equal to the weightlimit. If so, return m
    else if (w[i - 1] > weightLimit) {
      return m(i - 1, weightLimit, w);
    } else {
      return Math.max(m(i - 1, weightLimit, w), w[i - 1] + m(i - 1, weightLimit - w[i - 1], w));
    }
  }

  public static void main(String[] args) {

    // receive user input
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of items: ");

    int items = input.nextInt();
    // create a list
    double[] w = new double[items];

    System.out.println("Enter the weights for each item: ");

    // populate the list with the input data
    for (int i = 0; i < items; i++) {
      w[i] = input.nextDouble();
    }

    System.out.println("Enter the weight limit for the bag: ");
    double weightLimit = input.nextDouble();
    input.close();

    // call the method m
    double answer = m(items, weightLimit, w);
    System.out.println("The maximum weight of the items placed in the bag is " + answer);
  }
}
