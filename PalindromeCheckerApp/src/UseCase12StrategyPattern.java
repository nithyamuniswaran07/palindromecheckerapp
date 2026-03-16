import java.util.Scanner;
interface PalindromeStrategy {
    boolean check(String input);
}
class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0, r = cleaned.length() - 1;
        while (l < r) {
            if (cleaned.charAt(l) != cleaned.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}
public class UseCase12StrategyPattern {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        PalindromeStrategy reverse = new ReverseStrategy();
        PalindromeStrategy twoPointer = new TwoPointerStrategy();
        System.out.println("Input               : " + input);
        System.out.println("Reverse Strategy    : " + reverse.check(input));
        System.out.println("TwoPointer Strategy : " + twoPointer.check(input));
        scanner.close();
    }
}
