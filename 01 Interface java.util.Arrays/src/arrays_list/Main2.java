
package arrays_list;

import java.util.Arrays;
import java.util.ArrayList;
// import java.util.Collections; // import the Collections claas

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>(1);
        System.out.println("10. Membuat ArrayList dengan kapasitas 10");
        System.out.println("Size : " + string.size());
        string.add("Satria");
        string.add("Salam");
        string.add("Badrus");
        System.out.println("Name : " + string);
        System.out.println("Size : " + string.size());

        System.out.println("\n11. Membuat Daftar yang Memuat Elemen-Elemen Koleksi yang Ditentukan");
        // Membuat koleksi elemen menggunakan Arrays.asList
        ArrayList<String> string2 = new ArrayList<>(Arrays.asList("Rizqi", "Vika"));
        // Membuat ArrayList baru yang memuat elemen dari initialList
        ArrayList<String> list = new ArrayList<>(string2);
        System.out.println("Name : " + list);

        System.out.println("\n12. Metode addAll() : menambah colections");
        string.addAll(string2);
        System.out.println("Name : " + string);

        System.out.println("\n13. Metode addAll() : menambah colections dari indek ke");
        ArrayList<String> string3 = new ArrayList<>(Arrays.asList("Doni", "Irawan", "Rudi"));
        string.addAll(0,string3);
        System.out.println("Name : " + string);

        System.out.println("\n15. Metode clone() : salinan dangkal dari daftar");
        // Menggunakan metode clone() untuk membuat salinan dangkal
        @SuppressWarnings("unchecked")
        // (ArrayList<String>) : casting "penyulihan tipe" Karena metode clone() 
        // mengembalikan objek bertipe Object, kita perlu mengubahnya menjadi ArrayList<String>
        ArrayList<String> clonedList = (ArrayList<String>) string.clone(); 
        System.out.println("Daftar yang telah disalin : " + clonedList);

        System.out.println(">> Mengubah didaftar asli");
        string.set(0, "Wawan");

        System.out.println("Daftar asli setelah perubahan : " + string);
        System.out.println("Daftar yang disalin setelah perubahan : " + clonedList);

        System.out.println("\n16. Metode contains(Object o) : memeriksa element dalam daftar");
        String stringCheck = "Salam";
        if (string.contains(stringCheck)) {
            System.out.println(stringCheck + " ada dalam daftar");
        } else {
            System.out.println(stringCheck + " tidak ada dalam daftar");
        }

        System.out.println("\n17. Metode ensureCapacity(int minCapacity)");
        ArrayList<Integer> number = new ArrayList<>(2);
        number.add(3);
        number.add(2);
        System.out.println(">> Kasitas saat ini : " + number.size());

        // Menambah tanpa memastikan kapasitas 
        number.add(3);
        System.out.println(">> Setelah menambah elemen : " + number);

        // Memastikan kapasitas minimum
        number.ensureCapacity(8);
        System.out.println("Kapasitas setelah ensureCapacity(8) : " + number.size());


    }
}
