package metode_setIconJbutton;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(Main.class.getResource("/images/icon2.png"));
        JButton button = new JButton(icon);

        JOptionPane.showMessageDialog(null, button, "Icon Untuk Button", JOptionPane.INFORMATION_MESSAGE);
    }
}
