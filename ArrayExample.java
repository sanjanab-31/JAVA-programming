public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        java.util.Arrays.sort(numbers);
        int index = java.util.Arrays.binarySearch(numbers, 8);
        System.out.println("Sorted array " + java.util.Arrays.toString(numbers));
        System.out.println("Index " + index);
    }
}