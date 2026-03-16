import java.util.Scanner;
import java.util.LinkedList;
public class UseCase8LinkedList {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) list.add(c);
        boolean isPalindrome = true;
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (!list.get(i).equals(list.get(size - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
