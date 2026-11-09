package validasi_email;

public class Main2 {
    public static void main(String[] args) {
        String k = "satria.salam2005@gmail.com";
        if (k.matches("^[a-zA-Z][a-zA-Z0-9 #_+&*-].{6,20}\\@gmail.com$")) {
            System.out.println("Email Valid");
        } else {
            System.out.println("Email Tidak Valid");
        }
        
    }
}
