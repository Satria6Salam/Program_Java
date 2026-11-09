package komponen_frame;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Main2 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); // Membuat frame (Jendela)

        
        frame.setSize(600, 300); // Mengatur Ukuran

        // Mengatur aksi saat jendela ditutup
        // JFrame.EXIT_ON_CLOSE → Menutup aplikasi saat jendela ditutup.
        // JFrame.HIDE_ON_CLOSE → Menyembunyikan jendela tanpa menghentikan program.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Mengatur tata letak (layout) komponen didalam JFrame
        frame.setTitle("GUI"); // Mengatur Judul jendela
        frame.setLocation(250, 200); // Mengatur posisi jendela dilayar
        frame.setResizable(true); // Mengizinkan atau tidak jendela diubah ukurannya

        // Membuat komponen label
        JLabel label = new JLabel("Hello Selamat Datang di GUI");
        label.setBounds(20, 10, 200, 100);
        frame.add(label); // Menambahkan komponen ke dalam JFrame.

        JLabel label2 = new JLabel("Selamat Datang!!!");
        label2.setBounds(20, 30, 200, 100);
        frame.add(label2);
        

        // Menambah komponen button
        JButton button1 = new JButton("Pencet Saya");
        button1.setBounds(20, 100, 150, 30); 
        frame.add(button1);
        
        // Menampilkan frame
        frame.setVisible(true);

    }
}
