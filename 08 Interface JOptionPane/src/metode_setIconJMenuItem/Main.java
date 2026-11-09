package metode_setIconJMenuItem;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        JMenuItem menu = new JMenuItem("OPEN", new ImageIcon(Main.class.getResource("/images/icon2.png")));

        JOptionPane.showMessageDialog(null, menu);
    }
}
