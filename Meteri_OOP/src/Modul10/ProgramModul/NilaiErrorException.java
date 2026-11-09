package Modul10.ProgramModul;

public class NilaiErrorException extends Exception {
    public String getMessage() {
        return "Nilai hanya boleh 0 sampai 100";
    }
}
