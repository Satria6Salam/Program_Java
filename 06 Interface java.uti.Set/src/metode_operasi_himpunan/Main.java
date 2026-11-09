package metode_operasi_himpunan;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Data pengguna yang menonton film kategori "Action"
        Set<String> actionViewers = new HashSet<>();
        actionViewers.add("Alice");
        actionViewers.add("Bob");
        actionViewers.add("Charlie");
        actionViewers.add("David");

        // Data pengguna yang menonton film kategori "Drama"
        Set<String> dramaViewers = new HashSet<>();
        dramaViewers.add("Charlie");
        dramaViewers.add("David");
        dramaViewers.add("Eve");
        dramaViewers.add("Frank");

        // Menampilkan data awal
        System.out.println("Pengguna yang menonton Action: " + actionViewers);
        System.out.println("Pengguna yang menonton Drama: " + dramaViewers);

        // **1. Intersection (Pengguna yang menonton kedua kategori)**
        Set<String> bothCategories = new HashSet<>(actionViewers);
        bothCategories.retainAll(dramaViewers); // Menyisakan hanya elemen yang ada di kedua Set
        System.out.println("\nPengguna yang menonton kedua kategori: " + bothCategories);

        // **2. Union (Semua pengguna unik yang menonton salah satu kategori)**
        Set<String> allViewers = new HashSet<>(actionViewers);
        allViewers.addAll(dramaViewers); // Menggabungkan semua elemen unik dari kedua Set
        System.out.println("Semua pengguna unik yang menonton: " + allViewers);

        // **3. Difference (Pengguna yang hanya menonton Action, tapi tidak Drama)**
        Set<String> onlyAction = new HashSet<>(actionViewers);
        onlyAction.removeAll(dramaViewers); // Menghapus elemen yang ada di dramaViewers
        System.out.println("Pengguna yang hanya menonton Action: " + onlyAction);
    }
}
