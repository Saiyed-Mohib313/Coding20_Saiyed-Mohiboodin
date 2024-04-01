public class rotatebyK {
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5}; 
            int k = 3; //positions to rotate
    
            System.out.println("Original array:");
            printArray(arr);
    
            rotateLeftByK(arr, k);
    
            System.out.println("\nArray after rotating left by " + k + " positions:");
            printArray(arr);
        }
    
        public static void rotateLeftByK(int[] arr, int k) {
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);
        }
    
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    

