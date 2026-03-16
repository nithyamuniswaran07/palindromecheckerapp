import java.util.Scanner;
public class UseCase13PerformanceComparison {
    public static boolean reverseMethod(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static boolean twoPointerMethod(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(cleaned);
        long time1 = System.nanoTime() - start1;
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(cleaned);
        long time2 = System.nanoTime() - start2;
        System.out.println("Input               : " + input);
        System.out.println("Reverse Method      : " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Two Pointer Method  : " + result2 + " | Time: " + time2 + " ns");
        scanner.close();
    }
}
