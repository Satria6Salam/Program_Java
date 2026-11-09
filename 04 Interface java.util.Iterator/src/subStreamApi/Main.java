package subStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Membuat daftar angka
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15, 18, 21);

        // 1. Menggunakan filter() untuk memfilter angka genap
        System.out.println("Menggunakan filter():");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // 2. Menggunakan map() untuk mengubah angka menjadi kuadratnya
        System.out.println("\nMenggunakan map():");
        numbers.stream().map(n -> n * n).forEach(System.out::println);

        // 3. Menggunakan sorted() untuk mengurutkan angka secara ascending
        System.out.println("\nMenggunakan sorted():");
        numbers.stream().sorted().forEach(System.out::println);

        // 4. Menggunakan limit() untuk mengambil 3 elemen pertama
        System.out.println("\nMenggunakan limit():");
        numbers.stream().limit(3).forEach(System.out::println);

        // 5. Menggunakan skip() untuk melewati 3 elemen pertama
        System.out.println("\nMenggunakan skip():");
        numbers.stream().skip(3).forEach(System.out::println);

        // 6. Menggunakan distinct() untuk menghilangkan duplikat
        System.out.println("\nMenggunakan distinct():");
        List<Integer> duplicateNumbers = Arrays.asList(3, 6, 9, 3, 6, 12, 15);
        duplicateNumbers.stream().distinct().forEach(System.out::println);

        // 7. Menggunakan count() untuk menghitung jumlah elemen
        System.out.println("\nMenggunakan count():");
        long count = numbers.stream().count();
        System.out.println("Jumlah elemen: " + count);

        // 8. Menggunakan reduce() untuk menjumlahkan semua angka
        System.out.println("\nMenggunakan reduce():");
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Total penjumlahan: " + sum);

        // 9. Menggunakan collect() untuk mengubah hasil stream menjadi List
        System.out.println("\nMenggunakan collect():");
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squaredNumbers);

        // 10. Menggunakan anyMatch() untuk mengecek apakah ada angka lebih dari 10
        System.out.println("\nMenggunakan anyMatch():");
        boolean anyGreaterThan10 = numbers.stream().anyMatch(n -> n > 10);
        System.out.println("Apakah ada angka lebih dari 10? " + anyGreaterThan10);

        // 11. Menggunakan allMatch() untuk mengecek apakah semua angka lebih dari 0
        System.out.println("\nMenggunakan allMatch():");
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println("Apakah semua angka lebih dari 0? " + allPositive);

        // 12. Menggunakan noneMatch() untuk mengecek apakah tidak ada angka negatif
        System.out.println("\nMenggunakan noneMatch():");
        boolean noNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Apakah tidak ada angka negatif? " + noNegative);

        // 13. Menggunakan findFirst() untuk mengambil elemen pertama
        System.out.println("\nMenggunakan findFirst():");
        Optional<Integer> firstElement = numbers.stream().findFirst();
        firstElement.ifPresent(System.out::println);

        // 14. Menggunakan findAny() untuk mengambil elemen acak
        System.out.println("\nMenggunakan findAny():");
        Optional<Integer> anyElement = numbers.stream().findAny();
        anyElement.ifPresent(System.out::println);
    }
}
