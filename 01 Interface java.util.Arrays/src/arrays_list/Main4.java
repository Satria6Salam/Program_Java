package arrays_list;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.UnaryOperator; // import UnaryOperator
import java.util.Comparator;
import java.util.Spliterator;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("26. Metode removeIf() : menghapus sesuai kondisi");
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Setelah penghapusan : " + numbers);

        System.out.println("\n27. Metode removeRange() : penghapusan dalan rentang indeks");
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(13);
        numbers.subList(0,3).clear();
        System.out.println("Setelah penghapusan rentang : " + numbers);

        System.out.println("\n28. Metode replaceAll() : mengganti setiap elemen");
        // Mengganti setiap elemen dengan kuadratnya
        UnaryOperator<Integer> square = n -> n * n;
        numbers.replaceAll(square);
        System.out.println("Setelah menganti dengan kuadrat : " + numbers);

        System.out.println("\n29. Metode retainAll() : menyimpan element hanya yg ada dalam daftar");
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> toRetain = new ArrayList<>(Arrays.asList("B", "C", "E"));
        list.retainAll(toRetain);
        System.out.println("Setelah mempertahankan elemen : " + list);

        System.out.println("\n30. Metode sort(Comparator) : mengurutkan dengan comparator");
        List<String> list2 = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        list2.sort(Comparator.comparing(String::length));
        System.out.println("Setelah diurutkan berdasarkan panjang : " + list2);

        System.out.println("\n31. Metode spliterator() : alat membagi dan mengiterasi");
        list.add("F");
        list.add("G");
        list.add("H");
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);

        System.out.println("\n32. Metode subList() : menampilkan dari indek from, to");
        // Mengambil sublist dari indeks 1 hingga 4
        List<String> subList = list.subList(1,3);
        System.out.println("Sublist : " + subList);

        System.out.println("\n33. Metode toArray() : mengembalikan array berisi semua elemen");
        String[] array = list.toArray(new String[0]);
        System.out.println("Array : " + String.join(", ", array));

        System.out.println("\n34. Metode toArray(T[] a) : mengembalikan arra dengan type yg ditentukan");
        // Mengonversi daftar ke array dengan tipe Integer
        Integer[] array2 = numbers.toArray(new Integer[0]);
        System.out.println("Array : ");
        for (Integer integer : array2) {
            System.out.println(integer);
        }
        
    }
}
