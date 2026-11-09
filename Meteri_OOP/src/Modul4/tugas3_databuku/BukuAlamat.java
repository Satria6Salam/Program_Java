package Modul4.tugas3_databuku;

import java.util.Scanner;

public class BukuAlamat {
    // Atribut class modifier private
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;
    Scanner input;

    // Konstruktor modifier public
    public BukuAlamat() {
        this.nama = "Nama masih kosong....";
        this.alamat = "Alamat masih kosong....";
        this.nomorTelepon = "Nomor telepon masih kosong....";
        this.email = "E-mail masih kosong....";
        this.input = new Scanner(System.in);
    }

    // Method getter mengembalikan / mengambil data, modifier public
    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getNomorTelepon() {
        return this.nomorTelepon;
    }

    public String getEmail() {
        return this.email;
    }

    public String getInput(String message) {
        System.out.print(message);
        return input.nextLine();
    }

    // Method setter mengisi atau mengedit data, modifier public
    public void addNama(String nama) {
        String inpNama = nama;
        boolean cek = false;
        while (cek == false) {
            if (inpNama.matches("[a-zA-Z .]{6,20}")) {
                System.out.println("Nama Valid...");
                this.nama = inpNama;
                cek = true;
            } else {
                System.out.println("Nama Tidak Valid!\nNama hanya berupa huruf, spasi dan titik \nMin 6, Mak 20 karakter");
                inpNama = getInput("Masukkan ulang nama: ");
            }
        }
    }

    public void addAlamat(String alamat) {
        String inpAlamat = alamat;
        boolean cek = false;
        while (cek == false) {
            if (inpAlamat.matches("[a-zA-Z0-9 ,.-]{10,}")) {
                System.out.println("Alamat Valid...");
                this.alamat = inpAlamat;
                cek = true;
            } else {
                System.out.println("Alamat Tidak Valid!");
                System.out.println("Alamat harus berupa huruf, angka, spasi dan tanda . , - \nMin 10 karakter)");
                inpAlamat = getInput("Masukkan ulang alamat: ");
            }
        }
    }

    public void addNomorTelepon(String nomorTelepon) {
        String inpNomor = nomorTelepon;
        boolean cek = false;
        while (cek == false) {
            if (inpNomor.matches("\\+68[0-9]{8,12}")) {
                System.out.println("Nomor Telepon Valid");
                this.nomorTelepon = inpNomor;
                cek = true;
            } else {
                System.out.println("Nomor Telepon Tidak Valid!\nHarus diawali dengan (+68)\nMin 8 - 12 angka");
                inpNomor = getInput("Masukkan ulang No Hp: ");
            }
        }
    }

    public void addEmail(String email) {
        String inputEmailString = email;
        boolean cek = false;
        while (cek == false) {
            if (inputEmailString.matches("^[a-zA-Z][a-zA-Z0-9 #&*+.-].{8,20}\\@gmail.com$")) {
                System.out.println("Nama E-mail Valid");
                this.email = inputEmailString;
                cek = true;
            } else {
                System.out.println("Nama E-mail Tidak Valid!");
                System.out.println("Harus diawali dengan huruf, karakter (0-9#&*+.-)");
                System.out.println("Min 8 karakter, Mak 20 karakter");
                System.out.println("kemuidan '@gmail.com");
                inputEmailString = getInput("Masukkan ulang e-mail:");
            }
        }
    }

    // Method display menampilkan data
    public void display(String data, String message) {
        System.out.println(message + "\t\t: " + data);
    }

    public void display(String data) {
        System.out.println(data);
    }
}
