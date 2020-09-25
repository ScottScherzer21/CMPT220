package module3;

import java.security.SecureRandom;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//Create an array of responses for correct 
String correct[]= { "Way to go","excellecnt","correct!"};

//Create an array of responses for incorrect answers 
String incorrect[]= {"incorrect", "wrong","not right"};
   
//declare a random variable,r
int r;

	   Scanner sc = new Scanner(System.in);
	   SecureRandom rand = new SecureRandom();
	
	   //get single digit random numbers
	   int first = rand.nextInt(10);
	   int second = rand.nextInt(10);
	   
	   
	   int ans = first - second;
	   System.out.println("how much is " + first + " - " + second + "? ");
	   
	   // start a loop
	   while (true) {
	
	   // ask user for input
	
	   int user = sc.nextInt();
	
	   // check answer
	   if (user == ans) {
	 
	   //Generate a random number 1-3
       r=(int)(rand.nextInt(2));
       System.out.println(correct[r]);
       break;
	   } 
	   
	   //Generate a random number 1-3
       r=(int)(rand.nextInt(2));      
       System.out.println(incorrect[r]);
       break;
       }
       sc.close();
   }
		

	

}
