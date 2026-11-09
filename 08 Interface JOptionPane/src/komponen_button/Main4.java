package komponen_button;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main4 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Contoh Set Icon");
        f.setSize(300,200);
        f.setLayout(new FlowLayout());

         // Buat tombol
        JButton button = new JButton("Simpan");

        // Set ikon default
        button.setIcon(new ImageIcon(Main.class.getResource("/images/icon2.png")));

        // Set ikon saat mouse hover
        button.setRolloverIcon(new ImageIcon(Main.class.getResource("/images/icon3.png")));

        // Tambahkan ke frame
        f.add(button);
        f.setVisible(true);
    }
}
