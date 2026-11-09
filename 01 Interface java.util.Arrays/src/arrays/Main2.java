package arrays;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("1. Metode iterasi dengan spliterator");
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Membuat Spliterator untuk seluruh array
        Spliterator<String> spliterator = Arrays.spliterator(names);

        // Iterasi menggunakan tryAdvance()
        spliterator.tryAdvance(System.out::println); // Output: Alice
        spliterator.tryAdvance(System.out::println); // Output: Bob

        System.out.println("Sisa elemen yang belum diiterasi: " + spliterator.estimateSize()); // Output: 2
        // Menggunakan forEachRemaining() untuk iterasi semua elemen yang tersisa
        spliterator.forEachRemaining(System.out::println); // Output: Charlie, David

        System.out.println("==================================================");
        System.out.println("2. Metode Pemrosesan Paralel dengan Stream");
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Membuat Spliterator untuk sebagian array (indeks 1 sampai 4)
        Spliterator.OfInt spliterator2 = Arrays.spliterator(numbers, 1, 5);

        // Menggunakan Spliterator dalam Stream
        Stream<Integer> stream = StreamSupport.stream(spliterator2, true);

        // Pemrosesan paralel
        stream.forEach(System.out::println);

        System.out.println("==================================================");
        System.out.println("3. Metode stream(int[] array)");
        int[] numbers2 = {1, 2, 3, 4, 5};

        // Membuat stream dari seluruh array
        IntStream stream2 = Arrays.stream(numbers2);

        // Menggunakan operasi stream: sum()
        int sum = stream2.sum();

        System.out.println("Total: " + sum); // Output: 15

        System.out.println("==================================================");
        System.out.println("4. Metode stream(int[] array, int startInclusive, int endExclusive)");
        int[] numbers3 = {10, 20, 30, 40, 50};

        // Stream dari indeks 1 sampai 3 (20, 30)
        IntStream stream3 = Arrays.stream(numbers3, 1, 3);

        // Menggunakan operasi stream: average()
        double avg = stream3.average().orElse(0);

        System.out.println("Rata-rata: " + avg); // Output: 25.0

        System.out.println("==================================================");
        System.out.println("5. Metode stream(T[] array)");
        String[] names2 = {"Alice", "Bob", "Charlie", "David"};

        // Membuat Stream dari array
        Stream<String> stream4 = Arrays.stream(names2);

        // Menampilkan elemen yang memiliki panjang lebih dari 3
        stream4.filter(name -> name.length() > 3).forEach(System.out::println);

        System.out.println("==================================================");
        System.out.println("6. Metode stream(double[] array, int startInclusive, int endExclusive)");
        double[] values = {2.5, 3.7, 1.8, 4.2, 5.0};

        // Stream dari indeks 1 sampai 4
        DoubleStream stream5 = Arrays.stream(values, 1, 4);

        // Menggunakan operasi stream: max()
        double max = stream5.max().orElse(0);

        System.out.println("Nilai maksimum: " + max);
    }
}
