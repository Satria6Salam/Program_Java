package Modul9;

import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<>();

        nama.addFirst("Elsa");
        nama.addFirst("Zaenal");
        nama.addLast("Herti");
        nama.addLast("Vano");

        System.out.println();
        System.out.println("List nama setelah addFist dan addLast");
        System.out.println("============================================");
        for (String string : nama) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("Nama pertama: " + nama.getFirst());
        System.out.println("Nama kedua: " + nama.getLast());

        nama.removeFirst();
        nama.removeLast();

        System.out.println();
        System.out.println("List nama setelah remove");
        System.out.println("============================================");
        for (String string : nama) {
            System.out.println(string);
        }
    }
    
}