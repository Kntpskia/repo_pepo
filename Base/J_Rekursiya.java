package Java_2023.Base;

public class J_Rekursiya {
    public static void main(String[] args) {
        counter(5);

    }
    private static void  counter (int n){
        System.out.println(n);

        if (n==0)   //условие выхода из метода
            return; //возвращается из метода

        counter(n-1);//вызываем метод с командой для переменной 
    }
}
