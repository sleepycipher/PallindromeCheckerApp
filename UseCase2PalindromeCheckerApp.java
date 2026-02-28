public class UseCase2PalindromeCheckerApp {

  public static void main(String[] args) {
    String input = "madam";
    boolean isPalindrome = true;
    int n = input.length();

    for (int i = 0; i < n / 2; i++) {
      if (input.charAt(i) != input.charAt(n - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println("Input text: " + input);
    System.out.println("Is it a Palindrome?: " + isPalindrome);
  }
}
