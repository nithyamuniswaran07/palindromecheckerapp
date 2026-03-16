import java.util.Scanner;
import java.util.Stack;
public class UseCase5StackBased {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        boolean isPalindrome = input.equals(reversed.toString());
        System.out.println("Input          : " + input);
        System.out.println("Reversed       : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
