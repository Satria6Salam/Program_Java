package latihan.transaksi_bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        RekeningBank rekeningBank;

        System.out.println("          Selamat Datang di Bank BCA         ");
        System.out.println("=============================================");
        System.out.print  ("Buat no rekening: ");
        String noRek = input.next();
        System.out.print  ("Nama pengguna   : ");
        String nama = input.next();
        System.out.print  ("Masukkan saldo awal: Rp. ");
        double saldo = input.nextDouble();

        rekeningBank = new RekeningBank(noRek, nama, saldo);
        rekeningBank.validasiNorRek();

        boolean next2 = true;

        while (next2) {
            System.out.println("---------------------------------------------");
            System.out.println("Pilih 1, jika No rekening tidak valid!");
            System.out.println("Pilih 2, jika No rekening sudah valid");
            System.out.println("---------------------------------------------");
            System.out.print  ("Pilih : ");
            int valid = input.nextInt();

            if (valid == 1) {
                System.out.print("No rekening baru: ");
                String noRekNew = input.next();
                rekeningBank.setNoRek(noRekNew);
                rekeningBank.validasiNorRek();
            } else {
                next2 = false;
            }
        }

        boolean next = true;
        String[] menu = {
            "Tampilkan Info Rekening",
            "Tempilkan info saldo",
            "Tambah Saldo",
            "Melakukan Penarikan",
            "Keluar"
        };
        
        while(next) {
            System.out.println("          Selamat Datang di Bank BCA         ");
            System.out.println("=============================================");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " +menu[i]);
            }

            System.out.print("Pilih Menu: ");
            int pilih = input.nextInt();

            

            switch (pilih) {
                case 1:
                    System.out.println("---------------------------------------------");
                    rekeningBank.display();
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    rekeningBank.validasiDeposit();
                    break;
                case 3: 
                    System.out.println("---------------------------------------------");
                    System.out.print("Masukkan Saldo: ");
                    double tambahSaldo = input.nextDouble();
                    rekeningBank.tambahSaldo(tambahSaldo);
                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    try {
                        rekeningBank.validasiPenarikan();
                        System.out.print("Tarik saldo sebesar Rp. ");
                        double tarikSaldo = input.nextDouble();
                        rekeningBank.tarikSaldo(tarikSaldo);
                        System.out.println("Berhasil melakukan penarikan");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    next = false;
                    break;
            }
        }

    }
}
