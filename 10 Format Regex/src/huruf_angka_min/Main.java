package huruf_angka_min;

public class Main {
    public static void main(String[] args) {
        String password = "abc,,787234512313asa";

        if (password.matches("(?=.*[a-zA-Z])(?=.*\\d).{8,}")) {
            System.out.println("Password valid!");
        } else {
            System.out.println("Password harus minimal 8 karakter dan mengandung huruf serta angka.");
        }
    }
}
