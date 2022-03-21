# Module 3 - Selections

CMPT220L\
Due on Sep 25, 2020 by 11:59PM\
Points: 100

---

## 1. Reduce fractions

Write a program that prompts the user to enter the numerator and denominator of
a fraction. The program determines whether the number is a proper fraction or an improper fraction.
If it is a proper fraction, display the number. If not, reduce it to a mixed fraction or to an integer.
Here are sample runs:

```
Enter a numerator: 45
Enter a denominator: 46
45 / 46 is a proper fraction
```

```
Enter a numerator: 45
Enter a denominator: 15
45 / 15 is an improper fraction and it can be reduced to 3
```

```
Enter a numerator: 45
Enter a denominator: 25
45 / 25 is an improper fraction and its mixed fraction is 1 + 20 / 25
```

## 2. Slope-intercept form

Write a program that prompts the user to enter the coordinates of two points
(x1, y1) and (x2, y2), and displays the line equation in the slope- intercept form, i.e., y = mx+b. For a
review of line equations, see http://www.purplemath.com/modules/strtlneq.htm.

**_m_** and **_b_** can be computed using the following formulas:

![slopeIntercept](https://latex.codecogs.com/svg.latex?\Large&space;m=&space;y2-&space;\frac{y1}{x2}\Large&space;-x1)

![slopeIntercept2](https://latex.codecogs.com/svg.latex?\Large&space;b=&space;y1&space;&space;-mx1)

Don’t display m if it is 1 and don’t display b if it is 0

Here are sample runs:

```
Enter the coordinates for two points: 1 1 0 0
The line equation for two points (1, 1) and (0, 0) is y = x
```

```
Enter the coordinates for two points: 4.5 -5.5 6.6 -6.5
The line equation for two points (4.5, -5.5) and (6.6, -6.5) is
y = -0.47619x - 3.35714
```

## 3. Random point

Write a program that generates a random point inside a circle. The circle is centered
at (0, 0) with a radius 5.

Display the point and its distance to the center.

Here are sample runs:

```
The point is (-3.3878721143708708, 3.1409080280010944)
and its distance to the center is 4.619846393950072
```

```
The point is (-0.14972878708817536, 4.986535034124079)
and its distance to the center is 4.9887824522852995
```

## 4. Random response message

Modify the subtraction quiz in Listing 3.3 to display one of the following
messages (excellent, correct, way to go) randomly if the student gives a correct answer and display one
of the following messages (incorrect, wrong, not right) randomly if the student gives an incorrect answer.

Here is a sample run:

```
What is 7 - 0? 7
way to go
```

```
What is 4 - 2? 2
correct
```

```
What is 6 - 4? 2
excellent
```

```
What is 7 - 3? 3
incorrect
7 - 3 should be 4
```

```
What is 3 - 2? 2
wrong
3 - 2 should be 1
```
