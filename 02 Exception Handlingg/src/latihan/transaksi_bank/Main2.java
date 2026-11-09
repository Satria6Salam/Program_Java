package latihan.transaksi_bank;

import java.util.Scanner;

// Custom Exception untuk nomor rekening yang tidak valid
class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}

// Custom Exception untuk saldo tidak mencukupi
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Kelas RekeningBank
class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) throws InvalidAccountNumberException {
        setNomorRekening(nomorRekening);
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Setter untuk nomor rekening dengan validasi
    public void setNomorRekening(String nomorRekening) throws InvalidAccountNumberException {
        if (nomorRekening.length() != 10 || !nomorRekening.matches("\\d+")) {
            throw new InvalidAccountNumberException("Nomor rekening harus terdiri dari 10 digit angka!");
        }
        this.nomorRekening = nomorRekening;
    }

    // Metode untuk deposit uang ke rekening
    public void deposit(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah deposit harus lebih dari 0!");
        }
        saldo += jumlah;
        System.out.println("✅ Deposit berhasil! Saldo sekarang: Rp " + saldo);
    }

    // Metode untuk menarik saldo
    public void tarik(double jumlah) throws InsufficientFundsException {
        if (jumlah > saldo) {
            throw new InsufficientFundsException("Saldo tidak mencukupi! Saldo Anda: Rp " + saldo);
        }
        saldo -= jumlah;
        System.out.println("✅ Penarikan berhasil! Sisa saldo: Rp " + saldo);
    }

    // Menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("\n=== Informasi Rekening ===");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }
}

// Kelas Main untuk menjalankan program
public class Main2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        try {
            // Meminta input dari pengguna
            System.out.print("Masukkan Nomor Rekening (10 digit): ");
            String nomorRekening = input.nextLine();

            System.out.print("Masukkan Nama Pemilik: ");
            String namaPemilik = input.nextLine();

            System.out.print("Masukkan Saldo Awal: Rp ");
            double saldo = input.nextDouble();

            // Membuat objek rekening bank
            RekeningBank rekening = new RekeningBank(nomorRekening, namaPemilik, saldo);
            rekening.tampilkanInfo();

            // Pilihan transaksi
            while (true) {
                System.out.println("\nMenu Transaksi:");
                System.out.println("1. Deposit");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Keluar");
                System.out.print("Pilih: ");
                int pilihan = input.nextInt();

                if (pilihan == 1) {
                    System.out.print("Masukkan jumlah deposit: Rp ");
                    double jumlah = input.nextDouble();
                    rekening.deposit(jumlah);
                } else if (pilihan == 2) {
                    System.out.print("Masukkan jumlah tarik tunai: Rp ");
                    double jumlah = input.nextDouble();
                    rekening.tarik(jumlah);
                } else if (pilihan == 3) {
                    System.out.println("✅ Terima kasih telah menggunakan layanan kami!");
                    break;
                } else {
                    System.out.println("❌ Pilihan tidak valid!");
                }
            }
        } catch (InvalidAccountNumberException e) {
            System.err.println("⚠️ Kesalahan: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("⚠️ Kesalahan: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println("❌ Kesalahan: " + e.getMessage());
        }

        System.out.println("✅ Program Selesai.");
    }
}

