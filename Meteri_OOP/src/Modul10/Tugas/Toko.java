package Modul10.Tugas;

public class Toko {
    private ATK[] listATK = new ATK[10];
    private Makanan[] listMakanan = new Makanan[10];
    private int nATK = 0;
    private int nMakanan = 0;

    public void addATK(ATK atk) {
        try {
            if (nATK < 3) {
                listATK[nATK] = atk;
                nATK++;
            } else {
                throw new IndexOutOfBoundsException("Kapasitas Jenis Barang ATK Sudah Penuh!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nERROR!!!\n" + e.getMessage());
        }
    }

    public void addMakanan(Makanan makanan) {
        try {
            if (nMakanan < 3) {
                listMakanan[nMakanan] = makanan;
                nMakanan++;
            } else {
                throw new IndexOutOfBoundsException("Kapasitas Jenis Barang Makanan Sudah Penuh!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nERROR!!!\n" + e.getMessage());
        }
    }

    public void daftarBarangATK() {
        System.out.println("===================================================");
        System.out.println("================ Jenis Barang ATK =================");
        System.out.println("===================================================");

        for (int i = 0; i < nATK; i++) {
            listATK[i].display();
        }  
    }

    public void daftarBarangMakanan() {
        System.out.println("===================================================");
        System.out.println("============== Jenis Barang Makanan ===============");
        System.out.println("===================================================");
            
        for (int i = 0; i < nMakanan; i++) {
            listMakanan[i].display();
        }
    }

    public void out() {
        System.out.println("===================================================");
        System.out.println("================ PROGRAM SELESAI ==================");
        System.out.println("===================================================");
    }

    public void in() {
        System.out.println("===================================================");
        System.out.println("=========== PROGRAM INPUT DATA BARANG  ============");
        System.out.println("===================================================");
        System.out.println("1 - Input Data Jenis Barang ATK");
        System.out.println("2 - Input Data Jenis Barang Makanan");
        System.out.println("3 - Tampilkan Daftar Barang ATK");
        System.out.println("4 - Tampilkan Daftar Barang Makanan");
        System.out.println("5 - Keluar Dari Program");
    }

}

