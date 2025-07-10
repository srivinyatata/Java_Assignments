public class ReplaceCharacter {
    public static void main(String[] args) {
        String input = "banana";
        char oldChar = 'a';
        char newChar = 'o';

        String result = input.replace(oldChar, newChar);

        System.out.println("Replaced: " + result);
    }
}
