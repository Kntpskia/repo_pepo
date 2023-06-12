package Java_2023.Base.exxtends.L35_Importion;

public class Animal implements Dog{
    public void eating(){
        System.out.println("Nyam");
    }

    @Override
    public void bork() {
        System.out.println("gav");
    }
}
