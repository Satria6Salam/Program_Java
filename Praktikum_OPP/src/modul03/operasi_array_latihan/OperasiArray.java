package modul03.operasi_array_latihan;

public class OperasiArray {
    private double rataRata;
    private double nilaiMax;
    private double nilaiMin;

    public double getRataRata() {
        return this.rataRata;
    }

    public double getNilaiMax() {
        return this.nilaiMax;
    }

    public double getNilaiMin() {
        return this.nilaiMin;
    }

    public void rataRata(double[] data) {
        double jmlh = 0;
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                jmlh = jmlh + data[i];
            }
        }
        this.rataRata = jmlh / data.length;
    }

    public void nilaiMax(double[] data) {
        int indek = 0;
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] > data[indek]) {
                    indek = i;
                    this.nilaiMax = data[indek];
                }
            }
        } else {
            System.out.println("Data masih kosong!");
        }
    }

    public void nilaiMin(double[] data) {
        int indek = 0;
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] < data[indek]) {
                    indek = i;
                    this.nilaiMin = data[indek];
                }
            }
        } else {
            System.out.println("Data masih kosong!");
        }
    }

    public void letakIndek(double[] data, double angka) {
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == angka) {
                    System.out.println(angka + " terletak pada indek ke : " + i);
                } 
            }
        } else {
            System.out.println("Data masih kosong!");
        }
    }

    public void display(String data) {
        System.out.println(data);
    }

    public void display(double data) {
        System.out.println(data);
    }

    public void display(double[] data) {
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                if (i < data.length - 1) {
                    System.out.print(data[i] + ", ");
                } else {
                    System.out.print(data[i]);
                }
            }
        } else {
            System.out.println("Array masih kosong!");
        }
    }
    
}