package metode_collection;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Daftar peserta workshop utama
        Set<String> participants = new HashSet<>();
        participants.add("Alice");
        participants.add("Bob");
        participants.add("Charlie");
        participants.add("David");

        // Daftar peserta tambahan yang ingin didaftarkan sekaligus
        Set<String> newParticipants = new HashSet<>();
        newParticipants.add("Eve");
        newParticipants.add("Frank");
        newParticipants.add("Alice"); // Duplikat, tidak akan ditambahkan

        // **1. Menambahkan daftar peserta baru**
        participants.addAll(newParticipants);
        System.out.println("Daftar peserta setelah addAll(): " + participants);

        // Daftar VIP yang harus dipastikan sudah terdaftar
        Set<String> vipParticipants = new HashSet<>();
        vipParticipants.add("Alice");
        vipParticipants.add("Frank");

         // **2. Mengecek apakah semua VIP sudah terdaftar**
         boolean allVIPRegistered = participants.containsAll(vipParticipants);
         System.out.println("Apakah semua peserta VIP sudah terdaftar? " + allVIPRegistered);

         // Daftar blacklist yang harus dihapus
        Set<String> blacklist = new HashSet<>();
        blacklist.add("Charlie");
        blacklist.add("David");

        // **3. Menghapus peserta yang ada di blacklist**
        participants.removeAll(blacklist);
        System.out.println("Daftar peserta setelah removeAll() (menghapus blacklist): " + participants);

        // Daftar peserta final yang harus dipertahankan
        Set<String> finalList = new HashSet<>();
        finalList.add("Alice");
        finalList.add("Eve");

        // **4. Menyaring peserta agar hanya yang ada di finalList yang tetap terdaftar**
        participants.retainAll(finalList);
        System.out.println("Daftar peserta setelah retainAll() (hanya mempertahankan final list): " + participants);

        // **5. Membandingkan dua daftar peserta**
        Set<String> anotherList = new HashSet<>();
        anotherList.add("Alice");
        anotherList.add("Eve");

        boolean isEqual = participants.equals(anotherList);
        System.out.println("Apakah daftar peserta sama dengan anotherList? " + isEqual);
    }
}
