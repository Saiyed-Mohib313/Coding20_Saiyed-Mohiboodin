public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 

        System.out.println("Original array:");
        printArray(arr);

        rotateLeft(arr);

        System.out.println("\nArray after rotating left by 1 position:");
        printArray(arr);
    }

    public static void rotateLeft(int[] arr) {
        
        int temp = arr[0]; // Store first temporarily

        // Shift to left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Move first to end
        arr[arr.length - 1] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
