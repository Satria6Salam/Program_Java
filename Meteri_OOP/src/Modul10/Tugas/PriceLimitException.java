package Modul10.Tugas;

public class PriceLimitException extends Exception {
    public PriceLimitException(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage();
    }
}
