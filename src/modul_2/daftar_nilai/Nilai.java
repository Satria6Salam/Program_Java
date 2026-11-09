package modul_2.daftar_nilai;

public class Nilai {
    private double quiz, prak, uts, uas;

    public Nilai(double quiz, double prak, double uts, double uas) {
        this.quiz = quiz;
        this.prak = prak;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return this.quiz;
    }

    public double getPrak() {
        return this.prak;
    }

    public double getUts() {
        return this.uts;
    }

    public double getUas() {
        return this.uas;
    }

    public double getNilaiAkhir(){
        return getQuiz() + getPrak() + getUts() + getUas();
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public void setPrak(double prak) {
        this.prak = prak;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void display() {
        System.out.printf("Quiz\t\t\t: %.1f\n", this.quiz);
        System.out.printf("Praktik\t\t\t: %.1f\n", this.prak);
        System.out.printf("Ujian Tengah Semester   : %.1f\n", this.uts);
        System.out.printf("Ujian Akhir Semester    : %.1f\n", this.uas);
        System.out.printf("Nilai Akhir             : %.2f\n", getNilaiAkhir());
    }
}
