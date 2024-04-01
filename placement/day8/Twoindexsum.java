import java.util.Arrays;

public class Twoindexsum {
    public static void main(String[] args) {
        int[] nums = {3, 7, 17, 11}; 
        int target = 10; 
        
        int[] indices = findTwoSum(nums, target);
        
        if (indices != null) {
            System.out.println("Indices of the two elements whose sum is equal to " + target + ": " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No such elements found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return null;
    }
}
