import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        
        String input = "civic";

        
        Queue<Character> queue = new LinkedList<>();

       
        Stack<Character> stack = new Stack<>();

        
        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        
        boolean isPalindrome = true;

        
        while (!queue.isEmpty()) {

            char qChar = queue.remove();  // dequeue
            char sChar = stack.pop();     // pop

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}