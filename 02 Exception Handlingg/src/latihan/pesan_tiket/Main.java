package latihan.pesan_tiket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama\t: ");
        String nama = input.nextLine();

        System.out.print("Usia\t: ");
        int usia = input.nextInt();

        System.out.print("Saldo\t: ");
        double saldo = input.nextDouble();


        Penumpang penumpang = new Penumpang(nama, usia, saldo);
        penumpang.display();

    
        PemesananTiket pemesananTiket = new PemesananTiket();
        System.out.println("================================");
        System.out.println("Apakah anda ingin memesan tiket?");
        System.out.println("Pilih 1 jika iya!");
        System.out.println("Pilih 2 jika tidak!");
        int pilih = input.nextInt();
        if (pilih == 1) {
            pemesananTiket.pesanTiket(penumpang);
        } else {
            System.out.println("Pragram selesai");
        }

        penumpang.display();
        input.close();
    }
}
