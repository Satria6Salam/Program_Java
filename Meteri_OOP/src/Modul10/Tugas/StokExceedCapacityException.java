package Modul10.Tugas;

public class StokExceedCapacityException extends Exception {
    public StokExceedCapacityException(String message) {
        super(message);
    }

    public String getError() {
        return super.getMessage();
    }
}
