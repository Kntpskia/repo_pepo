package Java_2023.Base;

public class G_equalseee {
    public static void main(String[] args) {
        Animal12 one = new Animal12(1);
        Animal12 two= new Animal12(1);

        System.out.println(one.equals(two));
    }
}
 class Animal12 {
    private int id;
    public Animal12(int id) {
        this.id = id;
    }
    public boolean equals(Object ob){
        Animal12 other =(Animal12) ob;
        return this.id==((Animal12) ob).id;
    }
 }