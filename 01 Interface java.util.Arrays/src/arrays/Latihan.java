package arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Latihan {
    public static void main(String[] args) {
        int[] number = {3,4,2,6,7};

        int index = Arrays.binarySearch(number, 0, number.length, (int)6);
        System.out.println(index);

        String[] string = {"asda", "ewe", "qweq", "wrwert", "ee", "q"};
        // Comparator<String> compa = Comparator.comparingInt(String::length);
        // int index2 = Arrays.binarySearch(string, 0, string.length, "q", compa);
        // System.out.println(index2);
        
        System.out.println("Sebelum diurutkan");
        System.out.println(Arrays.toString(string));

        // Mengurutkan dengan comparator
        Arrays.sort(string, Comparator.naturalOrder());

        System.out.println("Setelah diurutkan");
        System.out.println(Arrays.toString(string));

        int index2 = Arrays.binarySearch(string, "ewe", Comparator.naturalOrder());
        System.out.println("indek dari 'ewe' " + index2);

        // Arrays.sort(number, Comparator.naturalOrder()); tidak bisa harus beripe objek Integer

        System.out.println("===========================================================");
        // Array bersarang
        Integer[][] nestedArray1 = { {1, 2}, {3, 4} };
        Integer[][] nestedArray2 = { {1, 2}, {3, 4} };
        Integer[][] nestedArray3 = { {5, 6}, {7, 8} };

        // Menggunakan deepHashCode untuk mendapatkan hash unik
        int hash1 = Arrays.deepHashCode(nestedArray1);
        int hash2 = Arrays.deepHashCode(nestedArray2);
        int hash3 = Arrays.deepHashCode(nestedArray3);

        // Menyimpan array ke dalam HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(hash1, "Array 1");
        hashMap.put(hash2, "Array 2");
        hashMap.put(hash3, "Array 3");

        // Menampilkan hash dari setiap array
        System.out.println("Hash Array 1: " + hash1);
        System.out.println("Hash Array 2: " + hash2);
        System.out.println("Hash Array 3: " + hash3);

        // Mengecek apakah hash dari nestedArray2 sama dengan nestedArray1
        System.out.println("Apakah hash Array 1 dan Array 2 sama? " + (hash1 == hash2));

        // Mengambil nilai dari HashMap berdasarkan hash array
        System.out.println("Data di HashMap dengan hash Array 1: " + hashMap.get(hash1));
        System.out.println("Data di HashMap dengan hash Array 3: " + hashMap.get(hash3));

        
        System.out.println("===========================================================");
        // Membuat HashMap dengan deepHashCode sebagai key
        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(Arrays.deepHashCode(nestedArray1), "Data dari Array 1");
        hashMap2.put(Arrays.deepHashCode(nestedArray3), "Data dari Array 3");

        // Mencari data berdasarkan array (gunakan deepHashCode untuk mengambil key)
        Integer[][] searchArray = { {1, 2}, {3, 4} };
        int searchHash = Arrays.deepHashCode(searchArray);

        // Mengambil nilai dari HashMap
        String result = hashMap2.get(searchHash);

        // Menampilkan hasil
        System.out.println("Hash dari searchArray: " + searchHash);
        System.out.println("Data ditemukan: " + result);
    }
}
