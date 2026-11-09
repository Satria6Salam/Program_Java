package Modul9;

import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        HashMap<String, String> provinsi = new HashMap<>();

        provinsi.put("Jawa Barat", "Bandung");
        provinsi.put("Jawa Tengah", "Semarang");
        provinsi.put("Jawa Timur", "Surabaya");

        System.out.println("============================================");
        System.out.println("Mendapat Nilai Dari key 'Jawa Barat': " + provinsi.get("Jawa Barat"));

        System.out.println("============================================");
        System.out.println("Cek key 'Sumatra Barat' apakah ada dalam HashMap: " + provinsi.containsKey("Sumatra Barat"));
        System.out.println("Cek value 'Semarang' apakah ada dalam HashMap: " + provinsi.containsValue("Semarang"));

    }
}
