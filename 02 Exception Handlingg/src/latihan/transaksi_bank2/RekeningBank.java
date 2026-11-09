package latihan.transaksi_bank2;

import java.util.Scanner;

public class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNo() {
        return this.nomorRekening;
    }

    public String getNama() {
        return this.namaPemilik;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void validasiNo() {
        for (int i = 0; i < 4; i++) {
            try {
                if (getNo().length() != 5) {
                    throw new InvalidAccountNumberException("\nValidasi Nomor Rekening gagal, No Rekening harus 5 digit. \nCek ulang No Rekening! \nAnda memiliki kesempatan sebanyak 3x");
                } else if (getNo().length() == 5) {
                    this.nomorRekening = getNo();
                    System.out.println("Validasi No rekening berhasil");
                    break;
                }
            } catch (InvalidAccountNumberException e) {
                System.out.println(e.getMessage());
                setNo();
            }
        }
            
    }

    @SuppressWarnings("resource")
    private void setNo() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Masukan No Rekening yang sesuai!");
        System.out.print  ("No Rekening: ");
        String no = input.nextLine();
        this.nomorRekening = no;
    }

    public void validasiSaldo() {
        for (int i = 0; i < 2; i++) {
            try {
                if (getSaldo() < 100000) {
                    throw new IllegalArgumentException("\nMinimal Saldo awal Rp.100.000. Saldo anda sekarang Rp." + getSaldo() + "\nAnda memiliki kesempatan sebanyak 1x untuk isi saldo awal");
                } else {
                    System.out.println("Saldo awal sudah mencukupi. Saldo anda sekarang Rp." + getSaldo());
                    this.saldo = getSaldo();
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                setSaldo();
            }
        }
    }

    @SuppressWarnings("resource")
    private void setSaldo() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Tambah Saldo awal!");
        System.out.print  ("Jumlah : Rp.");
        double saldo = input.nextDouble();
        this.saldo += saldo;
    }

    @SuppressWarnings("resource")
    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.print  ("Tambah Saldo Rp.");
        double saldo = input.nextDouble();
        for (int i = 0; i < 3; i++) {
            try {
                if (saldo < 0) {
                    throw new IllegalArgumentException("Input Tidak boleh negatif! \nAnda memiliki 1x kesempatan lagi");
                } else {
                    this.saldo += saldo;
                    System.out.println("Saldo Anda sekarang Rp." + getSaldo());
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print  ("Tambah Saldo Rp.");
                saldo = input.nextDouble();
            }
        }
    }

    @SuppressWarnings("resource")
    public void tarikSaldo() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.print  ("Tarik Saldo Rp. ");
        double saldo = input.nextDouble();
        boolean cek = true;
        while (cek) {
            try {
                if (saldo < 0 || saldo == 0) {
                    throw new IllegalArgumentException("Input Tidak boleh negatif! & Tidak Boleh '0'");
                } else if (getSaldo() < 200000) {
                    throw new InsufficientFundsException("Untuk melakukan penarikan minimal saldo yang tersimpan Rp.100.000 \nSaldo anda boleh diambil setengah dari simpanan Saldo sekarang");
                } else if (saldo > (getSaldo() / 2)) {
                    throw new IllegalArgumentException("Saldo anda boleh diambil setengah dari simpanan Saldo sekarang!");
                } else if (saldo <= (getSaldo() / 2)) {
                    this.saldo -= saldo;
                    System.out.println("Berhasil melakukan penarikan saldo sebesar Rp." + saldo);
                    System.out.println("Sisa saldo anda sekarang Rp." + getSaldo());
                    cek = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print  ("Tarik Saldo Rp. ");
                saldo = input.nextDouble();
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
                deposit();
                System.out.print  ("Tarik Saldo Rp. ");
                saldo = input.nextDouble();
            }
        }

    }

    public void informasiRekening() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Informasi Rekening: ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("No Rekening\t: " + getNo());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Saldo\t\t: Rp. " + getSaldo());
    }
}

class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }  
}