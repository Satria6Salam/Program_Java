package Modul10.ProgramModul;
class Nilai {
    private double nilai;

    public void setNilai(double n) throws NilaiErrorException {
        if (n < 0 || n > 100) {
            throw new NilaiErrorException();
        } else {
            nilai = n;
        }
    }

    public double getNilai() {
        return nilai;
    }
}

public class ContohException4 {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        try {
            n.setNilai(10);
            System.out.println("Nilai: " + n.getNilai());
            n.setNilai(12);
            System.out.println("Nilai: " + n.getNilai());
        } catch (NilaiErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}
