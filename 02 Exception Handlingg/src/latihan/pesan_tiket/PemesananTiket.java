package latihan.pesan_tiket;

public class PemesananTiket {
    private double hargaTiket;
    
    public PemesananTiket() {
        this.hargaTiket = 150000;
    }

    public void pesanTiket(Penumpang penumpang) {
        try {
            cekUsia(penumpang.getUsia());
            cekSaldo(penumpang.getSaldo());

            System.out.println("Pemesanan tiket berhasil");
            penumpang.kurangSaldo(hargaTiket);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
    }

    public int cekUsia(int usia) throws IllegalArgumentException {
        if (usia < 18) {
            throw new IllegalArgumentException("Usia anda dibawah umur");
        }
        return usia;
    }

    public double cekSaldo(double saldo) throws InsufficientFundsException {
        if (saldo < this.hargaTiket) {
            throw new InsufficientFundsException("Saldo tidak cukup!, Saldo yang dibutuhkan sebesar Rp. " + this.hargaTiket);
        }
        return saldo;
    }
}

// Custom Exception untuk menangani saldo tidak cukup
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}