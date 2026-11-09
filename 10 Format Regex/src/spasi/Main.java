package spasi;

public class Main {

    public static void main(String[] args) {
        String input = "    ";
        if (input.matches("\\s+")) {
            System.out.println("Input hanya berisi spasi.");
        } else {
            System.out.println("Input valid.");
        }
    }
}