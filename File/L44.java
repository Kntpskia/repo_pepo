package Java_2023.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L44 {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("TEST");
        PrintWriter pw= new PrintWriter(file);
        pw.println("Ars-mars hasbent is the best");
        pw.println("Ars-mars, I loveee u!");
        pw.close();
    }
}
