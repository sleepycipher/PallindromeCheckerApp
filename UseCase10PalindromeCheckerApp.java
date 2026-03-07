public class UseCase10PalindromeCheckerApp {

  public static void main(String[] args) {
    String input = "A man a plan a canal Panama";

    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    boolean isPalindrome = true;
    int length = normalized.length();

    for (int i = 0; i < length / 2; i++) {
      if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println("Input: " + input);
    System.out.println("Is Palindrome?: " + isPalindrome);
  }
}
