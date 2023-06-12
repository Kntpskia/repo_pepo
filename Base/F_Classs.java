package Java_2023.Base;


public class F_Classs {
    public static void main(String[] args) {
        //public class может быть только один
        THIS exemplyar= new THIS();
        exemplyar.setName("Ars");
        exemplyar.setAge(27);
        exemplyar.say();
        System.out.println();
        System.out.println("MY AGE "+exemplyar.getAge());



        System.out.println();
        System.out.println(exemplyar.summa(12,13));
    }
}

class THIS{
   private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name=name;
    }



public void say(){
    System.out.printf("My name is %s %nMy age is %d",name,age);

}
public int summa(int x,int y){
    return x+y;
}
}