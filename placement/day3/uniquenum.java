import java.util.Arrays;
public class uniquenum {
    


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9}; 
        printUniqueNum(arr);
    }

    public static void printUniqueNum(int[] arr) {
        // Sort to group dupli together
        Arrays.sort(arr);

        System.out.println("Unique no in array:");
        // Traverse only unique 
        for (int i = 0; i < arr.length; i++) {
            // it is unique
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
            // it's a duplicate
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
    }
}


