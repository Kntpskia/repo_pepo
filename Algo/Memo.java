package Java_2023.Algo;

import java.util.Arrays;

public class Memo {
    public static void main(String[] args) {
        int n=100;
        long [] mem=new long[n+1];
        Arrays.fill(mem,-1);
        System.out.println(memoi(n, mem));

    }
    private static long memoi (int n,long[] mem){
        if (mem[n]!=-1)
            return mem[n];

        if(n<=1) return n;

        long result = memoi(n-1,mem)+memoi(n-2,mem);
        mem[n]=result;
        return result;

    }
}
