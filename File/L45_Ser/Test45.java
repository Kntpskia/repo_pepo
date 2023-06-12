package Java_2023.File.L45_Ser;

import java.io.Serializable;

public class Test45 implements Serializable {
    private int id;
    private String name;
    public Test45(int id, String name){
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String toString(){
      return id+" "+name;
    }

}
