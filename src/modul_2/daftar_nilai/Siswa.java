package modul_2.daftar_nilai;

public class Siswa {
    private String name, nim, fakultas, prodi;
    private Calculus calculus;
    private OPP opp;
    private Aljabar aljabar;
    private static int jumlahSiswa;

    public Siswa(String name, String nim, String fakultas, String prodi) {
        this.name = name;
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
        Siswa.jumlahSiswa++;
    }
    public OPP getOpp() {
        return this.opp;
    }

    public double getRatarata() {
        return (this.calculus.getNilaiAkhir() + this.opp.getNilaiAkhir()) / 2;
    }

    public String getName() {
        return this.name;
    }

    public String getNim() {
        return this.nim;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public String getProdi() {
        return this.prodi;
    }

    public static int getJumlahSiswa() {
        return Siswa.jumlahSiswa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void addCalculus(Calculus calculus) {
        this.calculus = calculus;
    }

    public void addOpp(OPP opp) {
        this.opp = opp;
    }

    public void addAljabar(Aljabar aljabar) {
        this.aljabar = aljabar;
    }

    public void display() {
        System.out.println("---------------------------------------");
        System.out.println("Nama\t\t: " + getName());
        System.out.println("NIM\t\t: " + getNim());
        System.out.println("Fakultas\t: " + getFakultas());
        System.out.println("Program Studi\t: " + getProdi());
        System.out.println("---------------------------------------");
        System.out.println("MataKuliah yang diambil");
        System.out.println("1. OPP");
        System.out.println("2. Calculus");
        System.out.println("3. Aljabar");
    }

    public void displayNilai() {
        this.opp.display();
        this.calculus.display();
        this.aljabar.display();
        System.out.println("---------------------------------------");
        System.out.println("Rata-rata\t\t: " + getRatarata());

    }
} 
