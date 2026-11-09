package modul02.program_penjualan;

import java.util.Scanner;

public class Struk {
    private int hargaSatuan;
    private int jumlahOrder;
    private String namaProduk;
    private Kasir kasir;
    Scanner inp;

    public Struk() {
        this.inp = new Scanner(System.in);
    }

    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    public int getJumlahOrder() {
        return this.jumlahOrder;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }
    
    public int getTotal() {
        return this.hargaSatuan * this.jumlahOrder;
    }

    public void addProduk(Kasir kasir) {
        this.kasir = kasir;
    }

    private int inputJumlahOrder() {
        System.out.print("Jumlah Order: ");
        return inp.nextInt();
    }

    private String inputProduk() {
        System.out.print("Nama Barang: ");
        return inp.nextLine();
    }

    public void order() {
        String namaProduk = inputProduk();
        int jumlahOrder = inputJumlahOrder();
        boolean cekNamaProduk = false; 
        boolean cekOrder = false;
        
        for (int i = 0; i < kasir.getListProduk().size(); i++) {
            if (namaProduk.equalsIgnoreCase(kasir.getListProduk().get(i).getNamaBarang()) && kasir.getListProduk().get(i).getStok() > 0) {
                cekNamaProduk = true;
                while (cekOrder == false) {
                    if (jumlahOrder > kasir.getListProduk().get(i).getStok()) {
                        System.out.println("\nJumlah pemesanan melebihi stok!");
                        jumlahOrder = inputJumlahOrder();
                        cekOrder = false;
                    } else if (jumlahOrder <= 0) {
                        System.out.println("Pemesanan tidak boleh 0 dan negatif!");
                        jumlahOrder = inputJumlahOrder();
                        cekOrder = false;
                    } else if (jumlahOrder <= kasir.getListProduk().get(i).getStok() && jumlahOrder > 0) {
                        kasir.getListProduk().get(i).setStokKurang(jumlahOrder);
                        this.namaProduk = kasir.getListProduk().get(i).getNamaBarang();
                        this.hargaSatuan = kasir.getListProduk().get(i).getHarga();
                        this.jumlahOrder = jumlahOrder;
                        cekOrder = true;
                    } 
                }
                break;
            }  
        }

        if (!cekNamaProduk) {
            System.out.println("Produk tidak tersedia!");
        }

    }

    public void displayStruk() {
        System.out.println("Nama\t\t: " + this.namaProduk);
        System.out.println("Harga Satuan\t: Rp." + this.hargaSatuan + " (Kg/L)");
        System.out.println("Jumlah\t\t: " + this.jumlahOrder);
        System.out.println("Total Harga\t: Rp." + getTotal());
    }
}
