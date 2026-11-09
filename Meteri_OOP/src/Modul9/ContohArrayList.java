package Modul9;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Satria");
        nama.add("Ani");
        nama.add("Budi");
        nama.add("Elsa");

        System.out.println("List nama setelah operasi add");
        System.out.println("============================================");
        for (String string : nama) {
            System.out.println(string);
        }

        nama.add(2, "Zaenal");

        System.out.println();
        System.out.println("List nama setelah disisipkan nama Zaenal");
        System.out.println("============================================");
        for (String string : nama) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("Hasil operasi get untuk nama diposisi ke 4");
        System.out.println("============================================");
        System.out.println(nama.get(3));


        nama.remove(0);

        System.out.println();
        System.out.println("Hasil list nama setelah nama pertama dihapus");
        System.out.println("============================================");
        for (String string : nama) {
            System.out.println(string);
        }

        System.out.println("Ukuran array list nama: " + nama.size());
    }
     
}