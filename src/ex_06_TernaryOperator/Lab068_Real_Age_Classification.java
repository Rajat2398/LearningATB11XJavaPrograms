package ex_06_TernaryOperator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        //age= 23->Adult (age>18)
        //Minor(age<18)
        //Senior(age>65)


        String age1=args[2];//need to set up in edit configuration
        System.out.println(age1);
        System.out.println(age1 instanceof String );

        int age=Integer.parseInt(age1);

        String result=(age<18)?"Minor": (age<65)?"adult":"Senior";
        System.out.println(result);
    }
}
