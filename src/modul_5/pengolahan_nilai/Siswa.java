package modul_5.pengolahan_nilai;

public class Siswa extends Person {
    private String kelas;
    private static final String[] listMapel = {
        "Bahasa Indonesia",
        "Calculus",
        "Fisika"
    };
    private double[][] nilai = new double[3][4];
    private double[] rataRata = new double[3];
    private double totalNilai = 0;

    // Methode
    public String kelas() {
        return this.kelas;
    }

    public static String[] getListMapel() {
        return listMapel;
    }

    public double[][] getNilai() {
        return this.nilai;
    }

    public double[] getRataRata() {
        return this.rataRata;
    }

    public double getTotalNilai() {
        return this.totalNilai;
    }

    @Override
    public void nama(String nama) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'nama'");
        this.setNama(nama); 
    }

    @Override
    public void id(String id) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'id'");
        this.setId(id);
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNilai(double[][] nilai) {
        this.nilai = nilai;
    }

    public void setRataRata() {
        double jmlh = 0;
        if (this.nilai != null) {
            for (int i = 0; i < nilai.length; i++) {
                jmlh = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    jmlh = jmlh + nilai[i][j];
                    rataRata[i] = jmlh / nilai[i].length;
                }
            }
        }
    }

    public void setTotalNilai() {
        if (rataRata != null) {
            for (int i = 0; i < rataRata.length; i++) {
                this.totalNilai = this.totalNilai + this.rataRata[i];
            }
        }
    }

    @Override
    public void display() {
        System.out.println("========================================");
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("ID\t: " + this.getId());
        System.out.println("Kelas\t: " + this.kelas);
        System.out.println("--------------------------------");
        System.out.println("Daftar Rata-Rata per Matakuliah");
        System.out.println("--------------------------------");
        for (int i = 0; i < listMapel.length; i++) {
            System.out.println((1+i) + ". " +Siswa.listMapel[i] + ": " + this.rataRata[i]);
        }
        System.out.println("--------------------------------");
        System.out.println("Total nilai seluruh matakuliah");
        System.out.println(">>> " + this.totalNilai);
    }
}
