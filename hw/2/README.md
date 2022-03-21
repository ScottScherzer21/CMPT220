# Module 2 - Elementary Programming

CMPT220L  
Due on Sep 11, 2020 by 11:59PM\
Points: 100

---

## 1. Rectangle perimeter, area, and diagonal length

Write a program that prompts the user to enter the
width and height of a rectangle and displays the perimeter, area, and the length of diagonal. Here is
a sample run:

```
Enter the width and height of a rectangle: 4.25 7.26
The perimeter is 23.02
The area is 30.855
The length of the diagonal is 8.412496656760108
```

## 2. Physics: one dimensional motion

By one dimension, we mean that the object is moving in a straight
line. There are five variables that put together in several equations for describing this motion:

Eq1:

![eq1](https://latex.codecogs.com/svg.latex?\Large&space;v1=&space;v0&space;+&space;a&space;*t)

Eq2:

![eq2a](https://latex.codecogs.com/svg.latex?\Large&space;d=&space;avgSpeed&space;*&space;t)

![eq2b](<https://latex.codecogs.com/svg.latex?\Large&space;avgSpeed=&space;\frac{(v0&space;+&space;v1)}{2}>)

Eq3:

![eq3](https://latex.codecogs.com/svg.latex?\Large&space;d=&space;v0&space;*&space;t&space;+&space;a&space;*\frac{t^{2}}{2})

Eq4:

![eq4](https://latex.codecogs.com/svg.latex?\Large&space;v\frac{2}{1}&space;=&space;v\frac{2}{0}&space;+&space;2&space;*&space;a&space;*&space;d&space;)

Where

```v1 is the final velocity in meters per second (m/s)
v0 is the initial velocity in meters per second (m/s)
t is the time elapsed in seconds
a is the object’s acceleration in meters per square second (m/s2)
d is the distance traveled in meters
```

Suppose a ball is released from the top of a building, you can write a program to find out the height
of the building, given the travel time for the ball to the ground using Eq3. Note that the acceleration
due to gravity is constant 9.8 m/s.

Here is a sample run:

```
Enter the ball travel time in seconds: 2.5
The height of the building is 30.625 meters
```

## 3. Physics: friction coefficient

The force pushing or pulling an object is related to the object’s mass,
acceleration, and a coefficient of friction in the following formula:

![fC](<https://latex.codecogs.com/svg.image?\Large&space;F&space;=&space;u&space;*&space;m&space;*&space;g&space;+&space;(m&space;*&space;a)>)

Where
F is the force applied to push or pull an object in Newtons (N)
u is a coefficient of friction (u is small for a smooth surface and large for a rough surface)
m is the object’s mass in kilograms (kg)
g is the acceleration due to gravity, which is a constant 9.8 m/s (meters per square second)
a is the object’s acceleration in meters per square second (m/s) 1
Write a program that prompts the user to enter input for F , m, and a, and displays the coefficient of friction.

Here is a sample run:

```
Enter the friction force in Newtons: 150
Enter the object’s mass in kg: 24.5
Enter the object’s acceleration in m/s^2: 4.5
The coefficient for friction is 0.165556
```

## 4. Slope of a line

Write a program that prompts the user to enter the coordinates of two points (x1,
y1) and (x2, y2), and displays the slope of the line that connects the two points. The formula of the
slope is

![slope](<https://latex.codecogs.com/svg.latex?\Large&space;slope=\frac{(y2&space;-&space;y1)}{(x2&space;-&space;x1)}>)

Here is a sample run:

```
Enter the coordinates for two points: 4.5 -5.5 6.6 -6.5
The slope for the line that connects two points (4.5, -5.5) and (6.6, - 6.5) is -0.47619
```
