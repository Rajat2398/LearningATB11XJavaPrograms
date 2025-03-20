package ex_03_Literals_And_Operator;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String a="Rajat";
        String b="Sharma";

        int c=34;
        int d=65;
        System.out.println(a+b+c+d);//RajatSharma3465
        System.out.println(c+d+a+b);//99RajatSharma
    }
}
