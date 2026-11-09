package metode_imageicon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(Main.class.getResource("icon2.png"));
        JLabel label = new JLabel("TEKS", icon, JLabel.CENTER);

        JOptionPane.showMessageDialog(null, label, "Judul", JOptionPane.INFORMATION_MESSAGE);
    }
}
