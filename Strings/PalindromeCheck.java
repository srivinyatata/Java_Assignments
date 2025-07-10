public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "madam";
        boolean isPalindrome = true;

        int length = original.length();
        for (int i = 0; i < length / 2; i++) {
            if (original.charAt(i) != original.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
