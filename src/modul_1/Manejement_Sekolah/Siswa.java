package modul_1.Manejement_Sekolah;

public class Siswa {
    private String namaSiswa;
    private String jurusan;
    private int nim;
    private int semester;
    private int kapasitas;
    private int jumlahMatkul;
    private MataKuliah[] mataKuliah;
    private Nilai[] nilai;

    public Siswa(String namaSiswa, String jurusan, int nim, int semester, int jumlahMatkul) {
        this.namaSiswa = namaSiswa;
        this.jurusan = jurusan;
        this.nim = nim;
        this.semester = semester;
        this.kapasitas = 0;
        this.jumlahMatkul = jumlahMatkul;
        this.mataKuliah = new MataKuliah[this.getJumlahMatkul()];
        this.nilai = new Nilai[this.getJumlahMatkul()];
    }

    public Nilai[] getListNilai() {
        return this.nilai;
    }

    public double getAverage() {
        double average = 0;
        double total = 0;
        for (int i = 0; i < this.jumlahMatkul; i++) {
            total = total + this.nilai[i].getNilai();
        }
        average = total / this.jumlahMatkul;
        return average;
    }

    public String getNamaSiswa() {
        return this.namaSiswa;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public int getNim() {
        return this.nim;
    }

    public int getSemster() {
        return this.semester;
    }

    public int getJumlahMatkul() {
        return this.jumlahMatkul;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public void setJumlahMatkul(int jumlahMatkul) {
        this.jumlahMatkul = jumlahMatkul;
    }

    public void add(MataKuliah mataKuliah, Nilai nilai) {
        if (kapasitas < this.mataKuliah.length) {
            this.mataKuliah[kapasitas] = mataKuliah;
            this.nilai[kapasitas] = nilai;
            kapasitas++;
        } else {
            System.out.println("Kapasitas sudah penuh");
        }
    }

    public void daftarNilai() {
        System.out.println("------------------------------------------");
        System.out.println("Nama\t\t: " + this.getNamaSiswa());
        System.out.println("Jurusan\t\t: " + this.getJurusan());
        System.out.println("NIM\t\t: " + this.getNim());
        System.out.println("Semester\t: " + this.getSemster());
        System.out.println("------------------------------------------");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(this.mataKuliah[i].getMatkul() + "\t: " + this.nilai[i].getNilai());
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Rata-rata: " + this.getAverage());
        System.out.println("------------------------------------------");


    }


}
