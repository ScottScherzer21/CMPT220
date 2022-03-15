# Module 6 - Arrays
CMPT220L\
Due on Oct 23, 2020 by 11:59 PM\
Points: 100
---


## 1. Area of a polygon
Write a program that prompts the user to enter the points of a convex polygon and
display its area. Assume that the polygon has six end points and the points are entered clockwise. For
the definition of a convex polygon, see http://www.mathopenref.com/polygonconvex.html. 
Hint: the total area of a polygon is the sum of the areas of the small triangles as shown in Figure 1.


## 2. Occurrences of each digit in a string
Write a method that counts the occurrences of each digit in a
string using the following header
```java
public static int[] count(String s)
```

The method counts how many times a digit appears in the string. The return value is an array of
ten elements, each of which holds the count for a digit. 
For example, after executing int[] counts = count("12203AB3"), counts[0] is 1, counts[1] is 1, counts[2] is 2, and counts[3] is 2. 

Write a test program that prompts the user to enter a string and displays the number of occurrences of each
digit in the string.
```
Enter a string: 23231adbc1234
Digit 1 occurs 2 times
Digit 2 occurs 3 times
Digit 3 occurs 3 times
Digit 4 occurs 1 time
```
## 3. Anagrams
Write a method that checks whether two words are anagrams. Two words are anagrams
if they contain the same letters in any order. For example, silent and listen are anagrams. The header
of the method is:
```java
public static boolean isAnagram(String s1, String s2)
```
Write a test program that prompts the user to enter two strings and, if they are anagrams, displays
two strings are anagrams, and displays two strings are not anagrams if they are not anagrams.

## 4. Algebra: 2x2 matrix inverse

Implement the following method to obtain an inverse of the matrix:
```java
public static double[][] inverse(double[][] A)
```

Write a test program that prompts the user to enter a, b, c, d for a matrix, and displays its inverse
matrix. Here is a sample run:
```
Enter a, b, c, d: 1 2 3 4
-2.0 1.0
1.5 -0.5
```
```
Enter a, b, c, d: 0.5 2 1.5 4.5
-6.0 2.6666666666666665
2.0 -0.6666666666666666
Enter a, b, c, d: 1 2 3 6
No inverse matrix
```