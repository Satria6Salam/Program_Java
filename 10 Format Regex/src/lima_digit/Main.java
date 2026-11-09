package lima_digit;

public class Main {
    public static void main(String[] args) {
        String noRekening = "aaaaa";
        
        if (noRekening.matches("\\d{5}")) {
            System.out.println("Nomor rekening valid!");
        } else {
            System.out.println("Nomor rekening harus 5 digit angka.");
        }
    }
}
