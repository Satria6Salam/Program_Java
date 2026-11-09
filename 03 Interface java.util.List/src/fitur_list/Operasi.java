package fitur_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Operasi {
    public static void main(String[] args) {
        // Intansiasi Objek 
        List<String> list = new ArrayList<>();

        System.out.println("=============================================");
        System.out.println("1. Metode add()");
        list.add("Java");
        list.add("javascript");
        list.add("PhP");
        list.add("HTML");
        System.out.println(list);

        System.out.println("=============================================");
        System.out.println("2. Metode remove()");
        list.remove(0);
        System.out.println(list);

        System.out.println("=============================================");
        System.out.println("3. Metode get()");
        String indekPertama = list.get(0);
        System.out.println("Elemen pertama: " + indekPertama);

        System.out.println("=============================================");
        String indek = list.getLast();
        System.out.println("Elemen terakhir: " + indek);

        System.out.println("=============================================");
        System.out.println("4. Metode Iterasi:");
        for (String elemen : list) {
            System.out.println(elemen);
        }

        System.out.println("=============================================");
        System.out.println("5. Metode converting Array to List:");
        String[] array = {
            "java",
            "PHP",
            "C++",
            "Python"
        };
        System.out.println("Print array: " + Arrays.toString(array));

        System.out.println("=============================================");
        List<String> listArray = new ArrayList<>();
        for (String arr : array) {
            listArray.add(arr);
        }
        System.out.println("Print List: " + listArray);

        System.out.println("=============================================");
        System.out.println("6. Metode List.toArray():");
        String[] array2 = listArray.toArray(new String[listArray.size()]);
        System.out.println("Print array: " + Arrays.toString(array2));
        System.out.println("Print list: " + listArray);

        System.out.println("=============================================");
        System.out.println("7. Metode empty()");
        System.out.println("Lits: " + list.isEmpty());

        System.out.println("=============================================");
        System.out.println("8. Metode iterato()");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=============================================");
        System.out.println("9. Metode lastIndexOf()");
        List<String> list2 = new ArrayList<>(List.of("A", "B", "C", "A", "D"));
        System.out.println(list2);
        System.out.println("Indeks terakhir dari 'A': " + list2.lastIndexOf("A"));

        System.out.println("=============================================");
        System.out.println("10. Metode ListIterator()");
        ListIterator<String> listIterator2 = list.listIterator();
        while (listIterator2.hasNext()) {
            System.out.println(listIterator2.next());
        }

        System.out.println("=============================================");
        System.out.println("11. Metode ListIterator(indek)");
        ListIterator<String> listIterator3 = list2.listIterator(2);
        while (listIterator3.hasNext()) {
            System.out.println(listIterator3.next());
        }

        System.out.println("=============================================");
        System.out.println("12. Metode remove()");
        list2.remove(0);
        System.out.println(list2);

        System.out.println("=============================================");
        System.out.println("22. Metode remove(object)");
        list2.remove("B");
        System.out.println(list2);

        System.out.println("=============================================");
        System.out.println("23. Metode removeAll()");
        // list2.removeAll(List.of("D"));
        // System.out.println(list2);
        list2.removeAll(list2);
        System.out.println(list2);

        System.out.println("=============================================");
        System.out.println("24. Metode replaceAll()");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);

        System.out.println("====================================y=========");
        System.out.println("25. Metode retainAll()");
        List<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println(list3);
        list3.retainAll(List.of("A", "C"));
        // list3.retainAll(List.of("A"));
        System.out.println(list3);

        System.out.println("=============================================");
        System.out.println("26. Metode set()");
        list3.set(1, "H");
        System.out.println(list3);

        System.out.println("=============================================");
        System.out.println("27. Metode size()");
        System.out.println("Size: " + list3.size());

        System.out.println("=============================================");
        System.out.println("28. Metode sort()");
        list.sort(String::compareTo);
        System.out.println(list);

        System.out.println("=============================================");
        System.out.println("29. Metose spliterator()");
        Spliterator<String> spliterator = list3.spliterator();
        spliterator.forEachRemaining(System.out::println);

        System.out.println("=============================================");
        System.out.println("30. Metode subList()");
        List<String> list4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> subList = list4.subList(1, 3);
        System.out.println(subList);

        System.out.println("=============================================");
        System.out.println("31. Metode toArray()");
        String[] array3 = list4.toArray(new String[list4.size()]);
        for (String string : array3) {
            System.out.println(string);
        }
    }
}
