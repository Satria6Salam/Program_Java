package modul_2.daftar_buku;

public class Main {
    public static void main(String[] args) {
        ListBuku list = new ListBuku();
        list.add(new Buku("Hiu", "Satria", "Kakang", 2015));
        list.add(new Buku("Cinta", "Roma", "Kakang", 2017));
        list.add(new Ebook("Sahaya", "Doi", "Cahya", 2000, "Pdf"));

        // list.daftarBuku();
        // // System.out.println(list.get(0).getJudul());
        // list.remove(0);
        // list.daftarBuku();
        list.tampilkanSemuaBuku();
        
    }
}
