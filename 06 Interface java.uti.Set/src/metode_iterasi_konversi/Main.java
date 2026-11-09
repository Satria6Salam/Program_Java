package metode_iterasi_konversi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Membuat Set untuk menyimpan produk unik
        Set<String> productSet = new HashSet<>();

        // Menambahkan produk ke dalam Set
        productSet.add("Laptop");
        productSet.add("Smartphone");
        productSet.add("Headphone");
        productSet.add("Smartwatch");
        productSet.add("Laptop"); // Duplikat, tidak akan ditambahkan

        // Menampilkan daftar produk menggunakan for-each
        System.out.println("==================================");
        System.out.println("1. Daftar Produk (for-each):");
        for (String product : productSet) {
            System.out.println("- " + product);
        }

        // Menampilkan daftar produk menggunakan Iterator
        System.out.println("==================================");
        System.out.println("2. Daftar Produk (Iterator):");
        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }

        // Menampilkan daftar produk menggunakan forEach + lambda
        System.out.println("==================================");
        System.out.println("3. Daftar Produk (forEach + Lambda):");
        productSet.forEach(product -> System.out.println("- " + product));

        // Mengonversi Set ke dalam array
        String[] productArray = productSet.toArray(new String[0]);

        // Menampilkan hasil konversi ke array
        System.out.println("==================================");
        System.out.println("4. Daftar Produk dalam bentuk Array:");
        for (String product : productArray) {
            System.out.println("- " + product);
        }
    }
}
