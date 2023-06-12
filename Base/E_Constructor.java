package Java_2023.Base;

public class E_Constructor{
    public static void main(String[] args) {
        Constructor2 exemlyar1 = new Constructor2("Ars",27);


    }
}

class Constructor2{
    private String name;
    private int age;


    public Constructor2 (String name, int age) {
        this.name = name;
        this.age = age;
    }
}