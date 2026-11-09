package modul_1.sistem_karyawan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        
        System.out.println("===================================================");
        System.out.println("                  Nama Perusahaan                  ");
        System.out.println("===================================================");

        System.out.println("Buat nama perusahaan & kapasitas karyawan");
        System.out.print  ("Nama perusahaan: ");
        String namePerusahaan = input.readLine();
        System.out.print  ("Kapasitas karyawan: ");
        int kapasitas = Integer.parseInt(input.readLine());

        ManajemenKaryawan perusahaan = new ManajemenKaryawan(namePerusahaan, kapasitas);

        String[] menu = { 
            "Tambah karyawan tetap dan gaji", 
            "Tambah karyawan harian dan gaji", 
            "Informasi gaji seluruh karyawan",
            "Informasi total gaji karyawan",
            "Exit"
        };
        boolean pilihan = true;

        do {
            System.out.println("===================================================");
            System.out.println("                    MENU UTAMA                     ");
            System.out.println("===================================================");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((1 + i) + ". " + menu[i]);
            }
            System.out.println("===================================================");
            System.out.print  ("Pilih Menu (1-6) : ");
            int pilihMenu = Integer.parseInt(input.readLine());

            switch (pilihMenu) {
                case 1:
                    System.out.println("===================================================");
                    System.out.println("              Karyawan Tetap dan Gaji              ");
                    System.out.println("===================================================");
                    System.out.print  ("Berapa karyawan yang akan ditambahkan: ");
                    int jumlahKaryawanTetap = Integer.parseInt(input.readLine());
                    
                        for (int i = 0; i < jumlahKaryawanTetap; i++) {
                            try {
                                System.out.print  ("Nama\t\t: ");
                                String namaTetap = input.readLine();
                                System.out.print  ("NIK\t\t: ");
                                int nikTetap = Integer.parseInt(input.readLine());
                                System.out.print  ("Gaji Pokok\t: ");
                                double gajiTetap = Double.parseDouble(input.readLine());
                                System.out.print  ("Tunjangan\t: ");
                                double tunjanganTetap = Double.parseDouble(input.readLine());
        
                                KaryawanTetap karyawanTetap = new KaryawanTetap(namaTetap, nikTetap, gajiTetap, tunjanganTetap);
                                perusahaan.addKaryawan(karyawanTetap);
                            } catch (NumberFormatException exception) {
                                System.err.println("Input harus sesua type data");
                                i--;
                            }
                        }
                    break;
                case 2:
                    System.out.println("===================================================");
                    System.out.println("             Karyawan Harian dan Gaji              ");
                    System.out.println("===================================================");
                    System.out.print  ("Berapa karyawan yang akan ditambahkan: ");
                    int jumlahKaryawanHarian = Integer.parseInt(input.readLine());

                    for (int i = 0; i < jumlahKaryawanHarian; i++) {
                        try {
                            System.out.print  ("Nama\t\t: ");
                            String namaHarian = input.readLine();
                            System.out.print  ("NIK\t\t: ");
                            int nikHarian = Integer.parseInt(input.readLine());
                            System.out.print  ("Gaji pokok\t: ");
                            double gajiHarian = Double.parseDouble(input.readLine());
                            System.out.print  ("Jam kerja\t: ");
                            int jamKerja = Integer.parseInt(input.readLine());
                            System.out.print  ("Tarif per/jam\t: ");
                            double tarifPerjam = Double.parseDouble(input.readLine());

                            KaryawanHarian karyawanHarian = new KaryawanHarian(namaHarian, nikHarian, gajiHarian, jamKerja, tarifPerjam);
                            perusahaan.addKaryawan(karyawanHarian);
                        } catch (Exception e) {
                            System.err.println("Input harus sesua type data");
                            i--;
                        }
                    }
                    break;
                case 3:
                    if (perusahaan.getJumlahKaryawan() == kapasitas) {
                        perusahaan.displayKaryawan();
                    } else {
                        System.out.println("Kapasitas Perusahaan harus terpenuhi");
                        continue;
                    }
                    break;
                case 4:
                    System.out.println("===================================================");
                    System.out.println("Total seluruh gaji karyawan: " + perusahaan.getTotalGaji());
                    System.out.println("===================================================");
                    break;
                case 5:
                    pilihan = false;
                    break;
            }
        } while (pilihan == true);

        perusahaan.getJumlahKaryawan();
    }
}
