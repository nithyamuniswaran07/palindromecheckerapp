import java.util.Scanner;
public class UseCase4CharacterArray {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
