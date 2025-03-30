package ex_15_Array;

public class Lab156_Sum_Of_Array {
    public static void main(String[] args) {

        int [] num= {23,76,4};
        int sum=0;

        for(int i=0;i< num.length;i++) {
            sum = sum + num[i];
            System.out.println(sum);//23,99,103
        }
        System.out.println(sum);//103
    }
}
