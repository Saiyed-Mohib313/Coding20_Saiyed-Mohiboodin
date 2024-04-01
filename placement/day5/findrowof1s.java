import java.util.Scanner;
public class findrowof1s {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] num = new int[rows][cols];

        // Input
        System.out.println("Enter the elements of the 2D array (0 or 1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("The 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        // Find row with maximum number of 1's
        int maxOnesRow = findRowWithMaxOnes(num);
        if (maxOnesRow != -1) {
            System.out.println("Row with maximum number of 1's: " + maxOnesRow);
        } else {
            System.out.println("No row contains 1's.");
        }
    }

    public static int findRowWithMaxOnes(int[][] num) {
        int maxOnesRow = -1;
        int maxOnesCount = 0;

        for (int i = 0; i < num.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }

        return maxOnesRow;
    }
}


