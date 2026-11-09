package Modul9;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ContohPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> nama = new PriorityQueue<>();

        nama.offer("Dodi");
        nama.offer("Silvi");
        nama.offer("Keke");
        nama.offer("Queen");

        // System.out.println("============================================");
        // System.out.println("Elemen pertama: " + nama.peek());

        System.out.println();
        System.out.println("List nama setelah operasi peek");
        System.out.println("============================================");
        Iterator iterator = nama.iterator();
        while (iterator.hasNext()) {
            Object elemen = iterator.next();
            System.out.println(elemen);
        }
        // for (String string : nama) {
        //     System.out.println(string);
        // }

        System.out.println(nama.poll());

        System.out.println();
        System.out.println("Nilai nama setelah operasi poll");
        System.out.println("============================================");
        for (String string : nama) {
            System.out.println(string);
        }
    }
}
