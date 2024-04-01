import java.util.Scanner;

public class highrepelet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        

        String result = findLetters(str);
        System.out.println("Output: " + result);
    }

    public static String findLetters(String str) {
        String[] words = str.split("\\s+");
        String maxWord = null;
        int maxRepeatedCount = 0;

        for (String word : words) {
            int[] count = new int[26]; 

            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    count[ch - 'a']++;
                }
            }

            int maxCount = 0;
            for (int letterCount : count) {
                maxCount = Math.max(maxCount, letterCount);
            }

            if (maxCount > 1 && maxCount > maxRepeatedCount) {
                maxRepeatedCount = maxCount;
                maxWord = word;
            }
        }

        return maxWord != null ? maxWord : "-1";
    }
}
