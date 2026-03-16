import java.util.Scanner;
public class UseCase11OOPService {
    private String input;
    public UseCase11OOPService(String input) {
        this.input = input;
    }
    public String clean() {
        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
    public boolean isPalindrome() {
        String cleaned = clean();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        UseCase11OOPService service = new UseCase11OOPService(input);
        System.out.println("Input          : " + input);
        System.out.println("Cleaned        : " + service.clean());
        System.out.println("Is Palindrome? : " + service.isPalindrome());
        scanner.close();
    }
}
