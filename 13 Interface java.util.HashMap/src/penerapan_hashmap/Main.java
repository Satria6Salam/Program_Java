package penerapan_hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("HashMap berhasil dibuat");

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("\nMenambah Elemen put()");
        System.out.println(map);

        System.out.println("\nMengambil Nilai get()");
        System.out.println("Value dari key 2: " + map.get(2));

        System.out.println("\nMengecek Keberadaan Kunnci containKey()");
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(10));

        System.out.println("\nMengecek Keberadaan Nilai containsValue()");
        System.out.println(map.containsValue("C++"));
        System.out.println(map.containsValue("Ruby"));

        System.out.println("\nMenghapus Semua Elemen remove()");
        map.remove(2);
        System.out.println(map);

        System.out.println("\nMenampilkan Semua Kunci keySet()");
        System.out.println(map.keySet());

        System.out.println("\nMenampilkan Semua Nilai values()");
        System.out.println(map.values());

        System.out.println("\nMenampilkan Semua Pasangan Key-Value entrySet()");
        System.out.println(map.entrySet());

        System.out.println("\nMengecek Ukuran HashMap size()");
        System.out.println("Ukuran HashMap: " + map.size());

        System.out.println("\nMenghapus Semua Elemen clear()");
        map.clear();
        System.out.println(map);

        System.out.println("\nMengecek Apakah HashMap Kosong isEmpty()");
        System.out.println(map.isEmpty());

        
    }
}
