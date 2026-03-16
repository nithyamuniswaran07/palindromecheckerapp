import java.util.Scanner;
public class UseCase9Recursive {
    public static boolean isP(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isP(s, l + 1, r - 1);
    }
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        boolean isPalindrome = isP(input, 0, input.length() - 1);
        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
