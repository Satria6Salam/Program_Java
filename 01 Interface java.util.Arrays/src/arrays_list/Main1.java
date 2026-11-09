/*
 *  1. Elemen dalam ArrayList sebenarnya adalah objek.
 *  2. Dalam contoh di atas, kita membuat elemen (objek) bertipe "String". 
 *     Ingat bahwa String di Java adalah objek (bukan tipe primitif). 
 *  3. Untuk menggunakan tipe lain, seperti int, Anda harus menentukan 
 *     kelas pembungkus yang setara : Integer. Untuk tipe primitif lainnya, 
 *     gunakan: Booleanuntuk boolean, Characteruntuk char, Doubleuntuk double, dst.:
 *  4. Kelas lain yang berguna dalam java.utilpaket tersebut adalah Collectionskelas, 
 *     yang menyertakan sort()metode untuk mengurutkan daftar berdasarkan abjad atau angka:
 */

package arrays_list;

// import ArrayList class dalam java
import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<String> name = new ArrayList<String>();

        System.out.println("1. Metode add");
        name.add("Satria");
        name.add("Rizqi");
        name.add("Sari");
        System.out.println(name);
        // for (String str : name) {
        //     System.out.println(str);
        // }

        System.out.println("\n2. Metode add() : insert");
        name.add(1, "Vika");
        System.out.println("Insert indeks ke 1 : " + name);

        System.out.println("\n3. Metode get() : acces items");
        String get = name.get(0);
        System.out.println(get);

        System.out.println("\n4. Metode set() : ubah items");
        name.set(0,"Ronald");
        System.out.println("Ubah items indeks 0 : " + name);

        System.out.println("\n5. Metode remove() : mengahapus items");
        name.remove(0);
        System.out.println("Remove indek ke 0 : " + name);

        System.out.println("\n6. Metode clear() : menghapus semua elemen");
        // name.clear();
        // System.out.println(name);

        System.out.println("\n7. Metode size() : melihat jumlah element");
        int size = name.size();
        System.out.println("Jumlah element : " + size);

        System.out.println("\n8. Metode looping : menampilkan semua element");
        System.out.println(">> for");
        for (int i = 0; i < name.size(); i++) {
            System.out.println((i + 1) + ". " + name.get(i));
        }

        System.out.println(">> foreach");
        for (String str : name) {
            System.out.println("- " + str);
        }

        ArrayList<Integer> integer = new ArrayList<Integer>();

        integer.add(3);
        integer.add(2);
        integer.add(8);
        integer.add(5);
        integer.add(9);
        System.out.println(integer);

        System.out.println("\n9. Metode short : mengurutkan");
        Collections.sort(integer);
        System.out.println("Sort : " + integer);
    }
}
