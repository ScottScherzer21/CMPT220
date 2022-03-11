# Computing Future Investment Value
Scott Scherzer
10/26/2020

#### Problem Description:
Write a method that computes future investment value at a given interest rate for a specified number of years. We can also assume this model will not have to handle zero or negative numbers since we are not expecting a zero percent return or a zero number of years. Also, the model requires capital to operate so we can also assume we will not have to test zero or negative numbers for principal.

#### Analysis
The goal of this project is to create a method to calculate the compounded returns of an investment made or simulated by the user. The formula used to calculate this is:

![CompoundInterest](
https://latex.codecogs.com/svg.latex?\Large&space;P=\&space;P&space;\frac{(1&space;+&space;r)}{12}\Large&space;*years
) 

#### Program and test a functioning method
To begin programming my method I am going to take my variables from the method header. I plugged in the proper formulas with print statements to see what would be returned before I proceeded. All was going accordingly after executing
```java
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){ 
    double future_Investment_Value = investmentAmount * Math.pow((1 + monthlyInterestRate), years*12); 
    return future_Investment_Value; }
```
My output after calling this method was ```12833.586785035119``` so I knew my method functioned properly. 
To raise to the power of numberOfYears*12 I used ```Math.pow();```
All was running fine at this point.

#### Part II: Clean up method and add variables to prepare it for a loop
If we are going to simulate 30 years of this investment compounding it would make much more sense to set up a loop rather than copy and paste many times. Also a loop adds robustness to the program because a different output can be received if the user wants to switch how many years they want to let their investment perform.
I first ran into trouble when I created variables for the input
```java
public static void main(String[] args) { 
    double principal = 10000; 
    double interest = 0.05; 
    int t = 5; //time 
    double i = futureInvestmentValue(principal, interest, t); 
    System.out.println("i: " + i); 
}
```
My output here was ```2.9753582081680648E16```
I then realized my mistake when I read the original formula and saw it was monthly interest, so with a quick tweak to monthlyinterestRate in my method all was well once again.
```java
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){ 
    double future_Investment_Value = investmentAmount * Math.pow((1 + (monthlyInterestRate/12)), years*12); 
    return future_Investment_Value; 
}
```
#### Part III: Create loop
Now I had to begin my loop to match the example output. Now the only change that had to be made was the amount invested, since we are compounding returns. Now since we are showing the yearly returns we are going to have to set years to 1 while we are executing our loop. We want to repeat this for as many years we would like to compound the capital for.
Setting up the loop there is an immediate issue.
```java
double principal = 1000; double interest = 0.09; int t = 30; //t = time
for(int years = 1; t <= years ; years++){ 
    double i = futureInvestmentValue(principal, interest, t); System.out.println(years + " " + i); 
    principal = i; 
}
```
If we let t = 30 for this loop, the loop would assume a 30 year investment period for each loop. The output for this would be
```
1 14730.576123040439
2 216989.87291668908
...
...
30 1.113248149735665E38
```
To fix this, we simply fix our method to 1 rather than t, basically allowing t = 1. The resulting output for this fix would give us the correct output.
To further clean our data, we need to round our output to dollar amounts which would be two decimal places. The formula we will use for this is:
```java
//round to dollars 
i = Math.round(i * 100.0)/100.0;
```
Our output is now:
```30: 14730.576123040419```
However, the issue here is this does not match the example output. 
To fix this I will only print the rounded number, but I will not use it in any of the model calculations.
The code correction I made is:
```java
double answer = Math.round(i * 100.0)/100.0; System.out.println(years + " " + answer); 
```
Since we can also assume this model will not have to handle zero or negative integers, we will not have to test any special variables as we would with other model testing under different circumstances.