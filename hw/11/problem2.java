import java.util.*;

public class problem2 {

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

  public static ArrayList<Integer> m2(int i, double weightLimit, double[] w) {

    // convert double array to int array
    Integer[] list = new Integer[w.length];
    for (int z = 0; z < list.length; z++) {
      list[z] = (int) w[z];
    }

    // convert all previous lists to arraylist
    ArrayList<Integer> bag_items = new ArrayList<>(Arrays.asList(list));
    // create arrayList to hold the answers
    ArrayList<Integer> answer = new ArrayList<>();

    // Check for valid input first.
    // check if i is less than or equal to 0, or the weight limit is less than or
    // equal to zero.
    // if either of those are true it is impossible to proceed. Return m as null
    if (i <= 0 || weightLimit <= 0) {
      return null; // changed from 0 to null
    }

    // first remove all items that are overweight
    for (int r = 0; r < bag_items.size(); r++) {
      if (bag_items.get(r) > weightLimit) {
        bag_items.remove(r);
      }
    }

    // if the the remaining list objects add up to the max weight,put them in the
    // bag
    int d = 0;
    int f = 1;
    while (f < bag_items.size()) {
      if (bag_items.get(d) + bag_items.get(f) == weightLimit) {
        answer.add(bag_items.get(d));
        answer.add(bag_items.get(f));
        break;
      } else {
        f++;
      }
    }

    return answer;
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
    ArrayList<Integer> answer2 = m2(items, weightLimit, w);
    System.out.println("The maximum weight of the items placed in the bag is " + answer);
    System.out.println("The weights of the items are: " + answer2);
  }
}
