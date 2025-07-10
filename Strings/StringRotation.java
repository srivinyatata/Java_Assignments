public class StringRotation {
    public static void main(String[] args) {
        String original = "waterbottle";
        String rotated = "erbottlewat";

        boolean isRotation = checkRotation(original, rotated);

        if (isRotation) {
            System.out.println(rotated + " is a rotation of " + original);
        } else {
            System.out.println(rotated + " is not a rotation of " + original);
        }
    }

    static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String combined = s1 + s1;

        return combined.contains(s2);
    }
}
