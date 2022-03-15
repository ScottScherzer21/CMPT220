import java.util.Scanner;
import java.util.Random;

public class problem1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    /*
     * 
     * (Math tutor) Write a program that displays a menu as shown in the sample run.
     * 
     * You can enter 1, 2, 3, or 4 for choosing an addition, subtraction,
     * multiplication, or division test.
     * 
     * After a test is finished, the menu is redisplayed.
     * 
     * You may choose another test or enter 5 to exit the system.
     * 
     * Each test generates two random single-digit numbers to
     * form a question for addition, subtraction, multiplication, or division.
     * 
     * For a subtraction such as number1 – number2, number1 is greater than or equal
     * to number2. For a
     * division question such as number1 / number2, number2 is not zero.
     * 
     */

    // declare user choice
    int user_choice = 0;

    // start the loop
    do {

      Scanner userchoice = new Scanner(System.in);
      System.out.println("Main menu\n" +
          "1: Addition\n" +
          "2: Subtraction \n" +
          "3: Multiplication \n" +
          "4: Division \n" +
          "5: Exit \n");
      System.out.println("enter a choice: ");
      // re-assign user choice to the input we give
      user_choice = userchoice.nextInt();
      System.out.println(user_choice);

      int upperbound = 10;
      Random rand1 = new Random();
      Random rand2 = new Random();
      int int_random1 = rand1.nextInt(upperbound);
      int int_random2 = rand2.nextInt(upperbound);

      if (user_choice == 1) {
        System.out.println("what is " + int_random1 + "+" + int_random2);
        int answer = (int_random1 + int_random2);
        Scanner useranswer = new Scanner(System.in);
        int user_answer = useranswer.nextInt();

        if (user_answer == answer) {
          System.out.println("correct");
        } else {
          System.out.println("Your answer is wrong. \n"
              + "The correct answer was: " + answer);
        }
      }

      if (user_choice == 2) {

        // make sure second number is bigger and less than 10
        // decremend random2 untill its less than int random 1
        // if int 1 is 0 we need to add 1
        if ((int_random1 < int_random2) && (int_random1 == 0)) {
          int_random1 += 1;
          while (int_random1 < int_random2) {
            int_random2 -= int_random2;
          }
        } else if (int_random1 < int_random2) {
          while (int_random1 < int_random2) {
            int_random2 -= int_random2;
          }
        }

        System.out.println("what is " + int_random1 + "-" + int_random2);
        int answer = (int_random1 - int_random2);
        Scanner useranswer = new Scanner(System.in);
        int user_answer = useranswer.nextInt();

        if (user_answer == answer) {
          System.out.println("correct");
        } else {
          System.out.println("Your answer is wrong. \n"
              + "The correct answer was: " + answer);
        }
      }

      if (user_choice == 3) {

        System.out.println("what is " + int_random1 + "*" + int_random2);
        int answer = (int_random1 * int_random2);
        Scanner useranswer = new Scanner(System.in);
        int user_answer = useranswer.nextInt();

        if (user_answer == answer) {
          System.out.println("correct");
        } else {
          System.out.println("Your answer is wrong. \n"
              + "The correct answer was: " + answer);
        }
      }
      if (user_choice == 4) {
        // convert ints to doubles
        double double_random1 = int_random1;

        // make sure second random number isnt 0
        double double_random2 = int_random2;
        if (double_random2 == 0) {
          double_random2 += double_random2;
        }

        // I want to print these as int so numbers show up as 1 not 1.00
        System.out.println("what is " + int_random1 + "/" + int_random2);
        double answer = (double_random1 / double_random2);
        Scanner useranswer = new Scanner(System.in);
        double user_answer = useranswer.nextDouble();

        if (user_answer == answer) {
          System.out.println("correct");
        } else {
          System.out.println("Your answer is wrong. \n"
              + "The correct answer was: " + answer);
        }
      }

      // print a space to seperate list from answer for restart
      System.out.println(" ");

      // close the loop
    } while (user_choice != 5);

    System.out.println("goodbye");

  }
}
