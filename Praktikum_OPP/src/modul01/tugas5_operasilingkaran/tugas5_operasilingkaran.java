package modul01.tugas5_operasilingkaran;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

class Lingkaran {
    private double phi;
    private double jariJari;
    
    Lingkaran() {
        this.phi = 3.14;
    }

    double getPhi() {
        return this.phi;
    }

    double getKeliling(double jariJari) {
        this.jariJari = jariJari;
        return 2 * this.phi * jariJari;
    }

    double getLuas(double jariJari) {
        this.jariJari = jariJari;
        return this.phi * jariJari * jariJari;
    }

    void displayLuas() {
        System.out.println("Phi\t : " + this.phi);
        System.out.println("Jari-jari: " + this.jariJari);
        System.out.println("> " + this.phi + " x " + this.jariJari + " x " + this.jariJari);
        System.out.println("Hasil Luas Lingkaran: " + getLuas(this.jariJari));
    }

    void displayKeliling() {
        System.out.println("Phi\t : " + this.phi);
        System.out.println("Jari-jari: " + this.jariJari);
        System.out.println("> 2 x " + this.phi + " x " + this.jariJari);
        System.out.println("Hasil Keliling Lingkaran: " + getKeliling(this.jariJari));
    }
}

public class tugas5_operasilingkaran {
    public static void main(String[] args) throws IOException {
        Lingkaran lingkaran = new Lingkaran();
        ArrayList<Double> listLuas = new ArrayList<>();
        ArrayList<Double> listKeliling = new ArrayList<>();
        ArrayList<Double> listJariL = new ArrayList<>();
        ArrayList<Double> listJariK = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] menu = {
            "Hitung Luas",
            "Hitung Keliling",
            "Hasil Semua Perhitungan Luas",
            "Hasil Semua Perhitungan Kelilis",
            "Keluar Dari Operasi"
        };

        boolean next = true;
        while (next != false) {
            System.out.println("===================================================");
            System.out.println("                 OPERASI LINGKARAN                 ");
            System.out.println("===================================================");

            for (int i = 0; i < menu.length; i++) {
                System.out.println((1 + i) + ". " + menu[i]);
            }

            System.out.println("Pilih 1-4 dengan input angka! dan 5 untuk keluar!");
            System.out.print  ("Input pilihan: ");
            int inp = Integer.parseInt(input.readLine());

            switch (inp) {
                case 1:
                    System.out.println("===================================================");
                    System.out.println("                    HITUNG LUAS                    ");
                    System.out.println("===================================================");

                    System.out.print("Input Jari-Jari: ");
                    double jariJari = Double.parseDouble(input.readLine());
                    double luas = lingkaran.getLuas(jariJari);
                    listLuas.add(luas);
                    listJariL.add(jariJari);
                    lingkaran.displayLuas();
                    break;
                case 2:
                    System.out.println("===================================================");
                    System.out.println("                   HITUNG KELILING                 ");
                    System.out.println("===================================================");

                    System.out.print  ("Input Jari-Jari: ");
                    double jariJari2 = Double.parseDouble(input.readLine());
                    double keliling = lingkaran.getKeliling(jariJari2);
                    listKeliling.add(keliling);
                    listJariK.add(jariJari2); 
                    lingkaran.displayKeliling();
                    break;
                case 3: 
                        if (listLuas.isEmpty() == false) {
                            System.out.println("===================================================");
                            System.out.println("                  HASIL HITUNG LUAS                ");
                            System.out.println("===================================================");

                            for (int i = 0; i < listLuas.size(); i++) {
                                System.out.println((1+i) + ". " + lingkaran.getPhi() + " x " + listJariL.get(i) + " x " + listJariL.get(i) + " = " + listLuas.get(i));
                            } 
                        } else {
                            System.out.println("Daftar Perhitungan Luas Masih Kosong");
                            break;
                        }
                    break;
                case 4:
                    if (listKeliling.isEmpty() == false) {
                        System.out.println("===================================================");
                        System.out.println("                HASIL HITUNG KELILING              ");
                        System.out.println("===================================================");
                        for (int i = 0; i < listKeliling.size(); i++) {
                            System.out.println((1+i) + ". 2 x " + lingkaran.getPhi() + " x " + listJariK.get(i) + " = " + listKeliling.get(i));
                        }
                    } else {
                        System.out.println("Daftar Perhitungan Keliling Masih Kosong");
                        break;
                    }
                    break;
                case 5:
                    System.out.println("===================================================");
                    System.out.println("                   OPERASI SELESAI                 ");
                    System.out.println("===================================================");
                    next = false;
                    break;
            }
        }
    }
}

