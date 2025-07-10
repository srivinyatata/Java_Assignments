public class WordReversal {
    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        String reversed = "";

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i != 0) {
                reversed += " ";
            }
        }
        System.out.println(reversed);
    }
}
