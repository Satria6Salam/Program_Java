package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("1. Metode asList(T..a): ubah array menjadi daftar list");
        String[] array = {"A", "B", "C"};
        List<String> list = Arrays.asList(array);
        System.out.println("List: " + list);

        System.out.println("================================================================");
        System.out.println("2. Metode binarySearch(byte[] a, byte key): pencarian biner");
        byte[] array1 = {1,2,3,4, 5, 6, 7};
        int index = Arrays.binarySearch(array1, (byte) 3);
        System.out.println("Index '3': " + index);

        System.out.println("================================================================");
        System.out.println("3. Metode binarySearch(byte[] a, int fromIndex, int toIndex, byte key)");
        int index1 = Arrays.binarySearch(array1, 3, 5, (byte) 3);
        System.out.println("Index '3': " + index1);

        System.out.println("================================================================");
        System.out.println("4. Metode binarySearch(char[] a, char key)");
        char[] array2 = {'a', 'b', 'c', 'd'};
        int index2 = Arrays.binarySearch(array2, 'c');
        System.out.println("Index 'c': " + index2);

        System.out.println("================================================================");
        System.out.println("5. Metode binarySearch(Object[] a, Object key)");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        int index3 = Arrays.binarySearch(fruits, "Banana");
        System.out.println("Indek Banana: " + index3);

        System.out.println("================================================================");
        System.out.println("6. Metode binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c)");
        Arrays.sort(fruits, Comparator.naturalOrder());

        // // Comparator untuk membandingkan string berdasarkan panjangnya
        // Comparator<String> comparator = Comparator.comparingInt(String::length);
        // // Mencari "banana" dalam rentang dari indeks 0 hingga 3

        int index4 = Arrays.binarySearch(fruits, 0, fruits.length, "Date", Comparator.naturalOrder());
        System.out.println("Index of 'Date': " + index4);

        // System.out.println("6. Metode binarySearch(T[] a, T key, Comparator<? super T> c)");
        // int index5 = Arrays.binarySearch(fruits, 0, fruits.length, "Cherry", comparator);
        // System.out.println("Index of 'cherry': " + index5); // Output: Index of 'cherry': 2

        System.out.println("================================================================");
        System.out.println("7. Metode copyOf(boolean[] original, int newLength)");
        boolean[] original = {true, false, true};
        // Menyalin array dengan panjang baru 5
        boolean[] copiedArray = Arrays.copyOf(original, 5);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        System.out.println("================================================================");
        System.out.println("8 Metode copyOf(U[] original, int newLength, Class<? extends T[]> newType)");
        String[] names = { "Alice", "Bob", "Charlie" };

        // Menyalin array dengan panjang baru (lebih panjang)
        String[] newNames = Arrays.copyOf(names, 5, String[].class);
        System.out.println(Arrays.toString(newNames));

        System.out.println("================================================================");
        System.out.println("9. Metode copyOfRange(byte[] original, int from, int to)");
        byte[] numbers = { 10, 20, 30, 40, 50 };

        // Menyalin elemen dari indeks 1 sampai 4 (20, 30, 40)
        byte[] subArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println(Arrays.toString(subArray));

        System.out.println("================================================================");
        System.out.println("10. Metode copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType)");
        Integer[] numbers1 = { 1, 2, 3, 4, 5, 6 };
        // Menyalin elemen dari indeks 2 sampai 5, ke array baru bertipe Integer[]
        Integer[] subNumbers = Arrays.copyOfRange(numbers1, 0, numbers1.length,Integer[].class);
        System.out.println(Arrays.toString(subNumbers));

        System.out.println("================================================================");
        System.out.println("11. Metode deepEquals(Object[] a1, Object[] a2)");
        Integer[][] array11 = { {1, 2}, {3, 4} };
        Integer[][] array22 = { {1, 2}, {3, 4} };
        
        System.out.println(Arrays.deepEquals(array11, array22)); // Output: true

        System.out.println("================================================================");
        System.out.println("12. Metode deepHashCode(Object[] a)");
        System.out.println(Arrays.deepHashCode(array11));

        System.out.println("================================================================");
        System.out.println("13. Metode deepToString(Object[] a)");
        System.out.println(Arrays.deepToString(array11));

        System.out.println("================================================================");
        System.out.println("14. Metode fill(boolean[] a, int fromIndex, int toIndex, boolean val)");
        boolean[] arr = new boolean[5];

        Arrays.fill(arr, 1, 4, true);

        System.out.println(Arrays.toString(arr)); // Output: [false, true, true, true, false]

        System.out.println("================================================================");
        System.out.println("15. Metode parallelPrefix(double[] array, int fromIndex, int toIndex, DoubleBinaryOperator op)");
        // Array angka desimal
        double[] arrayDouble = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Menggunakan parallelPrefix untuk menghitung jumlah kumulatif
        Arrays.parallelPrefix(arrayDouble, 1, 4, Double::sum);
        // Menampilkan hasil
        System.out.println(Arrays.toString(arrayDouble));

        System.out.println("================================================================");
        System.out.println("16. Metode parallelPrefix(T[] array, BinaryOperator<T> op)");
        // Array berisi String
        String[] words = {"Java", "is", "awesome"};

        // Menggunakan parallelPrefix untuk menggabungkan string
        Arrays.parallelPrefix(words, (s1, s2) -> s1 + " " + s2);

        // Menampilkan hasil
        System.out.println(Arrays.toString(words));

        System.out.println("================================================================");
        System.out.println("17. Metode parallelSetAll(double[] array, IntToDoubleFunction generator)");
        double[] numbers3 = new double[5];

        // Mengisi array dengan nilai i^2 secara paralel > Menggunakan fungsi lambda untuk mengisi setiap elemen dengan nilai pangkat dua dari indeksnya.
        Arrays.parallelSetAll(numbers3, i -> i * i * 1.0);

        // Menampilkan hasil
        System.out.println(Arrays.toString(numbers3));

        System.out.println("================================================================");
        System.out.println("18. Metode parallelSetAll(int[] array, IntUnaryOperator generator)");
        int[] numbers4 = new int[5];

        // Mengisi array dengan angka genap mulai dari 0 > Setiap elemen diisi dengan nilai 2 × indeks.
        Arrays.parallelSetAll(numbers4, i -> i * 2);

        // Menampilkan hasil
        System.out.println(Arrays.toString(numbers4));

        System.out.println("================================================================");
        System.out.println("19. Metode parallelSetAll(T[] array, IntFunction<? extends T> generator)");
        String[] words2 = new String[5];

        // Mengisi array dengan kata "Item-" + indeksnya
        Arrays.parallelSetAll(words2, i -> "Item-" + i);

        // Menampilkan hasil
        System.out.println(Arrays.toString(words2));

        System.out.println("================================================================");
        System.out.println("20. Metode parallelSort(byte[] a, int fromIndex, int toIndex)");
        byte[] numbers5 = {5, 3, 9, 1, 6, 8};
        // Mengurutkan hanya elemen dari indeks 1 hingga 4
        Arrays.parallelSort(numbers5, 1, 5);

        // Menampilkan hasil
        System.out.println(Arrays.toString(numbers5));

        System.out.println("21. Metode parallelSort(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp)");
        String[] names2 = {"Zara", "Adam", "Liam", "Olivia", "Charlie", "Bob"};

        // Mengurutkan hanya dari indeks 1 hingga 4
        Arrays.parallelSort(names2, 1, 5, Comparator.naturalOrder());

        System.out.println(Arrays.toString(names2));

        System.out.println("22. Metode setAll(double[] array, IntToDoubleFunction generator)");
        double[] numbers6 = new double[5];

        // Mengisi array dengan nilai pangkat dua dari indeksnya
        Arrays.setAll(numbers6, i -> i * i * 1.0);

        System.out.println(Arrays.toString(numbers6));

        System.out.println("23. Metode setAll(int[] array, IntUnaryOperator generator)");
        int[] number7 = new int[5];

        // Mengisi array dengan angka genap
        Arrays.setAll(number7, i -> i * 2);

        System.out.println(Arrays.toString(number7));

        System.out.println("24. Metode setAll(T[] array, IntFunction<? extends T> generator)");
        String[] names3 = new String[5];

        // Mengisi array dengan "Nama-" + indeks
        Arrays.setAll(names3, i -> "Nama-" + i);

        System.out.println(Arrays.toString(names3));

        System.out.println("25. Metode sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)");
        String[] names4 = {"Zara", "Adam", "Liam", "Olivia", "Charlie", "Bob"};

        // Mengurutkan hanya elemen dari indeks 1 hingga 4 (dengan Comparator reverse)
        Arrays.sort(names4, 1, 5, Comparator.reverseOrder());

        System.out.println(Arrays.toString(names4));

    }
}
