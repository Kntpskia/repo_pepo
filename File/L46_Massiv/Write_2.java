package Java_2023.File.L46_Massiv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write_2 {
    public static void main(String[] args) {
        Test46 [] test46s ={new Test46(28,"Ars"),new Test46(21,"Irisha"), new Test46(3, "Брак")};
        try {
            FileOutputStream x = new FileOutputStream("people2.bin");// записывает в байтах потому что наследует OutputStream
            ObjectOutputStream y= new ObjectOutputStream(x);//использует объектFileOutputStream x, записывает в виде объектов


            y.writeObject(test46s);
            y.close();//обязательно !!!

        }
        catch(IOException o){
            o.printStackTrace();
        }
    }
}
