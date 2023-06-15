package Java_2023.Algo;

public class Gadnie2 {
    public static void main(String[] args) {
        int [] ost={0,250,375,550,700,950};
        System.out.println(minstops(ost,400));
    }

    private static int minstops(int[] ost,int capacity){
        int result=0;
        int currentStop=0;
        while(currentStop<ost.length-1){
            int nextStop=currentStop;
            while(nextStop<ost.length-1
                    && ost [nextStop+1]-ost[currentStop]<=capacity){// 375-550<=400
                nextStop++;
            }
            if(currentStop==nextStop)
                return -1;

            if (nextStop< ost.length-1)
               result++;


            currentStop=nextStop;

        }
        return result;
    }
}
