package interface_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Menggunakan HashSet (tidak menjamin urutan elemen)
        System.out.println("=========================================");
        System.out.println("1. Metode HashSet:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java");  // Tidak akan ditambahkan karena duplikat

        System.out.println("HashSet: " + hashSet);

        // Menggunakan LinkedHashSet (menjaga urutan elemen)
        System.out.println("=========================================");
        System.out.println("2. Metode LingkedHashSet:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Menggunakan TreeSet (mengurutkan elemen secara alami)
        System.out.println("=========================================");
        System.out.println("3. Metode TreeSet:");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        
        System.out.println("TreeSet: " + treeSet);
    }
}
