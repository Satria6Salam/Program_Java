package interface_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("1. Metode put(key, value) $ get(key):");
        Map<String, Integer> nilaiMahasiswa = new HashMap<>();
        nilaiMahasiswa.put("Budi", 80);
        nilaiMahasiswa.put("Budi", 90); // Nilai 80 akan ditimpa

        System.out.println("Nilai Budi: " + nilaiMahasiswa.get("Budi")); // Output: 90
        // System.out.println(nilaiMahasiswa.containsKey("A"));

        System.out.println("=========================================");
        System.out.println("2. Metode remove(key):");
        nilaiMahasiswa.put("Satria", 75);
        nilaiMahasiswa.put("Wawan", 75);
        nilaiMahasiswa.put("Doni", 75);
        nilaiMahasiswa.remove("Wawan");
        System.out.println("Setalah 'Wawan' dihapus: " + nilaiMahasiswa);

        System.out.println("=========================================");
        System.out.println("3. Metode size():");
        System.out.println("Size: " + nilaiMahasiswa.size());

        System.out.println("=========================================");
        System.out.println("4. Metode keySet():");
        Set<String> kunci = nilaiMahasiswa.keySet();
        kunci.remove("Doni"); // Menghapus "Budi" dari Map
        System.out.println("Setelah 'Doni' dihapus: " + kunci);

        System.out.println("=========================================");
        System.out.println("5. Metode entrySet():");
        nilaiMahasiswa.put("Bobi", 60);
        nilaiMahasiswa.put("Hasan", 87);

        System.out.println("=========================================");
        Set<Map.Entry<String, Integer>> entri = nilaiMahasiswa.entrySet();
        for (Map.Entry<String, Integer> e : entri) {
            if (e.getKey().equals("Budi")) {
                e.setValue(85); // Mengubah nilai Budi menjadi 85
            }
        }

        System.out.println("Nilai Budi: " + nilaiMahasiswa.get("Budi"));

        System.out.println("=========================================");
        System.out.println("6. Metode values():");
        System.out.println("Semua nilai: " + nilaiMahasiswa.values());

    }
}
