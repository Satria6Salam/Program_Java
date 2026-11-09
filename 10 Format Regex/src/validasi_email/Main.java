package validasi_email;

public class Main {
    public static void main(String[] args) {
        String email = "example@domain.com";
        if (email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            System.out.println("Valid!");
        } else {
            System.out.println("Tidak valid.");
        }
    }
}
