package metode_setOption;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Mengatur opsi kustom
        Object[] options = {"Opsi 1", "Opsi 2", "Opsi 3"};
        
        // Menampilkan dialog dengan opsi kustom
        int pilihan = JOptionPane.showOptionDialog(
            null, // Parent component
            "Pilih salah satu opsi:", // Pesan
            "Judul Opsi", // Judul
            JOptionPane.DEFAULT_OPTION, // Tipe opsi
            JOptionPane.QUESTION_MESSAGE, // Tipe pesan
            null, // Ikon (null untuk menggunakan default)
            options, // Opsi kustom
            options[0] // Opsi default
        );

        // Menampilkan hasil pilihan
        if (pilihan >= 0) {
            System.out.println("Anda memilih: " + options[pilihan]);
        } else {
            System.out.println("Anda tidak memilih apa pun.");
        }
    }
}
