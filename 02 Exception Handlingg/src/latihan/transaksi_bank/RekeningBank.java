package latihan.transaksi_bank;

public class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    } 

    public String getNomorRe() {
        return this.nomorRekening;
    }

    public String getNamaPe() {
        return this.namaPemilik;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNoRek(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void tambahSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void tarikSaldo(double saldo) {
        this.saldo -= saldo;
    }

    private void invalidNoRek(String nomorRekening) throws InvalidAccountNumberException {
        if (nomorRekening.length() != 10) {
            throw new InvalidAccountNumberException("No Rekening harus 10 digit");
        }
        this.nomorRekening = nomorRekening;
    }

    public void validasiNorRek() {
        try {
            invalidNoRek(getNomorRe());
            System.out.println("Nomor Rekening Anda Valid");
        } catch (InvalidAccountNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private void invalidDeposit(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo Anda negatif! Rp. " + getSaldo());
        }
    }

    public void validasiDeposit() {
        try {
            invalidDeposit(getSaldo());
            System.out.println("Saldo anda: Rp. " + getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Isi saldo Anda!");
        } 
    }

    private void invalidPenarikan(double saldo) throws InsufficientFundsException {
        if (saldo > 50000 ) {
            System.out.println("Saldo anda mencukupi untuk malakukan penarikan");
        } else if (saldo < 50000 && saldo > 0) {
            throw new InsufficientFundsException("Saldo anda tidak mencukupi untuk melakukan penarikan, sisa saldo Rp. " + getSaldo());
        } else if (saldo < 0) {
            throw new IllegalArgumentException("Saldo anda negatif! Rp. " + getSaldo());
        }
    }

    public void validasiPenarikan() {
        try {
            invalidPenarikan(getSaldo());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Isi saldo Anda!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Isi saldo Anda!");
        }
    }

    public void display() {
        System.out.println("No Rekening\t: " + getNomorRe());
        System.out.println("Nama Pemilik\t: " + getNamaPe());
        System.out.println("Saldo\t\t: " + getSaldo());
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