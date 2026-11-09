package modul03.operasi_array_latihan2;

public class Main {
    public static void main(String[] args) {
        OperasiArray2 obj = new OperasiArray2();
        int[] element = {2,5,3,5,9,5};

        obj.display("Element dalam array:");
        obj.display(element);
        obj.display("\n===============================");
        obj.display("Angka 5 diubah menjadi 1:");
        obj.ubahData(element, 5, 1);
        obj.display(obj.getNewData());
        obj.display("\n===============================");
        obj.display("Hasil element yang di ubah dikali 0.5:");
        obj.hasilPerkalian(obj.getNewData(), 0.5);
        obj.display(obj.getHasilPerkalian());
    }
}
