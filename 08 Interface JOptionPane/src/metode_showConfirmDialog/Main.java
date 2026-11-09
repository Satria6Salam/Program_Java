/*
 * 1. showConfirmDialog: Metode untuk menampilkan dialog konfirmasi.
 *      > Fungsi: Meminta pengguna memilih antara beberapa opsi (ya/tidak/batal).
 *      > Instruksi yang Dilakukan: Membuat jendela dialog dengan tombol pilihan.
 * 2. null: Parameter pertama, menunjukkan bahwa dialog akan ditampilkan di tengah layar.
 * 3. "Apakah Anda yakin?": Parameter kedua, pesan yang akan ditampilkan di dalam dialog.
 * 4. "Konfirmasi": Parameter ketiga, judul yang akan ditampilkan di bagian atas dialog.
 * 5. JOptionPane.YES_NO_OPTION: Parameter keempat, jenis tombol yang akan ditampilkan (dalam hal ini, tombol "Ya" dan "Tidak").
 * 6. int pilihan: Variabel yang akan menyimpan nilai pilihan pengguna.
 */
package metode_showConfirmDialog;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", "Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            System.out.println("Anda memilih Ya");
        } else if (pilihan == JOptionPane.NO_OPTION){
            System.out.println("Anda memilih Tidak");
        } else {
            System.out.println("Anda memilih Batal");
        }
    }
}
