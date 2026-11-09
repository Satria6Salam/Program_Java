package huruf_spasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();

            if (nama.matches("[a-zA-Z ]+")) {
                System.out.println("Nama valid!");
                break;
            } else {
                System.out.println("Nama hanya boleh berisi huruf dan spasi.");
            }
        }

        input.close();
    }
}
