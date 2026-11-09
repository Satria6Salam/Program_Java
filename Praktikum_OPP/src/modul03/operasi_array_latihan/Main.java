package modul03.operasi_array_latihan;

public class Main {
    public static void main(String[] args) {
        OperasiArray obj = new OperasiArray();
        double[] element = {-5,-3,-6,-3,-4};
        
        obj.display("Element dalam array:");
        obj.display(element);
        obj.display("\n=========================");
        obj.display("Rata-rata: ");
        obj.rataRata(element);
        obj.display(obj.getRataRata());
        obj.display("=========================");
        obj.display("Nilai maksimum: ");
        obj.nilaiMax(element);
        obj.display(obj.getNilaiMax());
        obj.display("=========================");
        obj.display("Nilai minimum: ");
        obj.nilaiMin(element);
        obj.display(obj.getNilaiMin());
        obj.display("=========================");
        obj.display("Letak indek -3: ");
        obj.letakIndek(element, -3);
        
    }
}
