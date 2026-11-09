package Modul9;

public class ContohTipeGeneric<E> {
    private E dataSatu, dataDua, temp;

    public E getDataSatu() {return dataSatu;}
    public E getDataDua() {return dataDua;}

    public void setDataSatu(E dataSatu) {
        this.dataSatu = dataSatu;
    }

    public void setDataDua(E dataDua) {
        this.dataDua =dataDua;
    }

    public void tukarNilai() {
        temp = dataSatu;
        dataSatu = dataDua;
        dataDua = temp;
    }

    public void tampilHasilTukar() {
        System.out.println("Nilai variabel satu sesudah ditukar: " + dataSatu);
        System.out.println("Nilai variabel dua sesudah ditukar: " + dataDua);
    }

    public static void main(String[] args) {
        ContohTipeGeneric<Integer> obj = new ContohTipeGeneric<>();
        obj.setDataSatu(200);
        obj.setDataDua(100);
        obj.tukarNilai();
        obj.tampilHasilTukar();

        System.out.println();

        ContohTipeGeneric<String> obj2 = new ContohTipeGeneric<>();
        obj2.setDataSatu("Satria");
        obj2.setDataDua("Aldebaran");
        obj2.tukarNilai();
        obj2.tampilHasilTukar();
    }
}
