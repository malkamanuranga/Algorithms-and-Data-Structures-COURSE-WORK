package Linear_Search;


public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;
        int result = linearSearch(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}