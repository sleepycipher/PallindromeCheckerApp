import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

  public static void main(String[] args) {
    String input = "noon";
    Stack<Character> stack = new Stack<>();

    // Push each character of the string into the stack
    for (char c : input.toCharArray()) {
      stack.push(c);
    }

    boolean isPalindrome = true;

    // Pop and compare with the original sequence
    for (char c : input.toCharArray()) {
      if (c != stack.pop()) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println("Input: " + input);
    System.out.println("Is Palindrome?: " + isPalindrome);
  }
}
