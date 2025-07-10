// Create a Java program that uses the Arrays class to perform the following tasks:

// - Create an integer array numbers with the following elements: 5, 2, 8, 1, 9.
// - Use the Arrays.sort() method to sort the array in ascending order.
// - Use the Arrays.binarySearch() method to find the index of the element 8 in the sorted array.
// - Use the Arrays.toString() method to print the sorted array.
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        java.util.Arrays.sort(numbers);
        int index = java.util.Arrays.binarySearch(numbers, 8);
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
        System.out.println("Index of element 8: " + index);
    }
}