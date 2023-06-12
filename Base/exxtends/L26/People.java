package Java_2023.Base.exxtends.L26;

public class People implements Bank_Human {
  private  String name;
    public void getPeople (String name){
        this.name=name;

    }
    @Override
    public void say() {

        System.out.println("My name is "+this.name);

    }
}
