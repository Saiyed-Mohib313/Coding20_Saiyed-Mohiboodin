public class missingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4,5}; 

        int n = arr.length + 1; // no of ele in arr
        int expectedSum = n * (n + 1) / 2; //formula
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);
    }
}
