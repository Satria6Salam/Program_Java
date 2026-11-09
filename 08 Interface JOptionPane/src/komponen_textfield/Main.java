/*
 *  JTextField adalah komponen input teks satu baris di Java Swing. 
 *  Digunakan untuk menerima input teks pendek
 * 
 *   Kegunaan JTextField
 *      Menerima input dari pengguna
 *      Menampilkan teks sementara
 *      Digunakan dalam form login, formulir data, pencarian, dll
 *  Konstruktor	                                Fungsi
 *      new JTextField()	                        Membuat field kosong
 *      new JTextField(int columns)	                Field dengan lebar tertentu
 *      new JTextField(String text)	                Isi default
 *      new JTextField(String text, int columns)    Isi + lebar
 * 
 * JTextField adalah salah satu komponen paling penting di Java Swing. Dengan metode yang tersedia, kamu bisa:
 *  Mengatur tampilan
 *  Mengambil/mengubah teks
 *  Menangani input dari pengguna
 *  Menambahkan validasi
 */
package komponen_textfield;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh JTextField");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,150);
        f.setLayout(new FlowLayout());


        JLabel l = new JLabel("Nama: ");
        JTextField t = new JTextField(15);
        t.setToolTipText("Masukkan Nama Anda");
        t.setFont(new Font("Arial", Font.PLAIN, 14));
        t.setHorizontalAlignment(JTextField.LEFT);

        // // Metode Lambda
        // JButton b = new JButton("Cetak");
        // b.addActionListener(e -> { // Deteksi Enter
        //     String input = t.getText();
        //     if (input.isEmpty()) {
        //         JOptionPane.showMessageDialog(f, "Text Tidak Boleh Kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
        //     } else {
        //         JOptionPane.showMessageDialog(f, "Anda Mengetik: " + input); // Manmpilkan output ke user
        //     }
        // });

        // Metode tanpa lambda
        JButton b = new JButton("Kirim");
        b.addActionListener(new ActionListener() { // Cara lama untuk membuat event handler
            @SuppressWarnings("unused")
            public void actionPerformed(ActionEvent e) {
                String input = t.getText().trim(); 
                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Field tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(f, "Input diterima: " + input);
                }
            }
        });

        // Membuat JTextField Hanya Bisa Dibaca
        JTextField t2 = new JTextField("Ini tidak bisa diedit");
        t2.setEditable(false);

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(t2);
        f.setVisible(true);
    }
}
