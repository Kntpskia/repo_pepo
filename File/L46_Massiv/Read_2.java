package Java_2023.File.L46_Massiv;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class Read_2 {
    public static void main(String[] args) {


        try {
            FileInputStream x = new FileInputStream ("people2.bin");// читает  в байтах потому что наследует InputStream
            ObjectInputStream y = new ObjectInputStream(x);//использует объект FileInputStream x, читает  в виде объектов

            Test46[] test46s=(Test46[]) y.readObject();



            System.out.println(Arrays.toString(test46s));
            y.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException a) {
            a.printStackTrace();
        }
    }
}
