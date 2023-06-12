package Java_2023.Coreee.Reflex;
@Autho
public class Rexle {
    private int id;
    private String name;
    public Rexle() {

    }
    public Rexle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void say() {
        System.out.println("Arsusha one love!");

    }

    @Override
    public String toString() {
        return "Rexle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
