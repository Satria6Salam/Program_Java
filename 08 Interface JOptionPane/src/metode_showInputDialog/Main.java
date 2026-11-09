/*
 * 1. showInputDialog: Metode untuk menampilkan dialog input.
 *      Fungsi: Meminta pengguna memasukkan data teks.
 *      Instruksi yang Dilakukan: Membuat jendela dialog dengan kotak input.
 * 2. null: Parameter pertama, menunjukkan bahwa dialog akan ditampilkan di tengah layar.
 * 3. "Masukkan nama:": Parameter kedua, pesan yang akan ditampilkan di atas kotak input.
 * 4. "Nama": Parameter ketiga, judul yang akan ditampilkan di bagian atas dialog.
 * 5. JOptionPane.QUESTION_MESSAGE: Parameter keempat, jenis ikon yang akan ditampilkan (dalam hal ini, ikon pertanyaan).
 * 6. String input: Variabel yang akan menyimpan nilai yang dimasukkan oleh pengguna.
 */
package metode_showInputDialog;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Masukkan nama:", "Nama", JOptionPane.QUESTION_MESSAGE);
        System.out.println(input);

      
    }
}
