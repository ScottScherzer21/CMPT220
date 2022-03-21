# Project 1

CMPT220L - Software Development I\
Due on Oct 9, 2020 by 11:59PM\
Points: 100

---

## Description

The goal of this project is to create a Java program that creates a histogram from a sequence of numbers.

A histogram is an approximate representation of the distribution of numerical data.

- The x-axis represents the values that we want to display the frequency for.

- The y-axis represents the number count of occurrences in
  the data for each column and can be used to visualize data distributions.

For this project, the value entered represents both,
the label for the x-axis as well as the value that
represents the frequency.

Hint: Read all the values at once using a scanner,
with the `nextLine()` method.

```
Input : 10 9 12 4 5 2 8 5 3 1
Output :
12 | x
11 | x
10 | x x
9  | x x x
8  | x x x x
7  | x x x x
6  | x x x x
5  | x x x x x x
4  | x x x x x x x
3  | x x x x x x x x
2  | x x x x x x x x x
1  | x x x x x x x x x x
0  | x x x x x x x x x x
---------------------------------------
    10 9 12 4 5 2 8 5 3 1
```
