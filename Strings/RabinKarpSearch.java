public class RabinKarpSearch {
    public static void main(String[] args) {
        String text = "ABCCDDAEFG";
        String pattern = "CDD";
        int prime = 101;

        rabinKarp(text, pattern, prime);
    }

    static void rabinKarp(String text, String pattern, int prime) {
        int m = pattern.length();
        int n = text.length();
        int pHash = 0, tHash = 0, h = 1;
        int d = 256;

        for (int i = 0; i < m - 1; i++) h = (h * d) % prime;

        for (int i = 0; i < m; i++) {
            pHash = (d * pHash + pattern.charAt(i)) % prime;
            tHash = (d * tHash + text.charAt(i)) % prime;
        }

        for (int i = 0; i <= n - m; i++) {
            if (pHash == tHash) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) System.out.println("Pattern found at index " + i);
            }
            if (i < n - m) {
                tHash = (d * (tHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (tHash < 0) tHash += prime;
            }
        }
    }
}
