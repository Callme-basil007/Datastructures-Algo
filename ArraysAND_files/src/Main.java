import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
* Saving the contents of the array using printWriter Object
* Brute Force Algorithm
* The "Big O notation"
* */




public class Main {





    public static void main(String[] args) {

        int[] numbers2 = {10, 20, 30, 40, 50};
        try {
            PrintWriter outputFile = new PrintWriter(new File("Values.txt"));
            for (int i = 0; i < numbers2.length; i++)
                outputFile.println(numbers2[i]);
            outputFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        //Reading the contents of a file into an array is like the saving process  but in an inverted way

        final int SIZE = 10000; /* Assuming we do not know size */
        int[] numbers4 = new int[SIZE];
        int count = 0;
        File file = new File ("Values.txt");
        try {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext() && count < numbers4.length) {
                numbers4[count] = inputFile.nextInt();
                count++;
            }
            /* Truncate the array to the size required */
            numbers4 = Arrays.copyOf(numbers4, count);
            inputFile.close();
        } catch (IOException ex) {
            System.out.println("Error Reading File " + ex.getMessage());
        };

        System.out.printf("the array is :"  + Arrays.toString(numbers4 ) + "\n");

        //<!---------------------testing the methord filter_div2and3---------------------------->

        int[] a = {9,12,20,65,21,24,30};

        int[] b ={12,33,21,13,44,5,3};
        System.out.printf("the array divisible by 2 and 3 is  is :" + Arrays.toString(filter_div2and3(a)) +"\n");  /* Output of one method may be passed to another */
        System.out.println(" the Comparison array that has elements equal or greater :" + Arrays.toString(compare2arrays(a,b)) );


    }
    /* Arrays can be returned from methods.
     Creating a new method that takes array as an integer and only returns  the values that are evenly divisible by 2 and 3
     This is a type of Search algorithm which will return results that meets the specific criteria.
     This type of Algorithm is Known as "Brute Force" Algorithm.
    */
    public static int[] filter_div2and3(int x[]){

        int[] filtered = new int[x.length];  // creating an array to store the results

        int count =0;

        for (int i = 0; i <x.length ; i++) {
            if (x[i] % 2 == 0 && x[i] % 3 == 0 )
            filtered[count++] = x[i];
        }
        return  Arrays.copyOf(filtered,count); // truncating the array upon return

    }

    /*
    * <!---------------------------------The Big O Notation------------------------------------>
    *When the algorithms are analysed  n is commonly used to represent the numb of elements  in a list or collection.
    * This Algorithm requires memory to be stored  the filtered results.
    * The  size of the array allocated will be dependent on the number of elements in x.
    * it is used to analyse both time and space
    * */

    //<-------------------------Practice Question------------------->//

    /*Write a method that will compare two arrays (a,b) and return all the elements in a that are greater than all the elements in b.
     The method must return an array of all the greater than elements.
     Analyze your solution in terms of time and space complexity*/

    /**
     * compare two arrays
     * return all elements in a that are greater than all the elements in b
     * a ->  23,53,21,343,42,2,112,121,453
     * b -> 123,321,22,21,213,121,32,21
     * resulting array looks like this: [343,453]
     * */

    public  static  int[] compare2arrays(int[] a, int[] b){

        int[] compared = new int[a.length];
        int count =0;

        for (int i = 0; i <a.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <b.length ; j++) {
                if (b[j] > a[i]) {
                    flag = false;
                    break;
                }

            }
            if(flag){
                compared[count] = a[i];
                count++;
            }

        }return Arrays.copyOf(compared,count);
    }
}

