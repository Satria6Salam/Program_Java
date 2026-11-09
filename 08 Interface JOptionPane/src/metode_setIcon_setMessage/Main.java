/*
 * Membuat ImageIcon yang digunakan sebagai ikon.
 * Membuat JPanel dan JLabel untuk menampilkan pesan dan ikon bersamaan.
 * Menggunakan JOptionPane.showMessageDialog() untuk menampilkan pesan dengan ikon yang sudah disesuaikan.
 */
package metode_setIcon_setMessage;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
       // Mengatur ikon kustom
       // Menggunakan getResource() (Jika Ikon Ada di dalam src/ Jar)
       ImageIcon icon = new ImageIcon(Main.class.getResource("/images/icon2.png")); // Ganti dengan path ikon Anda

      // Path absolut
      //  ImageIcon icon = new ImageIcon("C:/Users/lenovo/downloads/icon8-java-64.png");
      //  ImageIcon icon = new ImageIcon("C:\\Users\\lenovo\\downloads\\icon8-java-64.png");
       
       
       // Membuat panel untuk menampung pesan dan ikon
       JPanel panel = new JPanel();
       JLabel label = new JLabel("Ini adalah pesan kustom yang telah diatur");

       // label.setText("Contoh");
       label.setIcon(icon); // Mengatur ikon pada label
       panel.add(label);

       // Menampilkan dialog dengan ikon dan pesan yang telah diatur
       JOptionPane.showMessageDialog(null, panel, "JUDUL", JOptionPane.PLAIN_MESSAGE);
    }
}