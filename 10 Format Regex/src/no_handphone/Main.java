package no_handphone;

public class Main {
    public static void main(String[] args) {
        String telp = "+628123456789";

        // \\+62: Mencocokkan awalan +62 (kode negara Indonesia).
        // [0-9]{8,12}: Mencocokkan 8 hingga 12 digit angka setelah +62.
        
        if (telp.matches("\\+62[0-9]{8,12}")) {
            System.out.println("Nomor telepon valid!");
        } else {
            System.out.println("Nomor telepon tidak valid.");
        }

    }
}
