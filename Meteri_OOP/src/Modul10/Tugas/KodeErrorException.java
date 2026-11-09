package Modul10.Tugas;

public class KodeErrorException extends Exception {
    public KodeErrorException(String message) {
        super(message);
    }

    public String getError() {
        return super.getMessage();
    }
}
