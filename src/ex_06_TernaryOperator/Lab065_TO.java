package ex_06_TernaryOperator;

public class Lab065_TO {
    public static void main(String[] args) {
        //Find the maximum number between two numbers
        int a=20;
        int b=30;
        System.out.println(Math.max(a,b));//30

        String max=a>b? "a":"b";
        System.out.println(max);//b

        int max1=a>b?a:b;
        System.out.println(max1);//30




    }
}
