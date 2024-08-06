public class BubbleSortExample {

    // Main function: The program starts to run here. Here, it sets up data and calls to other functions for tasks.
    public static void main(String[] args) {
        // Define an array: An array of integers with some pre-defined values is prepared for the Bubble Sort algorithm.
        int[] array = {220, 146, 22, 19, 6, 42, 14, 5, 48, 47, 17, 39, 51, 7, 2, 99, 65, 7};

        // Print original array: The console displays the initial state of the array before we sort it so that we can compare the two.
        System.out.println("Original Array: ");
        printArray(array);

        // Sort the array: Using bubbleSort() method all elements are rearranged in ascending order starting from smallest element to largest one.
        bubbleSort(array);

        // Print sorted array: At the end of sorting process, this displays sorted arrays in a natural manner on screen indicating change made by sorting.
        System.out.println("Sorted Array (Bubble Sort): ");
        printArray(array);
    }

    // Bubble Sort method: It contains all the rules for arranging numbers in an order through repeating swappings of neighbouring elements.
    public static void bubbleSort(int[] array) {
        // Length of array: A variable ‘n’ is used to keep record of how many numbers need to be put in a sequence for further processing.
        int n = array.length;

        // Swap flag: Through a recent pass across the whole list, if any number was changed; then there must be something wrong which led to swapping them in opposite directions between each other.
        boolean swapped;

        // Outer loop: This runs through every array element, controlling the number of passes. It even shrinks as sorting proceeds.
        for (int i = 0; i < n - 1; i++) {
            // Reset swap flag: The flag 'swapped' should be set to false again before starting each new pass so that we can see if any swaps occurred during the pass.
            swapped = false;

            // Inner loop: It leads through elements of the array and compares adjacent pairs, swapping them when out of order.
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements: It determines whether a current element is greater than its next one; then it is necessary to perform swap operation accordingly.
                if (array[j] > array[j + 1]) {
                    // Swap elements: Elements will be moved around in an array, interchangeably, and hence moving a higher index position for larger one when they are unsorted.

                    // Temporary storage: In this process of exchanging values between two variables that are currently in use, current data will not be corrupted on account of a temporary variable called ‘temp’ that holds the initial value.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Mark swap occurred: Thereafter, lastly at least one exchange took place confirming that our array was not fully sorted yet.
                    swapped = true;
                }
            }

            // Exit loop without swaps: End this iterative process prematurely when there were no exchanges performed in a given pass by breaking out of the loop earlier.
            if (!swapped) break; // Loop escape early: It is better to break off a loop and terminate further passes over an array if it was already sorted through.
        }
    }

    // PrintArray function: A helper method, which allows printing each element of an array separately with spaces between them for clarity purposes.
    public static void printArray(int[] array) {
        // Iterate through and printout: The loop presents every item in an array indicating their arrangement at present in JAVA.
        for (int value : array) {
            // Print items in separate lines: For easier reading, every item is displayed in its own line along with a space after it terminates thus separating them from one another visually across the length of the entire row where those elements exist.
            System.out.print(value + " ");
        }
        // Add newline after array output: Insertion of a new line character will move cursor to next line thereby clearing up screen’s contents, ad we may see.
        System.out.println();
    }
}
