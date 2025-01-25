import java.util.*;

public class Main {
    public static void main(String[] args) {




        /*------------------------------ARRAYS----------------------------- */

//All arrays are objects in java  and are allotted dynamically.

        int [] numbers;      // An array reference
        numbers =new int[6];   // Creates an array of 6 integers

// when an array is created all values are assigned zero(0)
// The array size mmust be a non negative number
// A refference for an array can be created and allocated seperately

        final int ARRAY_SIZE = 6;
        int[] numbers1 = new int[ARRAY_SIZE];
        int[] later;

// Once an array is created its size is fixed and connot be changed
// An array consist of a single public property called .length

        int numberofElements = numbers1.length;

// AN array index always starts at 0
// Accessing an array outside range resultes in ArrayOutOfBoundException

        /* An array referrence can be assigned to anothert array of same type. this is called a reference copy.
         * if there are no valid  refernces the memory will be reclaimed by JVM this is called "Garbage Collection"
         *
         * if there are 2 refferences to the same location  assigning array1[2] = 100 would also result in array2[2] = 100
         */


        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = array1;                /* This does NOT copy array1 to array2. */


// So insted to properly copy an array use copy of methord

        int[] x = {10,20,30,40,50};
        int[] y = Arrays.copyOf(x, x.length);  /* Correct independent copy procedure */

// Arrays can be passeed to methords and can print the contents of an array

//        public static void print_Array(int[x]){
//
//            System.out.print("[");
//            for(int i =0; i <x.length; i++){
//                System.out.print(x[i]);
//                if(i<x.length -1)
//                    System.out.print(",");
//
//            }
//            System.out.print("[");
//        }



        /*---------------------------------PRACTISE question --------------------------------- */

/*
    Write a method called arrayEquals that will confirm that the elements of one array are equal to the contents of a second array.
    Both arrays must be passed as arguments to the method.
    For the arrays to be considered equal they must be the same length and the elements values must be in the same order.
    The method must return true if the arrays are equal and false if not.
    <!--------------------------- Question 2------------------!>
    Write a method that is like the previous method and call it arrayContentsEquals.
    This method will consider the arrays equal if the contents are the same, but the order of the contents in the array may differ.
    Again, return true if the contents are equal and false if not.  Do this without sorting the arrays first.

    */

        int[] array_1 ={1,2,3,4,5};
        int[] array_3 ={1,3,2,5,4};


        int[] array_2 ={1,2,3,4,6};
        System.out.print(" The arrays are " + arrayEquals(array_1,array_2) );
        System.out.print(" The arrays  conents are no matter the order " + arrayContentEquals(array_1,array_3) );




    }

    public static Boolean arrayEquals(int[] array_1, int[] array_2){

       boolean isvalid = true;

        if (array_1.length == array_2.length){

            for(int i =0; i <array_1.length; i++){
                if (array_1[i] != array_2[i]){

                    isvalid = false;
                }

            }
        }
        return  isvalid;


    }

    public static Boolean arrayContentEquals(int[] array_1, int[] array_3) {

        boolean isvalid = true;


        for (int i = 0; i < array_1.length; i++) {
            isvalid = false;
            if (array_1[i] != array_3[i]) {
                for (int j = 0; j < array_3.length; j++) {
                    if (array_1[i] == array_3[j]) {
                        isvalid = true;
                        break;
                    }
                }
            }else{
                isvalid = true;
            }

        }
        return isvalid;
    }
}




