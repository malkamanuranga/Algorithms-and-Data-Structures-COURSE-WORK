public class MergeSortExample {

    public static void main(String[] args) {
        int[] array = {220, 146, 22, 19, 6, 42, 14, 5, 48, 47, 17, 39, 51, 7, 2, 99, 65, 7};

        // Display the original list: Show the initial state of the list before applying sort algorithm to have a look at the unsorted data.
        System.out.println("Original Array: ");
        printArray(array);

        // Perform Merge Sort: Do merge sort operation in order to change the data in the array into ascending order.
        mergeSort(array, 0, array.length - 1);

        // Display the sorted array: Print out an ordered sequence of elements denoted by which array was used after sorting it.
        System.out.println("Sorted Array (Merge Sort): ");
        printArray(array);
    }

    // Merge Sort method: It splits array into halves, sorts each by recursive means and then merges them together.
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point: Find a mid-index for current part of the array to divide it on two halves for further sorting.
            int middle = (left + right) / 2;

            // Recursively sort the first half: Apply merging sorting on one half side of a part of an array.
            mergeSort(array, left, middle);

            // Recursively sort the second half: Apply merging sorting on another half side of a part of an array.
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves: By comparing elements from each half, get one sorted whole from two different completely sorted arrays.
            merge(array, left, middle, right);
        }
    }

    // Merge two subarrays of array[]: Merge two subarrays one by one. Maintain sorted order for the resulting merged subarray.
    public static void merge(int[] array, int left, int middle, int right) {
        // The sizes for the subarrays to merge: Determine the number of elements in each subarray to be merged.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays for each subarray: Make use of two temporary arrays. One array holds elements of the left subarray and the other array holds the elements of the right subarray.
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        

        // Copy data to temporary arrays leftArray[] and rightArray[]: Copy the elements from the original array into the temporary left and right subarrays.
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

        // Initial indexes for leftArray[], rightArray[], and mergedArray[]: Define three initial starting indexes for traversing through the left subarrays and right subarrays in the temporary storage arrays. Also, delineate the initial index for the merged subarray in the original array.
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            // Pick smaller element of leftArray[j] and rightArray[j]: Compare and sort through the elements each subarray contains, and put the smaller of the two elements in the original array.
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any: There may be some elements that could be left out in the left subarray. If so, move these elements to the original array one by one.
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[] if any: There may be some unevaluated elements in the right subarray. If so, transfer/copy these remaining elements from the right subarray one by one to the original array.
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // A helper method to print the array: This is a utility/peripheral method to print/display each element used for showing all the elements of the original array after each step.
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
