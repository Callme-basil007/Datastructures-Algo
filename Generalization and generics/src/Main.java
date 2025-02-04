import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] unsortedarray = {1,2,5,6,90,33,12,4,55};
        System.out.println("UnSotred array:" +Arrays.toString(unsortedarray)+"\n");

        int[] sortedArray =selectionSort(unsortedarray);
        System.out.println("Sotred array:" + Arrays.toString(sortedArray) +"\n");
    }
    public static int[] selectionSort(int[] sortedArray) {
        int startScan; // Starting position of the scan
        int index; // To hold a subscript value
        int minIndex; // Element with smallest value in the scan
        int minValue; // The smallest value found in the scan
// The outer loop iterates once for each element in the
// array. The startScan variable marks the position where
// the scan should begin.
        for (startScan = 0; startScan < (sortedArray.length - 1); startScan++) {
// Assume the first element in the scannable area
// is the smallest value.
            minIndex = startScan;
            minValue = sortedArray[startScan];
// Scan the array, starting at the 2nd element in
// the scannable area. Find
// smallest value in the scannable area.
            for (index = startScan + 1; index < sortedArray.length; index++) {
                if (sortedArray[index] < sortedArray[minIndex]) { // (A) *** Comparison
                    minIndex = index;
                }
            }
// Swap the element with the smallest value
// with the first element in the scannable area.
            swap(sortedArray,startScan,minIndex);
        }
        return sortedArray;
    }
    private static void swap(int[] array, int a, int b) {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}