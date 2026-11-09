package modul_2.daftar_nilai;

public class OPP extends Nilai {
    private double bobotQuiz, bobotPrak, bobotUts, bobotUas;

    public OPP(double quiz, double prak, double uts, double uas) {
        super(quiz, prak, uts, uas);
        this.bobotQuiz = 0.1; 
        this.bobotPrak = 0.4;
        this.bobotUts = 0.2;
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
        System.out.println("OBJECT ORIENTED PROGRAMMING");
        super.display();
    }
}
