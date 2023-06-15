package Java_2023.Algo;

import java.util.Arrays;

public class Dvoichniy_Binarniy {
    public static void main(String[] args) {

        System.out.println(binar(new int[] {1,2,3,5,5,7,54},54));
    }
public static int binar(int[] a, int key){

    //читаем индексы и его получаем
    
       int low=0;
       int high=a.length-1;
       while(low<=high){
           int middle=low+(high-low)/2;


           if(key<a[middle]){
               high=middle-1;
           } else if (key>a[middle]){

               low=middle+1;

           }  else{

               return middle;
           }


       }

       return -1;
}

}
