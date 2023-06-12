package Java_2023.File.L45_Ser;

import java.io.*;

public class Write  {
    public static void main(String[] args) {
        Test45 one= new Test45(28,"Ars");
        Test45 two =new Test45(21,"Irisha");
        try {
            FileOutputStream x = new FileOutputStream("people.bin");// записывает в байтах потому что наследует OutputStream
            ObjectOutputStream y= new ObjectOutputStream(x);//использует объектFileOutputStream x, записывает в виде объектов

            y.writeObject(one);
            y.writeObject(two);
            y.close();//обязательно !!!

        }
        catch(IOException o){
            o.printStackTrace();
        }
    }
}
