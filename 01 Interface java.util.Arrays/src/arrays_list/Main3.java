package arrays_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("18. Metode forEach(Consumer<? super E> action)");
        fruits.forEach(fruit -> System.out.println(fruit));

        System.out.println("\n19. Metode indexOf(Object o) : Menemukan indeks");
        int index = fruits.indexOf("Banana");
        System.out.println("Indeks Banana : " + index);

        System.out.println("\n20. Metode isEmpty() : priksa dastar kosong");
        if (fruits.isEmpty()) {
            System.out.println("Daftar kosong");
        } else {
            System.out.println("Daftar tidak kosong");
        }
        System.out.println("\n21. Metode iterator() : mengiterasi elemen dalam daftar");
        // Metode hasNext() : untuk memeriksa apakah masih ada elemen yang tersisa untuk diiterasi. siswa = true, tidak = false
        // metode next() : mengembalikan elemen berikutnya dalam iterasi.
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        System.out.println();
        Iterator<String> iterator2 = fruits.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("\n22. Metode listIterator() : mengiterasi elemen dalam daftar");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("\n23. Metode listIterator(index) : mengiterasi elemen dari indek");
        ListIterator<String> listIterator2 = fruits.listIterator(1);
        while (listIterator2.hasNext()) {
            String fruit = listIterator2.next();
            System.out.println(fruit);
        }

        System.out.println("\n24. Metode lastIndexOf(Object o) : menemukan indeks kemunculan terakhir");
        fruits.add("Banana");
        int lastIndex = fruits.lastIndexOf("Banana");
        System.out.println("Index terakhir Banana " + lastIndex);
        System.out.println("Size : " + fruits.size());

        System.out.println("\n25. Metode remove(Object o) : menghapus kemuculan pertama");
        boolean isRemoved = fruits.remove("Apple");
        System.out.println("Apakah dihapus : " + isRemoved);
        System.out.println("Setelah penghapusa : " + fruits);

    }
}
