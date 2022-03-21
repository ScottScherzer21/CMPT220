# Module 7 - Classes and Objects

CMPT220L\
Due on Oct 30, 2020 by 11:59 PM\
Points: 100

---

## 1. Intersecting point

Write the following method that returns the intersecting point between two lines
(p1, p2) and (p3, p4):

```java
public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4);
```

You'll also need to create a Point class with two private data feilds x and y to represent a point.
The intersection point between two lines can be found by solving the linear equations.

Here is a sample run.

```
Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
The intersecting point is at (2.88889, 1.1111)
```

```
Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
The two lines are parallel
```

---

## 2. Center of a triangle

Write the following method that returns the center of a triangle:

```java
public static Point getCenterPoint(Point p1, Point p2, Point p3);
```

Write a test program that prompts the user to enter three points and displays the center point. Here
is a sample run: (Hint: Use what you created for the previous problem).

```
Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
The center point is at (3.8333333333333335, 1.0)
```

---

## 3 Geometry: area of a triangle

Write a method for computing the
area of a triangle using the following method:

```java
public static double getTriangleArea(Point p1, Point p2, Point p3)
```

Write a program that prompts the user to enter three points of a
triangle and displays the triangle's area.
Here is a sample run of the program:

```
Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
The area of the triangle is 2.25
```

```
Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
The three points are on the same line
```
