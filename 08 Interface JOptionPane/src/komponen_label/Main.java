package komponen_label;

/*
 *  JLabel adalah komponen dalam Swing (javax.swing.JLabel) yang digunakan untuk:
    1    Menampilkan teks statis,
    2    Menampilkan gambar/icon,
    3    Bisa ditambahkan ke GUI, tapi tidak bisa diedit oleh user (beda dengan JTextField).

    JLabel adalah komponen dalam Swing (javax.swing.JLabel) yang digunakan untuk:
    1    Menampilkan teks statis,
    2    Menampilkan gambar/icon,
    3    Bisa ditambahkan ke GUI, tapi tidak bisa diedit oleh user (beda dengan JTextField).

    setHorizontalAlignment(int alignment)
    > Metode ini digunakan untuk mengatur perataan horizontal (kiri–kanan) dari isi di dalam JLabel, yaitu teks atau gambar/icon.
    SwingConstants.LEFT	    Rata kiri
    SwingConstants.CENTER	Rata tengah
    SwingConstants.RIGHT	Rata kanan
    SwingConstants.LEADING	Rata ke arah awal teks (kiri di bhs Latin)
    SwingConstants.TRAILING	Rata ke arah akhir teks (kanan di bhs Latin)

    setVerticalAlignment(int alignment)
    > Metode ini digunakan untuk mengatur perataan vertikal (atas–bawah) dari isi JLabel.
    SwingConstants.TOP	    Rata atas
    SwingConstants.CENTER	Rata tengah
    SwingConstants.BOTTOM	Rata bawah
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


public class Main {
    public static void main(String[] args) {
        // MEMBUAT FRAME
        JFrame frame = new JFrame("Contoh Setting Label");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // MEMBUAT LABEL 1
        JLabel label1 = new JLabel();
        label1.setText("Selamat Datang Di Aplikasi GUI");
        label1.setBounds(10, 10, 400,30); // Mengatur posisi
        label1.setFont(new Font("ALGERIAN", Font.BOLD, 20)); // Mengatur font
        label1.setForeground(Color.BLUE); // Mengatur Warna

        frame.add(label1);

        // MEMBUAT ICON GAMBAR PADA TEXT
        ImageIcon icon = new ImageIcon(Main.class.getResource("/images/icon2.png"));
        JLabel label2 = new JLabel("Logo", icon, JLabel.CENTER); // Text dengan icon
        label2.setBounds(130, 50, 100, 100);
        label2.setIconTextGap(10); // Mengatur jarak antara icon dan text
        label2.setHorizontalTextPosition(JLabel.CENTER); // Posisi text pada icon
        label2.setVerticalTextPosition(JLabel.BOTTOM); // posisi text pada icon
        
        frame.add(label2);

        // MEMBUAT LABEL 3
        JLabel label3 = new JLabel("Halo", JLabel.CENTER); // Label ditengah frame
        label3.setBounds(160,200,50,50);
        label3.setPreferredSize(new Dimension(100,100));
        label3.setOpaque(true); // Penting supaya background terlihat
        label3.setBackground(Color.YELLOW);

        // Mengatur posisi teks pada becground
        label3.setHorizontalAlignment(SwingConstants.CENTER); // horizontal tengah
        label3.setVerticalAlignment(SwingConstants.CENTER); // vertikal tengah
                                     
        frame.add(label3);

        // MEMBUAT LABEL 4
        JLabel label4 = new JLabel();
        Font font = new Font("ARIAL", Font.ITALIC, 20);
        label4.setText("Nama");
        label4.setFont(font);
        label4.setForeground(Color.MAGENTA);
        label4.setBackground(Color.BLACK);
        label4.setOpaque(true);
        label4.setBounds(160, 270, 70, 50);
        label4.setToolTipText("Masukkan nama lengkap anda"); // Menampilkan text ketika mouse diarahkan kelabel

        // MEMBUAT KOMPONEN INPUT
        JTextField textField = new JTextField(12);
        textField.setBounds(250, 270, 100, 50);
        label4.setDisplayedMnemonic('N'); // Membuat shortcut keybord untuk fokus ke komponen terkait
        label4.setLabelFor(textField); // Menghubungkan JLabel dengan komponen target

        frame.add(label4);
        frame.add(textField);

        // MANAMPILKAN FRAME
        frame.setVisible(true);



        System.out.println(label1.getText()); // Mendapatkan Text dari label
        Icon icon3 = label2.getIcon();
        System.out.println(icon3);
    }
}
