import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class UseCase6QueueStack {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
