package Modul10.Tugas;

public class Makanan extends Barang {
    public String getJenisBarang() {
        return "Makanan";
    }
    
    public void setIDKode(String ID) throws KodeErrorException {
        char karakter = ID.charAt(0);
        if (karakter == 'M' && ID.length() == 5) {
            this.ID = ID;
        } else {
            throw new KodeErrorException("\nID Kode untuk barang makanan,\nHarus terdiri dari 5 karakter didahului dengan karakter 'M'");
        }
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setStok(int stok) throws StokExceedCapacityException{
        if (stok <= 100 && stok > 0) {
            this.stok = stok;
        } else {
            throw new StokExceedCapacityException("\nStok untuk ketegori barang makanan\nHarus dalam rentang (1 <= barang <= 100)!");
        } 
    }

    public void setHarga(int harga) throws PriceLimitException {
        if (harga > 0) {
            this.harga = harga;
        } else {
            throw new PriceLimitException("\nHarga untuk barang makanan tidak boleh nol!");
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
