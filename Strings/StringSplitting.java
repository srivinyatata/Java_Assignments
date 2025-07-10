public class StringSplitting {
    public static void main(String[] args) {
        String input = "apple,banana,orange";
        String[] fruits = input.split(",");

        System.out.println("Split Words:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
