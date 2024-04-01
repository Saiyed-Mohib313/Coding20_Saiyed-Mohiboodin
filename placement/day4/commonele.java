import java.util.Arrays;

public class commonele{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.println("Common elements between arrays:");
        findCommonEle(arr1, arr2);
    }

    public static void findCommonEle(int[] arr1, int[] arr2) {
        // Sort both arrays to find common ele
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {

                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                
                i++;
            } else {
            
                j++;
            }
        }
    }
}
