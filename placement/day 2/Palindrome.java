import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = sc.nextInt();

        boolean isPal = isPalindrome(number);

        if (isPal) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        
    }
}
