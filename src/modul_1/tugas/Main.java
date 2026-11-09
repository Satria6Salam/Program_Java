// 240605110201_Satria Badrus Salam Al Muhibbin_OOP F_Tugas 1

package modul_1.tugas;

import  java.io.*;
import java.lang.StringBuffer;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        System.out.println("===========================================");
        System.out.print("Masukkan nama: ");
        String nm = input.readLine();

        System.out.println("Jumlah String " + nm + " adalah " + nm.length());

        System.out.println("===========================================");
        String b = "balonku ada lima";
        System.out.println("Ubah 'a' menjadi 'i'");
        System.out.println(b);
        System.out.println(b.replace('a', 'i'));

        System.out.println("===========================================");
        StringBuffer n = new StringBuffer("Saya suka java");
        System.out.println(n.insert(5, "sangat "));
        // System.out.println("Saya sangat " + n.substring(5, 14));

        System.out.println("===========================================");
        String bb = "Bapak baru saja mengajakku mudik ke bandung";
        //int j = 0;
        int y = 0;
        char k = 'B';
        for (int i = 0; i < bb.length(); i++) {
            // char h = bb.charAt(i);
            if (bb.toUpperCase().charAt(i) == k) {
                y++;
                // System.out.println(y + "true");yy
            } 
        }
        System.out.println(bb);
        System.out.println("Jumlah huruf 'B' : " + y);
    }

}
