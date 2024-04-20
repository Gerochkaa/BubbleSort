import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String bubbleSort(int[] numbers) {
        System.out.println("******|Bubble Sort|******");
        StringBuilder originalArray = new StringBuilder();

        for (int i = 0; i <= numbers.length - 1; i++) {
            originalArray.append(numbers[i] + 50);
        }
        System.out.println("originalArray" + originalArray);
        int temp;


        boolean pass = true;

        int comparisons = 0;
        int swaps = 0;


        while (pass) {
            //Set the boolean value to false,
            //indicating a number swap could
            //be made.
            pass = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                //increment the number of comparisons by 1.
                comparisons++;
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;

                    //increment the amount of swaps made by 1,
                    //to put numbers in correct order.
                    swaps++;
                    pass = true;
                }
            }
        }


        StringBuilder sb = new StringBuilder();

        //Loop through the now sorted array - appending
        //each subsequent number in the array to the
        //StringBuilder object.
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + " ");
        }

        //Return the final results of the sorted array.
        return "Sorted Array (asc): " + sb.toString() + "\nComparisons made: " + comparisons
                + "\nSwaps made: " + swaps;
    }

    public static String selectionSort(int[] numbers) {
        System.out.println("******|Selection Sort|******");
        StringBuilder originalArray = new StringBuilder();

        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            originalArray.append(numbers[i] + 50);
        }
        System.out.println("Original array: " + originalArray);


        int first;

        //declare temporary variable, to be used in
        //swapping integers.
        int temp;

        for (int x = numbers.length - 1; x > 0; x--) {
            first = 0;
            comparisons++;
            for (int y = 1; y <= x; y++) {
                //comparisons++;
                if (numbers[y] > numbers[first]) {
                    first = y;
                    //comparisons++;
                    swaps++;
                }
                temp = numbers[first];
                numbers[first] = numbers[x];
                numbers[x] = temp;
                //swaps++;
            }
        }

        //Create a StringBuilder object - to hold
        //the output of sorted numbers.
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + 50);
        }

        //Return the final results of the sorted array.
        return "Sorted Array (asc): " + sb.toString() + "\nComparisons made: " + comparisons
                + "\nSwaps made: " + swaps;
    }

    public static void testSortingAlgorithms(int[] array) {
        int[] arrayCopy1 = Arrays.copyOf(array, array.length);
        int[] arrayCopy2 = Arrays.copyOf(array, array.length);

        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.print("Bubble Sort: ");
        bubbleSort(arrayCopy1);

        System.out.print("Selection Sort: ");
        selectionSort(arrayCopy2);

        System.out.println("Sorted Array: " + Arrays.toString(arrayCopy1));
        System.out.println();
    }




    // Method to generate a sorted array of specified size
    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    // Generate arrays
    int[] randomArray = generateRandomArray(50);

    private int[] generateRandomArray(int i) {
        return new int[0];
    }

    int[] sortedArray = generateSortedArray(50);
    int[] reverseSortedArray = generateReverseSortedArray(50);

    private int[] generateReverseSortedArray(int i) {
        return new int[0];
    }
}
//CONCLUSION:
// Both sorting algorithms have time complexities of O(n^2) in the worst-case scenario, making them inefficient for large datasets.
//Selection sort generally performs better than bubble sort, especially on arrays with a larger number of elements or with a higher degree of sortedness.











