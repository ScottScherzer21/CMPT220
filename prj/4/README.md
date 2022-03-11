# Project 4
CMPT220L
Due on Dec 4, 2020 by 11:59 PM
Points: 100

## The Complex Class

### Problem Description
A complex number is a number of the form a+bi, where a and b are real numbers and i is √−1. The numbers a and b are known as the real part and imaginary part of the complex number, respectively. You can perform addition, subtraction, multiplication, and division for complex numbers using the following formula:

```
a + bi + c + di = (a + c) + (b + d)i

a + bi − (c + di) = (a − c) + (b − d)i

(a + bi) ∗ (c + di) = (ac − bd) + (bc + ad)i

(a + bi)/(c + di) = (ac + bd)/(c + d ) + (bc − ad)i/(c + d )
```

You can also obtain the absolute value for a complex number using the following formula:
```
|a + bi| = a2 + b2
```

## Deliverables

- 1. Create a UML diagram of a class named Complex that extends the Number class for representing complex numbers. 15 Points

- 2. Implement the class in Java (Complex.java) and add the following methods:

  - (a) add, subtract, multiply, divide, abs for performing complex-number operations. 15 Points

  - (b) Override toString method for returning a string representation for a complex number. The toString method returns a + bi as a string. If b is 0, it simply returns a. 15 Points

  - 3. Provide three constructors 
  ```java
  Complex(a,b), Complex(a), and Complex(). Complex() 
  ```
  creates a Complex object for number 0 and Complex(a) creates a Complex object with 0 for b. 15 Points

- 4. Provide the getRealPart() and getImaginaryPart() methods for returning the real and imaginary part of the complex number, respectively. 15 Points

- 5. Implement the Cloneable and Comparable interfaces.

- 6. Create Java program called Project4 that prompts the user to enter two complex numbers and display the result of their addition, subtraction, multiplication, and division. 15 Points
Here is a sample run:
```
Enter the first complex number: 3.5 5.5
Enter the second complex number: -3.5 1
```
```java
(3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i

(3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i

(3.5 + 5.5i) \* (-3.5 + 1.0i) = -17.75 + -15.75i

(3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094 + -1.7i

|3.5 + 5.5i| = 6.519202405202649
```

- 7. Comment your code. 10 Points

## Extra Credit (Optional) 30 points
If z , z , z are three noncollinear points in the complex space, then the directed or signed area A(z , z , z ) of the triangle with these vertices, Write a program that takes three points speciﬁed by their x and y coordinates and calculates the area using complex numbers. Assume that zn = xn + yni. Compare your result with the formula we used previously in class to calculate the area of a triangle. Call your program Extra.java. Note: Use [https:](https://en.wikipedia.org/wiki/Determinant)

[//en.wikipedia.org/wiki/Determinant](https://en.wikipedia.org/wiki/Determinant)[ ](https://en.wikipedia.org/wiki/Determinant)to solve equation (1).

## Submission
Submit the following items:

- 1. Create a PDF ﬁle with the UML diagram and submit to GitHub.

- 2. Compile, test, and submit your Java program to GitHub (you must submit the program regardless whether it’s complete or incomplete, correct or incorrect) Place your .java ﬁle under the corresponding folder in your local copy of the GitHub repository, commit and push it to the remote repository. Make sure that the professor has access to the repository ```(jfac65-marist).cmpt220lastname\prj\4\Project4.pdf\Project4.java\Complex.java```