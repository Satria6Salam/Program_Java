/*
 *  SwingUtilities.invokeLater(...) adalah metode untuk menjadwalkan eksekusi kode GUI 
 *  agar dijalankan di Event Dispatch Thread (EDT) — yaitu thread khusus untuk menangani 
 *  semua komponen GUI di Java Swing seperti tombol, text field, jendela, dan sebagainya.
 * 
 * 🔧 Fungsi Utama
 * ✅ Menjamin thread-safety:
 *  Swing tidak aman untuk diakses dari banyak thread secara langsung. Semua perubahan pada 
 *  komponen Swing harus dilakukan di EDT agar tidak terjadi error atau bug yang sulit dilacak.
 * ✅ Menjadwalkan kode GUI untuk dieksekusi setelah inisialisasi selesai:
 *  Contoh: saat aplikasi baru dijalankan dari main, kita ingin komponen GUI dibuat dan ditampilkan dengan aman.
 * 
 * 🧠 Analogi Sederhana
 *  Bayangkan EDT adalah "jalur resmi" untuk memodifikasi tampilan.
 *  Kalau kamu mau menggambar ulang, menambahkan tombol, atau mengatur warna — kamu harus antre lewat EDT.
 * 
 *  SwingUtilities.invokeLater(Runnable) adalah cara aman dan resmi untuk membuat/mengubah GUI di Java Swing.
 *  Wajib digunakan jika kamu ingin memastikan aplikasi GUI berjalan stabil, lancar, dan profesional.
 */

package komponen_textfield;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // invokLater() memastikan kode GUI berjalan aman di EDT
            public void run() {
                JFrame f = new JFrame("Contooh JTextField Lengkap");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(500, 300);
                f.setLayout(new FlowLayout());

                JLabel l = new JLabel("Nama: ");
                final JTextField t = new JTextField();
                t.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
                t.setColumns(15);
                t.setForeground(Color.BLUE);
                JButton bv = new JButton("Validasi");
                JButton br = new JButton("Reset");

                // Field read only
                JTextField tr = new JTextField("Tidak bisa diubah");
                // tr.setEditable(false); // Bisa diseleksi
                tr.setEnabled(false); // Tidak bisa diseleksi
                tr.setBackground(Color.LIGHT_GRAY);

                bv.addActionListener(new ActionListener() { // Membuat anonymous class dari interface ActionListener.
                    public void actionPerformed(ActionEvent e) {
                        String input = t.getText().trim(); // .trim(): Menghapus spasi di awal dan akhir → supaya input seperti " " tetap dihitung kosong.
                        if (input.isEmpty()) {
                            t.setBackground(Color.PINK);
                            JOptionPane.showMessageDialog(f, "Field tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
                        } else {
                            t.setBackground(Color.WHITE);
                            JOptionPane.showMessageDialog(f, "Input diterima " +  input);
                        }
                    }
                });

                br.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        t.setText("");
                        t.setBackground(Color.WHITE);
                    }
                });

                f.add(l);
                f.add(t);
                f.add(bv);
                f.add(br);
                f.add(new JLabel("Status: "));
                f.add(tr);
                f.setVisible(true);
            }
        });       
    }
}


/*
🧵 Apa itu Thread dalam Pemrograman Java?
🔷 Definisi
    Thread adalah jalur eksekusi terkecil dalam sebuah program.
    Satu program Java bisa memiliki banyak thread yang berjalan secara paralel atau bersamaan.

Contoh:
    > Satu thread untuk membaca data
    > Satu thread untuk menangani animasi
    > Satu thread untuk memproses input pengguna      
 
    📌 Java secara default menjalankan program menggunakan main thread, yaitu thread utama.

🖼️ Apa itu EDT (Event Dispatch Thread)?
🔶 Definisi
    EDT (Event Dispatch Thread) adalah thread khusus yang digunakan oleh Java Swing untuk:

    > Menangani event GUI seperti klik tombol, ketik di JTextField, dsb
    > Menangani penggambaran (render) komponen GUI seperti JFrame, JButton, JLabel, dll

    ✅ Semua perubahan komponen Swing harus dilakukan di EDT, bukan di thread utama atau thread lain.

⚠️ Mengapa EDT itu Penting?
    Swing tidak aman untuk diakses oleh banyak thread secara langsung (not thread-safe).
    Jika kamu memodifikasi komponen Swing di luar EDT, bisa terjadi:

    > Crash
    > Tampilan tidak muncul
    > Perilaku acak (random bugs)
 */