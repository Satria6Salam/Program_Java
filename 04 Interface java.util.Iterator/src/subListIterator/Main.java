package subListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Membuat List dengan beberapa elemen
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        // Mendapatkan ListIterator
        ListIterator<String> listIterator = list.listIterator();

        // 1. Iterasi maju menggunakan next() dan hasNext()
        System.out.println("Iterasi maju:");
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println("Elemen: " + element);
        }
        
        // 2. Iterasi mundur menggunakan previous() dan hasPrevious()
        System.out.println("\nIterasi mundur:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println("Elemen: " + element);
        }
        
        // 3. Menambahkan elemen menggunakan add()
        System.out.println("\nMenambahkan elemen 'X' setelah 'B':");
        listIterator = list.listIterator(); // Reset iterator ke awal
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("B")) {
                listIterator.add("X");
            }
        }
        System.out.println("List setelah penambahan: " + list);

        // 4. Mengubah elemen menggunakan set()
        System.out.println("\nMengubah elemen 'C' menjadi 'Z':");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("C")) {
                listIterator.set("Z");
            }
        }
        System.out.println("List setelah perubahan: " + list);

        // 5. Menghapus elemen menggunakan remove()
        System.out.println("\nMenghapus elemen 'D':");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("D")) {
                listIterator.remove();
            }
        }
        System.out.println("List setelah penghapusan: " + list);

        // 6. Menampilkan indeks elemen saat ini menggunakan nextIndex() dan previousIndex()
        System.out.println("\nMenampilkan indeks elemen:");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String element = listIterator.next();
            System.out.println("Indeks: " + index + ", Elemen: " + element);
        }  
    }
}
