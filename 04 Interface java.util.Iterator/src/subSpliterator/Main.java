package subSpliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        // Membuat List dengan beberapa elemen
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript", "Go");

        // 1. Membuat Spliterator dari List
        Spliterator<String> spliterator = list.spliterator();

        // 2. Menggunakan tryAdvance() untuk iterasi satu per satu
        System.out.println("Menggunakan tryAdvance():");
        spliterator.tryAdvance(System.out::println);  // Hanya mencetak satu elemen

        // 3. Membuat Spliterator baru dengan trySplit()
        Spliterator<String> split1 = list.spliterator();
        Spliterator<String> split2 = split1.trySplit();

         // Menampilkan elemen yang dibagi
         System.out.println("\nMenggunakan trySplit():");
         System.out.println("Bagian pertama:");
         split1.forEachRemaining(System.out::println);
         System.out.println("Bagian kedua:");
         if (split2 != null) {
             split2.forEachRemaining(System.out::println);
         }

         // 4. Menggunakan forEachRemaining() untuk iterasi semua elemen yang tersisa
        List<String> list2 = Arrays.asList("Kotlin", "Swift", "Rust", "TypeScript");
        Spliterator<String> spliterator2 = list2.spliterator();
        System.out.println("\nMenggunakan forEachRemaining():");
        spliterator2.forEachRemaining(System.out::println);

        // 5. Menampilkan estimateSize()
        Spliterator<String> spliterator3 = list2.spliterator();
        System.out.println("\nPerkiraan ukuran (estimateSize()): " + spliterator3.estimateSize());

         // 6. Menampilkan karakteristik Spliterator
         System.out.println("\nKarakteristik Spliterator:");
         int characteristics = spliterator3.characteristics();
         System.out.println("ORDERED: " + ((characteristics & Spliterator.ORDERED) != 0));
         System.out.println("DISTINCT: " + ((characteristics & Spliterator.DISTINCT) != 0));
         System.out.println("SORTED: " + ((characteristics & Spliterator.SORTED) != 0));
         System.out.println("SIZED: " + ((characteristics & Spliterator.SIZED) != 0));
    }
}
