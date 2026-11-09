package latihan.transaksi_bank3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double saldo;
    private int bulan;
    private int tanggal;
    Scanner input = new Scanner(System.in);

    public BankAccount(String accountNumber, String accountHolder, double saldo) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.saldo = saldo;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getTanggal() {
        return this.tanggal;
    }

    public int getBulan() {
        return this.bulan;
    }

    private double cekTypeDouble(Scanner input, String message) {
        double angka = 0;
        while (true) {
            try {
                System.out.print(message);
                angka = input.nextDouble();

                if (angka <= 0) {
                    throw new IllegalArgumentException();
                }

                return angka;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak boleh bertype String");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Input tidak boleh negatif dan 0!");
                input.nextLine();
            }
        }
    }

    private int cekTypeInt(Scanner input, String message) {
        int angka = 0;
        while (true) {
            try {
                System.out.print(message);
                angka = input.nextInt();

                if (angka <= 0) {
                    throw new IllegalArgumentException();
                }

                return angka;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak boleh bertype String");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Input tidak boleh negatif dan 0!");
                input.nextLine();
            }
        }
    }

    public void InvalidAccountNumber() {
        boolean cek = true;
        while (cek == true) {
            try {
                if (this.accountNumber.length() != 2) {
                    throw new InvalidAccountNumberException("AccountNumber haruss 2 digit angka!");
                } else if (this.accountNumber.length() == 2) {
                    System.out.println("AccountNumber valid");
                    cek = false;
                }
            } catch (InvalidAccountNumberException e) {
                System.out.println(e);
                System.out.print("New AccountNumber: ");
                String number = input.nextLine();
                setAccountNumber(number);
            } 
        }
    }  

    public void InvalidSaldo() {
        boolean cek = true;
        while (cek == true) {
            try {
                if (this.saldo < 0) {
                    throw new IllegalArgumentException("Saldo tidak boleh negatif, " + this.saldo);
                } else if (this.saldo < 50000) {
                    throw new IllegalArgumentException("Saldo awal minimal Rp.50.000\nSaldo Anda sekarang Rp." + this.saldo);
                } else if (this.saldo >= 50000) {
                    System.out.println("Saldo awal sudah mencukupi Rp." + this.saldo);
                    cek = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                setSaldo(cekTypeDouble(input, "Tambah Saldo: Rp."));
            } 
        }
    }

    public void withDraw() {
        boolean cek = true;
        while (cek == true) {
            try {
                if (this.saldo < 200000) {
                    throw new InsufficientFundsException("Saldo anda tidak mencukupi,\nMinimal saldo anda harus Rp.200.000 untuk penarikan!");
                } 
                double tarikSaldo = cekTypeDouble(input, "Tarik saldo sebesar Rp.");
                if (this.saldo - tarikSaldo <= 0) {
                    throw new IllegalArgumentException("untuk melakukan penarikan harus menyisakan minimal Rp.50.000");
                } else {
                    this.saldo -= tarikSaldo;
                    System.out.println("Melakukan penarikan sebesar Rp." + tarikSaldo);
                    System.out.println("Sisa Saldo anda Rp." + this.saldo);
                    cek = false;
                }
            } catch (InsufficientFundsException e) {
                System.out.println(e);
                System.out.println("Pilih 1 untuk menambah saldo\nPilih 2 batal melakukan penarikan");
                System.out.print  ("Input: ");
                int pilih = input.nextInt();
                if (pilih == 1) {
                    deposit();
                } else if (pilih == 2) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } 
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void deposit() {
        boolean cek = true;
        double deposit = 0;
        this.tanggal = cekTypeInt(input, "Tanggal: ");
        this.bulan = cekTypeInt(input, "Bulan: ");
        deposit = cekTypeDouble(input, "Setor Saldo Rp.");
        while (cek == true) {
            try {
                if (deposit <= 0) {
                    throw new IllegalArgumentException("Input tidak boleh negatif dan 0!");
                } else {
                    setSaldo(deposit);
                    System.out.println("Saldo Anda sekarang sebesar Rp." + this.saldo);
                    cek = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                deposit = cekTypeDouble(input, "Setor Saldo Rp.");
            }
        }
    }
} 

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}

class InvalidAccountHolder extends Exception {
    public InvalidAccountHolder(String message) {
        super(message);
    }
}
