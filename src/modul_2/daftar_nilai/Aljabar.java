package modul_2.daftar_nilai;

public class Aljabar extends Nilai {
    private double bobotQuiz, bobotPrak, bobotUts, bobotUas;

    public Aljabar(double quiz, double prak, double uts, double uas) {
        super(quiz, prak, uts, uas);
        this.bobotQuiz = 0.15; 
        this.bobotPrak = 0.25;
        this.bobotUts = 0.3;
        this.bobotUas = 0.3;
    }

    public double getBQuiz() {
        return this.bobotQuiz;
    }

    public double getBPrak() {
        return this.bobotPrak;
    }

    public double getBUts() {
        return this.bobotUts;
    }

    public double getBUas() {
        return this.bobotUas;
    }

    @Override
    public double getQuiz() {
        return super.getQuiz() * getBQuiz();
    }

    @Override
    public double getPrak() {
        return super.getPrak() * getBPrak();
    }

    @Override
    public double getUts() {
        return super.getUts() * getBUts();
    }

    @Override
    public double getUas() {
        return super.getUas() * getBUas();
    }

    @Override
    public void display() {
        System.out.println("---------------------------------------");
        System.out.println("ALJABAR");
        super.display();
    }
}
