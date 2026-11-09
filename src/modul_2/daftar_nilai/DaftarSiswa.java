package modul_2.daftar_nilai;

public class DaftarSiswa {
    private Siswa[] siswa;
    private int indek;

    public DaftarSiswa() {
        this.siswa = new Siswa[30];
        this.indek = 0;
    }

    public void addSiswa(Siswa siswa) {
        if (indek < 30) {
            this.siswa[indek] = siswa;
            this.indek++;
        } else {
            System.out.println("Kapasitas penuh");
        }
    }

    public void daftarSiswa() {
        for (int i = 0; i < siswa.length; i++) {
            if (this.siswa[i] != null) {
                siswa[i].display();
                siswa[i].displayNilai();
            } else if (this.siswa[i] == null) {
                break;
            }
        }
    }


}
