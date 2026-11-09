package Modul9;

public class ContohTipeObject {
    private Object dataSatu, dataDua, temp;

    public Object getDataSatu() {return dataSatu;}
    public Object getDataDua() {return dataDua;}

    public void setDataSatu(Object dataSatu) {
        this.dataSatu = dataSatu;
    }

    public void setDataDua(Object dataDau) {
        this.dataDua = dataDau;
    }

    public void tukarNilai() {
        temp = dataSatu;
        dataSatu = dataDua;
        dataDua = temp;
    }

    public void tampilHasilTukar() {
        System.out.println("Nilai Variabel satu sesudah ditukar: " + dataSatu);
        System.out.println("Nilai Variabel dua sesudah ditukar: " + dataDua);
    }

    public static void main(String[] args) {
        ContohTipeObject obj = new ContohTipeObject();
        Integer a = 110;
        Integer b = 200;
        obj.setDataSatu(a);
        obj.setDataDua(b);
        obj.tukarNilai();
        obj.tampilHasilTukar();

        System.out.println();
        
        String nama1 = "Satria";
        String nama2 = "Aldebaran";
        obj.setDataSatu(nama1);
        obj.setDataDua(nama2);
        obj.tukarNilai();
        obj.tampilHasilTukar();
    }
}