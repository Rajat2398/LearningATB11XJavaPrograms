package ex_06_TernaryOperator;

public class Lab067_Max_Between_3_Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=40;

        //Logic Building Formula

        //Step1- Find Input and Output
        //I/P->a,b,c ->int
        //O/P->String ->Max



        //a>b and a>c -> a
        //b>a and b>c -> b
        //c

        int max=(a>b)?(a>c)?a:c :(b>c)?b:c;

        System.out.println(max);//40
    }
}
