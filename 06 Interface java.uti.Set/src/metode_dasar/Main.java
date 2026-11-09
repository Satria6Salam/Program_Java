package metode_dasar;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Membuat Set untuk menyimpan nama mahasiswa unik
        Set<String> studentsNames = new HashSet<>();

        // Menambah nama  mahasiswa ke dalam set
        System.out.println("====================================");
        System.out.println("1. Metode add():");
        studentsNames.add("Satria");
        studentsNames.add("Andi");
        studentsNames.add("Carli");
        studentsNames.add("Wawan");
        studentsNames.add("Satria"); // Duplikat, tidak akan ditambahkan

        System.out.println("Daftar Mahasiwa: " + studentsNames);

        // Mengecek apakah seorang mahasiswa sudah terdaftar
        System.out.println("====================================");
        System.out.println("2. Metode contains():");
        String searchName = "Andi";
        if (studentsNames.contains(searchName)) {
            System.out.println(searchName + "Sudah terdaftar");
        } else {
            System.out.println(searchName + "Tidak terdaftar");

        }

        // Menghapus seorang mahasiswa dari daftar
        System.out.println("====================================");
        System.out.println("3. Metode remove():");
        System.out.println("Before remove 'Wawan': " + studentsNames);
        studentsNames.remove("Wawan");
        System.out.println("After remove 'Wawan': " + studentsNames);

        // Menampilkan jumlah mahasiswa dalam kelas
        System.out.println("====================================");
        System.out.println("4. Metode size():");
        System.out.println("Jumlah Mahasiswa dalam kelas: " + studentsNames.size());

        // Mengecek apakah daftar mahasiswa kosong
        System.out.println("====================================");
        System.out.println("5. Metode isEmpty():"); 
        System.out.println("Apakah daftar mahasiswa kosong? " + studentsNames.isEmpty());

        // Menghapus semua mahasiswa dari daftar
        System.out.println("====================================");
        System.out.println("6. Metode clear():");
        studentsNames.clear();
        System.out.println("Daftar Mahasiswa setelah clear(): " + studentsNames);
    }
}
