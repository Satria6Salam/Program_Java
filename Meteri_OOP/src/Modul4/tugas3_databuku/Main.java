package Modul4.tugas3_databuku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        BukuAlamat obj = new BukuAlamat();

        obj.display("================================");
        System.out.print("Masukkan nama: ");
        String nama = inp.nextLine();
        obj.addNama(nama);

        obj.display("================================");
        System.out.print("Masukkan alamat: ");
        String alamat = inp.nextLine();
        obj.addAlamat(alamat);

        obj.display("================================");
        System.out.print("Masukkan No Hp: ");
        String noHp = inp.nextLine();
        obj.addNomorTelepon(noHp);

        obj.display("================================");
        System.out.print("Masukkan E-mail: ");
        String email = inp.nextLine();
        obj.addEmail(email);

        obj.display("================================");
        obj.display("      Informasi Buku Alamat     ");
        obj.display("================================");

        obj.display(obj.getNama(), "Nama");
        obj.display(obj.getAlamat(), "Alamat");
        obj.display(obj.getNomorTelepon(), "No Hp");
        obj.display(obj.getEmail(), "E-mail");

        inp.close();

    }
}
