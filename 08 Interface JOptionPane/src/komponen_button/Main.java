/*
 * JButton adalah komponen GUI dalam Java Swing yang digunakan 
 * untuk membuat tombol interaktif. Pengguna bisa mengklik tombol untuk 
 * menjalankan suatu aksi, seperti membuka jendela baru, mengirim data, 
 * keluar dari program, dan lainnya.
 * 
 * JButton komponen untuk membuat tombol interaktif pada GUI.
 * 1. Tombol kosong tanpa text atau icon
 * 2. Tombol dengan text
 * 3. Tombol dengan icon
 * 4. Tombol gabungan text dan icon
 * 
 * Fungsi	Penjelasan
 * Interaksi	    Menangani aksi ketika tombol diklik oleh pengguna
 * Eksekusi aksi	Dapat digunakan untuk memanggil fungsi, membuka form, dsb
 * Navigasi     	Digunakan untuk berpindah antar panel/jendela
 * Formulir	        Digunakan sebagai tombol Submit, Reset, Login, dl
 */

package komponen_button;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CONTOH BUTTON");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(50, 50);

        // MEMBUAT LABEL
        JLabel label = new JLabel();
        label.setText("Belum di Klik!");
        label.setBounds(10, 30, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // MEMBUAT BUTTON
        JButton button = new JButton();
        button.setText("Klik Saya");
        button.setBounds(200, 10, 200, 60);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(Color.ORANGE); // Warna katarbelakang
        button.setForeground(Color.BLUE); // Warna teks
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Efek garis pinggir pada tombol
        // button.setBorder(BorderFactory.createEmptyBorder());
        // button.setContentAreaFilled(false); // Area isi tombol akan diisi warna (false untuk tombol transparan / datar).
        button.setOpaque(true); // Mengaktifkan efek background
        button.setIcon(new ImageIcon(Main.class.getResource("/images/icon2.png"))); // Menambah icon
        button.setRolloverIcon(new ImageIcon(Main.class.getResource("/images/icon2.png"))); // Mengatur gambar/icon saat mouse diarahkan ke tombol.
        button.setFocusPainted(false); // Menghilangkan garis fokus saat tombol dipilih dengan keyboard/tab.

        // EVENT HANDLING
        // button.addActionListener(new ActionListener() {
        //     // public void actionPerformed(ActionEvent e) {
        //     //     label.setText("Tombol Sudah di Klik");
        //     // }

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         // TODO Auto-generated method stub
        //         throw new UnsupportedOperationException("Tombol Sudah di Klik");
        //     }
        // });
        
        button.addActionListener(e -> label.setText("Tombol di Klik")); 
        // e : parameter yang mewakili objek ActionEvent (event klik tombol)
        // -> : operator lambda
        // label.setText() : kode yang akan dijalankan

        frame.add(label);
        frame.add(button);

        frame.setVisible(true);

    }
}
