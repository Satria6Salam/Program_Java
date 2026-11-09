/*
 * 1. showOptionDialog: Metode untuk menampilkan dialog dengan opsi kustom.
 *      > Fungsi: Menampilkan beberapa pilihan yang dapat dipilih pengguna.
 *      > Instruksi yang Dilakukan: Membuat jendela dialog dengan tombol pilihan kustom.
 * 2. null: Parameter pertama, menunjukkan bahwa dialog akan ditampilkan di tengah layar.
 * 3. "Pilih salah satu:": Parameter kedua, pesan yang akan ditampilkan di dalam dialog.
 * 4. "Opsi": Parameter ketiga, judul yang akan ditampilkan di bagian atas dialog.
 * 5. JOptionPane.DEFAULT_OPTION: Parameter keempat, jenis tombol yang akan ditampilkan (dalam hal ini, tombol default).
 * 6. JOptionPane.QUESTION_MESSAGE: Parameter kelima, jenis ikon yang akan ditampilkan (dalam hal ini, ikon pertanyaan).
 * 7. null: Parameter keenam, ikon kustom (jika tidak ada, gunakan null)
 * 8. options: Parameter ketujuh, array string yang berisi opsi-opsi yang akan ditampilkan.
 * 9. options[0]: Parameter kedelapan, opsi default yang akan dipilih secara otomatis.
 * 10. int pilihan: Variabel yang akan menyimpan indeks opsi yang dipilih pengguna.
 */
package metode_showOptionDialog;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Pilihan 1", "Pilihan 2", "Pilihan 3"};
        int pilihan = JOptionPane.showOptionDialog(null, "Pilih salah satu:", "Opsi", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println("Anda memilih: " + options[pilihan]);

        String[] opsi = {"Kelas Rendah", "Kelas Menengah", "Kelas Atas"};
        int pilihan2 = JOptionPane.showOptionDialog(null, "Pilih Standar Kelas!", "Tingkatan Kelas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, opsi, opsi[0]);
        System.out.println(opsi[pilihan2]);
    }    
}
