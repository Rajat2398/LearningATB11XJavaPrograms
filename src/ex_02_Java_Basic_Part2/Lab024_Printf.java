package ex_02_Java_Basic_Part2;

public class Lab024_Printf {
    public static void main(String[] args) {

        int a=10;
        System.out.printf("Your code is %d",a);// Your code is 10
        /* %d-> int, byte, short, long - data type
           %s-> string
           %f-> float, double;
           %b->boolean
Printf is used for formatting
         */
        int b=20;
        System.out.println(" ");
        System.out.printf("%d + %d", a,b);

    }
}
