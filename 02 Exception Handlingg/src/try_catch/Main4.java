package try_catch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        File file = new File("data.txt");

        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            throw new java.io.IOError(e); // ❌ Melempar IOError jika terjadi masalah I/O yang fatal
        }
    }
}
