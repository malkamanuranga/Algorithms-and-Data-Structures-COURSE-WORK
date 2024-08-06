package BinarySearch;



public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (array[middle] == target) {
                return middle; // Return the index if target is found
            } else if (array[middle] < target) {
                low = middle + 1; // Search the right half
            } else {
                high = middle - 1; // Search the left half
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {-5, -2, 0, 1, 2, 4, 5, 6, 7, 10};
        int target = 5;
        int result = binarySearch(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
