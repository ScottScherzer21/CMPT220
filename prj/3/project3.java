import java.io.*;
import java.util.*;

public class project3 {

    private static ArrayList<BabyName> loadNames(String fileName) throws FileNotFoundException {

        // create a scanner to look through text file
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        // Create an ArrayList to receive the date from the scanner
        ArrayList<BabyName> arraylist_file = new ArrayList<>();

        for(int i = 0; input.hasNext(); i++){
            
            //create variables for instances
            String rank = input.next();
            String boyname = input.next();
            String m_frequency = input.next();
            String girlname = input.next();
            String f_frequency = input.next();

            //Create an object
            BabyName namevar = new BabyName();

            //Add instaces
            namevar.rank = rank;
            namevar.boyname = boyname;
            namevar.boyname_frequency = m_frequency;
            namevar.girlname = girlname;
            namevar.girlname_frequency = f_frequency;

            //add the object to the Arraylist
            arraylist_file.add(i, namevar);
        }

        input.close();

        return arraylist_file;
    }

    private static BabyName findName(String name, int year, ArrayList<BabyName> names){

        //get the length of the ArrayList (Should be 1000)
        int len = names.size();

        //create 2 new objects, one for a test value and one for the answer.
        //if the answer isnt found within the file, the object "Answer" will remain null
        //asnwer being null is how i will handle the name not being found in the file.
        BabyName answer = new BabyName();
        BabyName test = new BabyName();

        for(int i = 0; i < len; i++){
            
            //select an object to test 
            test = names.get(i);

            //if the name is an instance of the object, thats the answer
            if(test.boyname.equals(name)){
                answer = test;
                break;

            //check girl name if not a boy name     
            }else if(test.girlname.equals(name)){
                answer = test;
                break;
            }
        }
        return answer;
    }

    // if the file is incorrect, throw the FNF Error.
    public static void main(String[] args) throws FileNotFoundException {


        /*
        String name = "Javier";
        String gender = "M";
        int year = 2010;
        */
        

        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        input.close();
        
        // load the file
        ArrayList<BabyName> names = loadNames("names" + year + ".txt");
        
        //create a new object to hold the answer 
        BabyName answer = new BabyName();
        answer = findName(name, 2001, names);

        //a null value being returned means the name does not exist in the file 
        if(answer.rank == null){
            System.out.println("The name " + name + " is not ranked in year " + year);
        }

        //if an error isnt thrown, the the name exists within the file. 
        //Extract the instances from the object now that we know we have the right one
        else{
            if(answer.boyname.equals(name)){
                System.out.println(answer.boyname + " is ranked #" + answer.rank + " in the year " + year);

            }else if (answer.girlname.equals(name)){
                System.out.println(answer.girlname + " is ranked #" + answer.rank + " in the year " + year);
            }
        }
    }
}

class BabyName{
    String rank, boyname, boyname_frequency, 
    girlname, girlname_frequency;
}
