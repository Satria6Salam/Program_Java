package modul_1.hitung_lingkaran;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        Lingkaran bangun1 = new Lingkaran();
        Lingkaran bangun2 = new Lingkaran(7);
        Lingkaran bangun3 = new Lingkaran(21);

        System.out.println("Jari-jari lingkaran 1 : " + bangun1.getJariJari());
        System.out.println("Jari-jari lingkaran 2 : " + bangun2.getJariJari());
        System.out.println("Jari-jari lingkaran 3 : " + bangun3.getJariJari());

        System.out.println("Luas lingkaran 1 : " + bangun1.getLuas());
        bangun1.setJariJari(10);
        System.out.println("Luas lingkaran 1 : " + bangun1.getLuas());
        System.out.println("Luas lingkaran 2 : " + bangun2.getLuas());
        System.out.println("Luas lingkaran 3 : " + bangun3.getLuas());
        System.out.println("Keliling lingkaran 2 : " + bangun2.getKeliling());
        System.out.println("Jumlah lingkaran : " + Lingkaran.getJumlahLingkaran());

    }
}
