package modul03.operasi_array;

public class Array {
    private String[] mhs;
    private int[] deret;
    private int hasilPenjumlahan;

    public String[] getMhs() {
        return mhs;
    }

    public int[] getDeret() {
        return deret;
    }

    public int getPenjumlahan() {
        return hasilPenjumlahan;
    }

    public void setMhs(String[] mhs) {
        this.mhs = mhs;
        mhs = null;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
        deret = null;
    } 

    public void setPenjumlahan(int[] deret) {
        hasilPenjumlahan = 0;
        for (int i = 0; i < deret.length; i++) {
            hasilPenjumlahan += deret[i];
        }
        deret = null;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(String[] a) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data = data + a[i];
            } else {
                data = data + ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(int[] a) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data = data + a[i];
            } else {
                data = data + ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public void hapus() {
        mhs = null;
        deret = null;
        hasilPenjumlahan = 0;
    }
}
