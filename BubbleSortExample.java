public class BubbleSortExample {

    // The main function_ in Here starts will be happend of the program execution .
    public static void main(String[] args) {
        // Define an array of integers to be sorted using Bubble Sort.
        int[] array = {220, 146, 22, 19, 6, 42, 14, 5, 48, 47, 17, 39, 51, 7, 2, 99, 65, 7};

        // Print the original (unsorted) array, which will be printed in  to the console.
        System.out.println("Original Array: ");
        printArray(array);

        // Call the bubbleSort method to sort the array in ascending(from low  to high) order.
        bubbleSort(array);

        // From here we Print the sorted array to the console.
        System.out.println("Sorted Array (Bubble Sort): ");
        printArray(array);
    }

    // The bubbleSort method- This method implements the Bubble Sort algorithm.
    public static void bubbleSort(int[] array) {
        int n = array.length; // Get the length of the array and store it in variable n.
        boolean swapped; // This flag will indicate if any swaps were made during a pass.

        // Outer loop: Controls the number of passes over the array.
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swapped flag at the beginning of each pass.

            // Inner loop: Compares adjacent elements and swaps them if they are in the wrong order.
            for (int j = 0; j < n - 1 - i; j++) {
                // Check if the current element is greater than the next element.
                if (array[j] > array[j + 1]) {
                    // Swap the elements if they are in the wrong order.
                    int temp = array[j]; // Temporarily store the value of array[j].
                    array[j] = array[j + 1]; // Move the smaller element to the left.
                    array[j + 1] = temp; // Place the larger element to the right.

                    swapped = true; // Set swapped to true, as a swap has occurred.
                }
            }

            // If no swaps were made during the pass, the array is already sorted.
            if (!swapped) break; // Exit the loop early, improving efficiency.
        }
    }

    // The printArray method: This helper method prints the elements of the array to the console.
    public static void printArray(int[] array) {
        // Loop through each element in the array and print it.
        for (int value : array) {
            System.out.print(value + " "); // Print each element followed by a space.
        }
        System.out.println(); // Move to the next line after printing the array.
    }
}
 