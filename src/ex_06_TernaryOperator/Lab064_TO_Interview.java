package ex_06_TernaryOperator;

public class Lab064_TO_Interview {
    public static void main(String[] args) {

        //Nested Ternary
        //result= condition1 ? Expression 1:(condition2?Expression 2:Expression 3)

        int a=56;
        String  result= a>45? "True":"False";
        System.out.println(result);


        int b= 40;
        String result1=b<35? "True":(b<45?"Text":"True");
        System.out.println(result1);//Text

        int b1= 40;
        String result2=b1>35? "False":(b1<45?"Text":"True");
        System.out.println(result2);//False

        int b2= 40;
        String result3=b2<35? "False":(b2>45?"Text":"True");
        System.out.println(result3);//True








    }
}
