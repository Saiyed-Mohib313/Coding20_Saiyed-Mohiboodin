import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for Fibonacci series: ");
        int n = sc.nextInt();
        

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to the " + n + "th term:");
        
        if (n >= 1) {
            System.out.print(firstTerm);
        }
        
        if (n >= 2) {
            System.out.print(", " + secondTerm);
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}


