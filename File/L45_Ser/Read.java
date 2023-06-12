package Java_2023.File.L45_Ser;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static void main(String[] args) {


        try {
            FileInputStream x = new FileInputStream ("people.bin");// читает  в байтах потому что наследует InputStream
            ObjectInputStream y = new ObjectInputStream(x);//использует объект FileInputStream x, читает  в виде объектов

            Test45 one= (Test45) y.readObject();
            Test45 two= (Test45) y.readObject();


            System.out.println(one);
            System.out.println(two);

            y.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException a) {
            a.printStackTrace();
        }
    }
}
