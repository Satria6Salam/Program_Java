/*
 * 1. JOptionPane: Kelas yang menyediakan metode untuk menampilkan dialog box.
 * 2. showMessageDialog: Metode untuk menampilkan dialog pesan.
 *      > Fungsi: Menampilkan pesan kepada pengguna dalam bentuk dialog box.
 *      > Instruksi yang Dilakukan: Membuat jendela dialog dengan pesan tertentu.
 * 3. null: Parameter pertama, menunjukkan bahwa dialog akan ditampilkan di tengah layar (tidak terikat ke komponen GUI tertentu).
 * 4. "Ini adalah pesan informasi": Parameter kedua, pesan yang akan ditampilkan di dalam dialog.
 * 5. "Judul Pesan": Parameter ketiga, judul yang akan ditampilkan di bagian atas dialog.
 * 6. JOptionPane.INFORMATION_MESSAGE: Parameter keempat, jenis ikon yang akan ditampilkan (dalam hal ini, ikon informasi).
 */
package metode_showMessageDialog;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ini adalah informasi", "Judul Pesan", JOptionPane.INFORMATION_MESSAGE);
    }
}
