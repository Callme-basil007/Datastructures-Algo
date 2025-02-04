import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[] {10,43,5,47,62,11,41,55};
        int[] B;
        System.out.println("SELECTION SORT");
        B = Arrays.copyOf(A, A.length);
        System.out.println("Before Sort : " + Arrays.toString(B));
        selectionSort(B);
        System.out.println("After Sort : " + Arrays.toString(B));
        MyCompare c = (int s1, int s2) -> {return s1 < s2;};
//        MyCompare cdesc = (int s1, int s2) -> {return s1 > s2;};
//        selectionSort(B,c);

        MyCompare cSumDigits = (int s1,int s2)->{

            int sum1 = 0,sum2 =0;
            sum1 =s1% 10 +s1/10;
            sum2 =s2%10 +s2/10;
            return sum1 > sum2; // sorting in descending order
        }
    }
    public static void selectionSort(int[] array) {
        int startScan ,index,minIndex,minValue;

/*The outer loop iterates once for each element in the
 array. The startScan variable marks the position where
 the scan should begin.
 */
        for (startScan = 0; startScan < (array.length - 1); startScan++) {

        /* Assume the first element in the scannable area
        is the smallest value.
        */
            minIndex = startScan;
            minValue = array[startScan];

// Scan the array, starting at the 2nd element in the scannable area. Find the smallest value in the scannable area.

            for (index = startScan + 1; index < array.length; index++) {
                if (c.compare(array[index], array[minIndex])) {
                    minIndex = index;
                }
            }
// Swap the element with the smallest value  with the first element in the scannable area.

            swap(array,startScan,minIndex);
        }
    }
    private static void swap(int[] array, int a, int b) {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    /**
     * Interface that defines a Comparison method that
     * can be implemented as a Lambda expression
     */
    interface MyCompare {
        public boolean compare(int s1, int s2);
    }
    public static void selectionSort(int[] array, MyCompare c) {

    }
}