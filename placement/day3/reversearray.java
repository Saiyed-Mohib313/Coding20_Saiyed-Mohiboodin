import java.util.Arrays;
public class reversearray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr)); 
    }
    public static void reverse(int[] arr) {
        int lf = 0;
        int rt = arr.length - 1;
        while (lf< rt) {
            int temp = arr[lf];
            arr[lf] = arr[rt];
            arr[rt] = temp;
            lf++;
            rt--;
        }
    }
}