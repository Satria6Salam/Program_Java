// 240605110201_Satria Badrus Salam

package modul01.tugas_seleksi_kondisi;

import java.util.Scanner;

class SeleksiNilai {
    private int nilai;
    private String nama;
    
    SeleksiNilai(String nama, int nilai){
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public String getKelulusan() {
        String status = "";
        if (this.nilai >= 90 && this.nilai <= 100) {
            status =  "Siswa dengan nama: " + this.nama + " Predikat: A";
        } else if (this.nilai >= 80 && this.nilai < 90) {
            status = "Siswa dengan nama: " + this.nama + " Predikat: B";
        } else if (this.nilai >= 75 && this.nilai < 80) {
            status = "Siswa dengan nama: " + this.nama + " Predikat: C";
        } else if (this.nilai < 75) {
            status = "Siswa dengan nama: " + this.nama + " Predikat: D";
        } else if (this.nilai <= 0) {
            status = "Nilai: negatif";
        }
        
        return status;
    }
}

public class PredikatNilai {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        System.out.println("    Cek Predikat Nilai Siswa   ");
        System.out.println("===============================");
        System.out.print  ("Nama\t: ");
        String nama = in.nextLine();
        System.out.print  ("Nilai\t: "); 
        int nilai = in.nextInt();

        SeleksiNilai nilai1 = new SeleksiNilai(nama, nilai);
        
        System.out.println(nilai1.getKelulusan());
       
    }
}
