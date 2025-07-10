public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }

    static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i+1), prefix + str.charAt(i));
        }
    }
}
