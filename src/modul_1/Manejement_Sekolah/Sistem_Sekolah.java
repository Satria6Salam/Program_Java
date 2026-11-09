package modul_1.Manejement_Sekolah;

import java.util.Arrays;

public class Sistem_Sekolah {
    private String namaSekolah;
    private int npsn;
    private int jumlahSiswa;
    private int kapasitas;
    private int jumlahMatkul;
    private Siswa[] listSiswa;
    private double[] copyNilai;

    public Sistem_Sekolah(String namaSekolah, int npsn, int jumlahSiswa) {
        this.namaSekolah = namaSekolah;
        this.npsn = npsn;
        this.jumlahSiswa = jumlahSiswa;
        this.kapasitas = 0;
        this.listSiswa = new Siswa[jumlahSiswa];
    }
 
    public double[] getcopyNilai() {
        this.copyNilai = new double[this.jumlahSiswa];

        for (int i = 0; i < this.jumlahSiswa; i++) {
            this.copyNilai[i] = this.listSiswa[i].getAverage();
        }

        Arrays.sort(this.copyNilai); 
        double[] terbalik = Arrays.copyOf(copyNilai, copyNilai.length);
        for (int i = 0; i < copyNilai.length; i++) {
            copyNilai[i] = terbalik[(copyNilai.length - 1) - i];
        }
        return this.copyNilai;
    }

    public String getNamaSekolah() {
        return this.namaSekolah;
    }

    public int getNpsn() {
        return this.npsn;
    }

    public int getJumlahSiswa() {
        return this.jumlahSiswa;
    }

    public int getkapasitas() {
        return this.kapasitas;
    }

    public int getJumlahMatkul() {
        return this.jumlahMatkul;
    }

    public Siswa[] getSiswa() {
        return this.listSiswa;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public void setNpsn(int npsn) {
        this.npsn = npsn;
    }

    public void setJumlahSiswa(int jumlahSiswa) {
        this.jumlahSiswa = jumlahSiswa;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setSiswa(Siswa[] listSiswa) {
        this.listSiswa = listSiswa;
    }

    public void addListSiswa(Siswa siswa) {
        this.jumlahMatkul = siswa.getJumlahMatkul();
        if (kapasitas < this.jumlahSiswa) {
            this.listSiswa[kapasitas] = siswa;
            this.kapasitas++;
        } else {
            System.out.println("Kapasitas penuh");
        }
    } 

    public void daftarSiswa() {
        System.out.println("==========================================");
        System.out.println("Sekolah\t: " + this.getNamaSekolah());
        System.out.println("NPSN\t: " + this.getNpsn());
        System.out.println("Jumlah\t: " + this.jumlahSiswa + " Siswa");
        System.out.println("==========================================");
        System.out.println("Daftar Nilai Siswa: ");
        
        for (int i = 0; i < jumlahSiswa; i++) {
            this.listSiswa[i].daftarNilai();
        }
    }

}
