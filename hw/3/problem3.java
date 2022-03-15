import java.util.*;
import java.lang.*;
import java.io.*;

public class problem3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // radius = 5.

    double max = 5.0;
    double min = -5.0;

    // generating random number between 5 and -5 for both x and y
    double x = min + Math.random() * (max - min);
    double y = min + Math.random() * (max - min);

    // calculating the distance from point(x,y) and center (0,0) using euclidean
    // distance
    // formulae is square_root((x*x) + (y*y)) since other point is (0,0)
    double distance = Math.sqrt((x * x) + (y * y));

    System.out.println("The point is (" + x + "," + y + ") and its distance to the center is " + distance);

  }

}
