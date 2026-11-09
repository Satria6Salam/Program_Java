package komponen_button;

import javax.swing.*;
import java.awt.*;

public class Main3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Contoh ActionCommand");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLayout(new FlowLayout());

            JButton button = new JButton("Simpan");

            // Atur ActionCommand sebelum tombol diklik
            button.setActionCommand("Simpan Data");

            // Tambahkan ActionListener dengan lambda (Java 8+)
            button.addActionListener(e -> {
                String perintah = e.getActionCommand();  // ambil perintah
                System.out.println("Perintah tombol: " + perintah);
            });

            frame.add(button);
            frame.setVisible(true);
        });
    }
}

