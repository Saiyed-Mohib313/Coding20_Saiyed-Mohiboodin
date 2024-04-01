import java.util.Arrays;
public class Removedupliarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5}; // Example array with duplicates, change as needed

        System.out.println("Original array:");
        printArray(arr);

        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArr);
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // No duplicates to remove if array is empty or null
        }

        Arrays.sort(arr); // Sort the array to bring duplicates together

        int j = 0; // Index to keep track of unique elements in the array

        // Iterate through the array and remove duplicates
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; // Move unique element to next available position
            }
        }

        // Create a new array with only unique elements
        int[] uniqueArr = Arrays.copyOf(arr, j + 1);

        return uniqueArr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


