package Java_2023.Algo;

import java.util.Arrays;

public class Gadnie1 {
    public static void main(String[] args) {
        int [] digits={1,3,7,9,3,5,9};
        System.out.println(maxNumber(digits));

    }

    private static String maxNumber (int[] digits){
        Arrays.sort(digits);
        String result="";
        for(int i=digits.length-1;i>=0;i--){
            result+=digits[i];
        }
        return result;

    }
}
