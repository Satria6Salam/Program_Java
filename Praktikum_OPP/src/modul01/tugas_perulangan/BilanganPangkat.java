// 240605110201_Satria Badrus Salam AM

package modul01.tugas_perulangan;

import java.util.Scanner;

class Pangkat {
    private int angka;
    private int pangkat;

    Pangkat(int angka, int pangkat) {
        this.angka = angka;
        this.pangkat = pangkat;
    }

    int getPangkat() {
        int result = 1;
        for (int i = 0; i < pangkat; i++) {
            result = result * this.angka;
        }

        return result;
    }
}

public class BilanganPangkat {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        System.out.println("   OPERASI PANGKAT   ");
        System.out.println("=====================");
        System.out.print("Input angka: ");
        int angka = in.nextInt();
        System.out.print("Input pangkat: ");
        int pangkat = in.nextInt();
        
        Pangkat pangkat1 = new Pangkat(angka,pangkat);
        System.out.println("Result: " + pangkat1.getPangkat());
    }
}
