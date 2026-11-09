package modul_1.hitung_luas;

public class Main {
    public static void main(String[] args) {
        VolumTabung bangun1 = new VolumTabung(7, 10);
        LuasTrapesium bangun2 = new LuasTrapesium(12, 5, 8);
        LuasPersegiPanjang bangun3 = new LuasPersegiPanjang(12, 2);

        bangun1.display();
        bangun2.display();
        bangun3.display();

        System.out.println(bangun1.getJariJari());
        System.out.println(bangun2.getPanjangALas());
        bangun3.setLebar(12);
        bangun3.display();
    }
}