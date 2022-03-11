# Baby Name Popularity Ranking
### Problem Description
The popularity ranking of baby names from years 2001 to 2010 is downloaded from www.ssa.gov/oact/
babynames and stored in files named 
```babynameranking2001.txt, babynameranking2002.txt, babynameranking2010.txt``` 
Each file contains one thousand lines. Each line contains a ranking, a boy’s
name, number for the boy’s name, a girl’s name, and number for the girl’s name. 

Write a program that prompts the user to enter the year, gender, and followed by a name, and displays
the ranking of the name for the year. Here is a sample run:
```
Enter the year: 2010
Enter the gender: M
Enter the name: Javier
Javier is ranked #190 in year 2010
Enter the year: 2010
Enter the gender: F
Enter the name: ABC
The name ABC is not ranked in year 2010
```
### Deliverables
1. Create a UML diagram for a class called BabyName. The class should hold all the information related
to a baby name. 10 Points
2. Implement the BabyName class. 20 Points
3. Create a method with the following header and use it to load the names from the file: 20 Points
    ```java
    private ArrayList<BabyName> loadNames(String fileName)
    ```
4. Create a method with the following header to implement the search of names: 20 Points
    ```java
    private static BabyName findName(String name, int year, ArrayList<BabyName> names)
    ```
5. Create Java program called Project3. 20 Points
6. Comment your code. 10 Points

### Submission
Submit the following items:
- Create a PDF file with the UML diagram and submit to GitHub.
- Compile, test, and submit your Java program to GitHub (you must submit the program regardless
whether it’s complete or incomplete, correct or incorrect)

Place your .java file under the corresponding folder in your local copy of the GitHub repository,
commit and push it to the remote repository. Make sure that the professor has access to the repository
```(jfac65-marist).cmpt220lastname\prj\3\Project3.pdf\Project3.java```