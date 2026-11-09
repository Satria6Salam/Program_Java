package modul03.operasi_array_latihan2;

public class OperasiArray2 {
    private int[] dataNew;
    private double[] hasilPerkalian;

    public int[] getNewData() {
        return this.dataNew;
    }
    
    public double[] getHasilPerkalian() {
        return this.hasilPerkalian;
    }

    @SuppressWarnings("unused")
    public void ubahData(int[] data, int angka, int peubah) {
        this.dataNew = new int[data.length];
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] != angka) {
                    this.dataNew[i] = data[i];
                } else if (data[i] == angka) {
                    this.dataNew[i] = peubah;
                }
            }
        } else {
            System.out.println("Array masih kosong!");
        }
    }

    @SuppressWarnings("unused")
    public void hasilPerkalian(int[] data, double angkaPengali) {
        this.hasilPerkalian = new double[data.length];
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                hasilPerkalian[i] = angkaPengali * data[i]; 
            }
        } else {
            System.out.println("Array masih kosong!");
        }
    } 

    public void display(String data) {
        System.out.println(data);
    }

    public void display(int[] data) {
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
