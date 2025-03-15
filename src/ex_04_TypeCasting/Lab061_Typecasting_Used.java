package ex_04_TypeCasting;

public class Lab061_Typecasting_Used {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
//     int total=course+GST;//Narrowing-Implicit


        int total1=course+(int)GST;//Narrow-Explicit
        System.out.println(total1);//118


        float total2=course+GST;//Widening- auto-implicit
        System.out.println(total2);//118.45

        float total3=(float)course+GST;//Widening- Explicit
        System.out.println(total3);//118.45
    }
}
