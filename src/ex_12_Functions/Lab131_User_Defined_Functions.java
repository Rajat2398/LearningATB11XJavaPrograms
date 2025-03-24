package ex_12_Functions;

public class Lab131_User_Defined_Functions {
    public static void main(String[] args) {

       int r1= result(4,5);
       int r2= result(6,8);
        System.out.println(r1);
        System.out.println(r2);
    }
    static int result(int a, int b){
        return a+b;
    }
}
