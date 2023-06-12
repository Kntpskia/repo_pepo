package Java_2023.Base;

public class C_Massiv {
    public static void main(String[] args) {

        int[][][] table= {{{9}},{{1,2,3},{1,2}}};

        System.out.println(table[0][0][0]);



        System.out.println();
        int [] n ={1,2,3};
        System.out.println(n[0]);

        System.out.println();
        int[] y= new int [3];
        y[0]=1;
        y[1]=2;
        y[2]=3;
       for(int w:y){
           System.out.println(w);

       }


        System.out.println();
        System.out.println("Summa!");
       int sum=0;
       for (int a:y){
           sum=sum+a;
           System.out.println("Summa= "+sum);
       }
        System.out.println();

    }
}