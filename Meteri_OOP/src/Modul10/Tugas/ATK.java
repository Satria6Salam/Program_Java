package Modul10.Tugas;

public class ATK extends Barang {
    public String getJenisBarang() {
        return "ATK";
    }

    public void setIDKode(String ID) throws KodeErrorException {
        char karakter = ID.charAt(0);
        if (karakter == 'A' && ID.length() == 5) {
            this.ID = ID;
        } else {
            throw new KodeErrorException("\nID Kode untuk barang ATK,\nHarus terdiri dari 5 karakter didahului dengan karakter 'A'");
        }
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setStok(int stok) throws StokExceedCapacityException {
        if (stok > 0) {
            this.stok = stok;
        } else {
            throw new StokExceedCapacityException("\nStok untuk kategori barang ATK tidak boleh nol!");
        }  
    }

    public void setHarga(int harga) throws PriceLimitException {
        if (harga >= 3000  && harga <= 150000) {
                this.harga = harga;
        } else {
            throw new PriceLimitException("\nHarga untuk barang ATK\nHarus Harus dalam rentang (Rp3000 <= barang <= Rp150000)!");
        }
    }

    public void display() {
        System.out.println("");
        System.out.println("Jenis Barang\t: " + getJenisBarang());
        System.out.println("ID Kode Barang\t: " + getID());
        System.out.println("Nama Barang\t: " + getNamaBarang());
        System.out.println("Stok Barang\t: " + getStok());
        System.out.println("Harga Barang\t: Rp" + getHarga());
    }
}
