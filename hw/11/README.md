# Module 11 - Recursion
CMPT220L\
Due on Dec 4, 2020 by 11:59 PM\
Points: 100
---

---
## 1. knapsack problem part 1
Given *n* items with weights *w*1*, w*2*, . . . ,* and *wn*, and a bag with a weight capacity of *w*.
The problem of ﬁnding the items with the maximum total weight to store in
the bag is called the 0/1 knapsack problem. Let *m*(*i, w*) denote the
total weight of the best solution of placing the ﬁrst *i* items into a
bag with weight capacity *w*. 

The problem can be solved using the following recursion:
```java
m(0, weightLimit) = 0;
m(i, 0) = 0;
m(i, w) = m(i − 1, weightLimit); 
  
  if wi > weightLimit
    m(i, w) = max(m(i − 1, weightLimit), wi + m(i − 1, weightLimit − wi));
```

Write a recursive method for computing m(i, w) using following method header:

```java
public static double m(int i, double weightLimit, double[] w)
```
where w is an array of the weights for items. Write a test program
that prompts the user to enter the number of the items and weight for
each item and the weight capacity of the bag, and displays the maximum
total weight of the items that can be placed in the bag. Here is a
sample run:

```
Enter the number of items: 5
Enter the weights for each item: 3 7 3 9 2
Enter the weight limit for the bag: 6
The maximum weight of the items placed in the bag is 6.0
```

## 2. knapsack problem part 2 
Revise the preceding problem to ﬁnd the items placed in the bag. 
*Hint*: Use the following recursive method to return an ArrayList that consists of the elements in the bag:
```java
public static ArrayList<Integer> m(int i, double weightLimit, double[] w)
```
Write a test program that prompts the user to enter the number of the
items and weight for each item and the weight capacity of the bag, and
displays the maximum total weight of the items that can be placed in
the bag. Here is a sample run:

```
Enter the number of items: 5
Enter the weights for each item: 3 7 3 9 2
Enter the weight limit for the bag: 6
The maximum weight of the items placed in the bag is 6.0 The items in
the bag are #1 #3
The weights of the items in the bag are 3.0 3.0
```
