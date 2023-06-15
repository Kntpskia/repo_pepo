package Java_2023.Algo;

public class Fibon {
    public static void main(String[] args) {
        System.out.println(fibona(100));


    }
    private static long fibNaiv (int n){
        if(n<=1) return n;
        return fibNaiv(n-1)+fibNaiv(n-2);

    }

    private static long fibona (int n){
        int [] arr =new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=n; i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr[n];
    }

}
