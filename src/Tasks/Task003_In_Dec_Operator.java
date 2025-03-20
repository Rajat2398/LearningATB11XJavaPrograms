package Tasks;

public class Task003_In_Dec_Operator {
    public static void main(String[] args) {
        int a=20;
        System.out.println(--a + a++ +a--);//58
        System.out.println(a);//19


        //--a=19; then a=19
        //a++=19; then a=20
        //a--=20; then 19
        //19+19+20=58

        //a=19
    }
}
