package komponen_button;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;

public class Main2 {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setTitle("BUTTON");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton();
        // button.setBounds(10,10, 200, 200);
        button.setText("Simpan");
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(100,10, 0));
        button.setFocusPainted(false); // Menghilangkan fokus outline disekitar tombol
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Mengatur batas / jarak teks button
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Mengatur cursor manjadi icon tangan
        button.setToolTipText("Klik untuk menyimpan data"); // Memunculkan popup kecil (tooltip)
        button.addActionListener(e -> System.out.println("Klik!"));
        button.setEnabled(true); // Mengaktifkan dan menonaktifkan tombol
        button.setVisible(true); // Menampilkan tombol
        button.setMnemonic('S'); // Alt + S untuk klik simpan
        button.doClick(); // Menyimulasikan klik tombol lewat kode.
        button.setIcon(new ImageIcon(Main.class.getResource("/images/icon2.png"))); // Menambah icon
        button.setPressedIcon(new ImageIcon(Main.class.getResource("/images/icon3.png"))); // Set gambar saat tombol ditekan
        button.setFocusable(true);

        // Mendeteksi status tombol 
        // getModel(): mengambil model tombol u/ menyimpan semua status internak tombol
        // addChangeListenir: menambah listener u/ mendeteksi setiap perubahan status model
        // isPressed: mengecek apakah tombol saat ini sedang ditekan (pressed)
        button.getModel().addChangeListener(e -> {
            if(button.getModel().isPressed()) {
                System.out.println("Tombol ditekan");
                button.setBackground(new Color(50, 100, 35));
            } 
        });
        
        button.setLayout(null);
        button.setHorizontalAlignment(SwingConstants.RIGHT);
        button.setVerticalAlignment(SwingConstants.CENTER);
        
        String getText = button.getText();
        System.out.println(getText);   

        frame.add(button);
        frame.setVisible(true);
    }
}
