public class StringFormattingPlaceholders {
    public static void main(String[] args) {
        String name = "Srivinya";
        int age = 25;

        String message = String.format("Name: %s, Age: %d", name, age);

        System.out.println(message);
    }
}
