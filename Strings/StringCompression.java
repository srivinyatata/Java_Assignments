public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbcddd";
        String compressed = "";

        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed += input.charAt(i);
                compressed += count;
                count = 1;
            }
        }
        System.out.println("Compressed String: " + compressed);
    }
}
