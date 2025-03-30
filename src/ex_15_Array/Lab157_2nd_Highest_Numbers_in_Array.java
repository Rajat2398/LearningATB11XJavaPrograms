package ex_15_Array;

import java.util.Arrays;

public class Lab157_2nd_Highest_Numbers_in_Array {
    public static void main(String[] args) {

        int [] num= {23,34,56,11,78,100};

        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
