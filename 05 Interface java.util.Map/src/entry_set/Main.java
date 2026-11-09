package entry_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nilaiMahasiswa = new HashMap<>();
        nilaiMahasiswa.put("Budi", 70);
        nilaiMahasiswa.put("Andi", 80);

        // Panggil metode entrySet() pada objek Map
        Set<Map.Entry<String, Integer>> entry = nilaiMahasiswa.entrySet();

        // Make for-each atau iterator untuk menjelajahi setiap entri dalam set
        for (Map.Entry<String,Integer> e : entry) {
            String nama = e.getKey();
            int nilai = e.getValue();

            System.out.println(nama + ": " + nilai);
        }

        // Menacari nilai dari suatu kunci yang ditentukan
        for (Map.Entry<String,Integer> e : entry) {
            if (e.getKey().equals("Andi")) {
                System.out.println("Nilai Andi: " + e.getValue());
                break;
            }
        }
    }
}
