# Module 9 - Exception Handling

CMPT220L\
Due on Nov 13, 2020 by 11:59 PM\
Points: 100

---

## 1. ArrayIndexOutOfBoundsException

Write a program that meets the following requirements:

1. Creates an array with 100 randomly chosen integers.

2. Prompts the user to enter the index of the array, then displays the
   corresponding element value.  
   If the speciﬁed index is out of bounds,
   display the message `"Out of bounds"`.

---

## 2. NumberFormatException

Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number.

Implement the `bin2Dec` method to throw a `NumberFormatException` if the string is not a
binary string.\
Write a test program that prompts the user to enter a
binary number as a string and displays its decimal equivalent.\  
If the method throws an exception, display `"Not a binary number".`

---

## 3. BinaryFormatException)

Modify the previous problem, by deﬁning a
custom exception called `BinaryFormatException`

Implement the bin2Dec method to throw a
`BinaryFormatException` if the string is not a binary string.
