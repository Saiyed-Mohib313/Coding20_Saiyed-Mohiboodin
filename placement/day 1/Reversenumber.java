public class Reversenumber{
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        int number = 123456789;
        int reversedNumber = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
