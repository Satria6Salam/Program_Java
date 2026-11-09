package modul_5.pengolahan_nilai;

public class Sekolahan {
    private Siswa[] listSiswa = new Siswa[3];
    private Siswa[] peringkat = new Siswa[10];
    private int indek = 0;

    public Siswa[] getSiswa() {
        return listSiswa;
    }

    public Siswa[] getPeringkat() {
        return peringkat;
    }

    public void setListSiswa(Siswa siswa) {
        if (indek < 10) {
            this.listSiswa[indek] = siswa;
            this.indek++;
        }
    }

    public void setPeringkat() {
        if (listSiswa != null) {
            for (int i = 0; i < listSiswa.length - 1; i++) {
                int indekTerkcil = i;
                for (int j = i + 1; j < listSiswa.length; j++) {
                    if (listSiswa[j].getTotalNilai() < listSiswa[indekTerkcil].getTotalNilai()) {
                        indekTerkcil = j;
                    }
                }
                
                Siswa buf = listSiswa[i];
                listSiswa[i] = listSiswa[indekTerkcil];
                listSiswa[indekTerkcil] = buf;
            }

            System.out.println("Hasil nilai berhasil dirangking");
        } else {
            System.out.println("List Siswa Kosong!!!");
        }
    }

    public void daftarPeringkat() {
        for (int i = 0; i < listSiswa.length; i++) {

                this.listSiswa[i].display();
  
        }
    }
}
