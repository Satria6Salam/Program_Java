package modul_1.cek_kelulusan;

import java.util.ArrayList;
import java.util.List;

public class CourseName {
    private String courseName;
    private ArrayList<Studenst> listStudenst;

    public CourseName(String courseName) {
        this.courseName = courseName;
        listStudenst = new ArrayList<Studenst>();
    }

    public void addStudenst(Studenst studenst) {
        this.listStudenst.add(studenst);
    }

    public List<Studenst> getCheckGrade() {
        List<Studenst> getCheck = new ArrayList<>();
        for (Studenst studenst : listStudenst) {
            if (studenst.checkGrade()) {
                getCheck.add(studenst);
            }
        }
        return getCheck;
    }

    public void daftarStudenst() {
        System.out.println("===============================");
        System.out.println("\t" + this.courseName);
        System.out.println("===============================");
        System.out.println("List of all Students : ");
        for (Studenst studenst : listStudenst) {
            studenst.display();
        }
        System.out.println("===============================");
    }

    public void daftarKelulusan() {
        System.out.println("===============================");
        System.out.println("\t" + this.courseName);
        System.out.println("===============================");
        System.out.println("List of graduating students : ");
        List<Studenst> lulus = getCheckGrade();
        for (Studenst studenst : lulus) {
            studenst.display();
        }
    }
}
