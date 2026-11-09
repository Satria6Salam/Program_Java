package modul_1.cek_kelulusan;

public class Main {
    public static void main(String[] args) {
        CourseName courseName = new CourseName("Bahasa Inggris");

        Studenst studenst1 = new Studenst("Satria", 19, 75);
        Studenst studenst2 = new Studenst("Vika", 19, 80);
        Studenst studenst3 = new Studenst("Bule", 19, 45);
        Studenst studenst4 = new Studenst("Iwan", 19, 55);
        Studenst studenst5 = new Studenst("Doni", 19, 95);

        courseName.addStudenst(studenst1);
        courseName.addStudenst(studenst2);
        courseName.addStudenst(studenst3);
        courseName.addStudenst(studenst4);
        courseName.addStudenst(studenst5);

        courseName.daftarStudenst();
        courseName.daftarKelulusan();

    }
}