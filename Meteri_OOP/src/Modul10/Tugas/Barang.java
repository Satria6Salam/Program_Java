package Modul10.Tugas;

public abstract class Barang {
    protected String ID, namaBarang;
    protected int harga, stok;

    public String getID() {
        return ID;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public abstract void setIDKode(String ID) throws KodeErrorException;
    
    public abstract void setNamaBarang(String namaBarang);

    public abstract void setStok(int stok) throws StokExceedCapacityException ;

    public abstract void setHarga(int harga) throws PriceLimitException;

    public abstract void display();
}
