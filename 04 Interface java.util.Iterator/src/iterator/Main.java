package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aku", "kamu", "saya"));

        System.out.println("====================================");
        System.out.println("1. Metode hasNext()");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("====================================");
        System.out.println("2. Metode next()");
        // String elemen = iterator.next();
        // System.out.println(elemen);

        System.out.println("====================================");
        System.out.println("3. Metode remove()");
        Iterator<String> iterator2 = list.iterator();
        System.out.println("Before");
        while (iterator2.hasNext()) {
            String elem = iterator2.next();
            System.out.print(elem + " ");
            if (elem.equals("aku")) {
                iterator2.remove();
            }
        }
        System.out.println("\nAfter");
        System.out.println(list);
        

    }
}
