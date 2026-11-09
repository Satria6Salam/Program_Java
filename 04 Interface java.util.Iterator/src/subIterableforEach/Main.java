package subIterableforEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Membuat daftar elemen (List)
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Go");

        // 1. Menggunakan forEach() dengan Lambda Expression
        System.out.println("Menggunakan forEach() dengan Lambda:");
        languages.forEach(language -> System.out.println(language));

        // 2. Menggunakan forEach() dengan Method Reference
        System.out.println("\nMenggunakan forEach() dengan Method Reference:");
        languages.forEach(System.out::println);

         // 3. Menggunakan forEach() dengan aksi tambahan
         System.out.println("\nMenggunakan forEach() dengan aksi tambahan:");
         languages.forEach(language -> {
             String message = "Saya suka bahasa " + language;
             System.out.println(message);
         });

         // 4. Menggunakan forEach() pada Set
        System.out.println("\nMenggunakan forEach() pada Set:");
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.forEach(num -> System.out.println("Angka: " + num));

        // 5. Menggunakan forEach() pada Map (key dan value)
        System.out.println("\nMenggunakan forEach() pada Map:");
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 78);
        
        scores.forEach((name, score) -> System.out.println(name + " mendapatkan nilai " + score));

        // 6. Menggunakan forEach() dengan kondisi
        System.out.println("\nMenggunakan forEach() dengan kondisi:");
        languages.forEach(language -> {
            if (language.startsWith("J")) {
                System.out.println(language + " diawali dengan huruf 'J'");
            }
        });
    }
}
