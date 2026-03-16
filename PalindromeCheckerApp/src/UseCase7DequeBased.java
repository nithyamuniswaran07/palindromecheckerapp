import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
public class UseCase7DequeBased {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) deque.add(c);
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
