package modul_2.daftar_buku;

import java.util.ArrayList;

public class ListBuku extends ArrayList<Buku> {

    public void addBuku (Buku buku) {
        this.add(buku);
    }

    public void daftarBuku() {
        if (this != null) {
            for (Buku buku : this) {
                buku.display();
            }
        }
    }

    public void tampilkanSemuaBuku() {
        // Mengurutkan buku secara manual menggunakan Bubble Sort
        for (int i = 0; i < this.size() - 1; i++) {
            for (int j = 0; j < this.size() - 1 - i; j++) {
                if (this.get(j).getJudul().compareTo(this.get(j + 1).getJudul()) > 0) {
                    // Tukar buku jika urutan salah
                    Buku temp = this.get(j);
                    this.set(j, this.get(j + 1));
                    this.set(j + 1, temp);
                }
            }
        }

        // Menampilkan semua buku setelah diurutkan
        for (Buku buku : this) {
            buku.display();
        }
    }
}
