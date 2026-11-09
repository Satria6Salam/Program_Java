package Modul3.tugas_programgajipegawai;

class Pegawai {
    private int id;
    private String nama;
    private String jabatan;
    private int masaKerja;
    private double gaji;
    private double tunjangan;


    public Pegawai(int id, String nama, String jabatan, int masaKerja) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.masaKerja = masaKerja;
    }

    public int getd() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public int getMasaKerja() {
        return this.masaKerja;
    }

    public double getGaji() {
        return hitungGaji();
    }

    public double getTunjangan() {
        return hitungTunjangan();
    }

    public double hitungTunjangan() {
        this.tunjangan = 0;
        if (this.jabatan.equalsIgnoreCase("Staf")) {
            if (this.masaKerja > 10) {
                return tunjangan = 700000; 
            } else if (this.masaKerja >= 5 && this.masaKerja <= 10) {
                return tunjangan = 600000;
            } else if (this.masaKerja < 5) {
                return tunjangan = 500000;
            } else {
                return tunjangan;
            }
        } else if (this.jabatan.equalsIgnoreCase("Menejer")) {
            return tunjangan = 1500000;
        } else {
            return tunjangan;
        }
    }

    public double hitungGaji() {
        this.gaji = 0;
        if (this.jabatan.equalsIgnoreCase("Menejer")) {
            return gaji = 1000000;
        } else if (this.jabatan.equalsIgnoreCase("Staf")) {
            return gaji = 7000000;
        } else {
            return gaji;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public void display() {
        System.out.println("\n===================================");
        System.out.println("         Jabatan: " + this.jabatan);
        System.out.println("===================================");
        System.out.println("ID\t\t: " + this.id);
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Masa Kerja\t: " + this.masaKerja + " Tahun");
        System.out.println("Gaji\t\t: Rp." + hitungGaji());
        System.out.println("Tunjangan\t: Rp." + hitungTunjangan());
        System.out.println("Total\t\t: Rp." + (hitungGaji() + hitungTunjangan()));
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai(12344, "Satria", "Menejer", 10);
        Pegawai pegawai2 = new Pegawai(12378, "Bagas", "Staf", 6);
        Pegawai pegawai3 = new Pegawai(12390, "Kahfi", "Staf", 2);
        pegawai1.display();
        pegawai2.display();
        pegawai3.display();

        System.out.println("\n================================================================================");
        System.out.println("Mencoba mengganti atribut dari pegawai 3  (nama (Romadon) dan jabatan (Menejer))");
        pegawai3.setNama("Romadon");
        pegawai3.setJabatan("Menejer");
        pegawai3.display();
    }
}



