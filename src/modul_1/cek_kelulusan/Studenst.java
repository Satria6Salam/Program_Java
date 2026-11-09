package modul_1.cek_kelulusan;

public class Studenst {
    private String name;
    private int age;
    private double grade;

    public Studenst(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGrade() {
        return this.grade;
    }

    public boolean checkGrade() {
        return this.grade >= 60;
    }

    public void display() {
        System.out.println();
        System.out.println("Name\t: " + this.name);
        System.out.println("Age\t: " + this.age);
        System.out.println("Grade\t: " + this.grade);
    }
}
