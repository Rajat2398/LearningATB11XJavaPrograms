package Tasks;

public class Task002_In_Dec_Operator {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);//34
        System.out.println(a);//13



        //++a=11; then a=11
        //a++=11; then a=12
        //a++=12; then a=13
        // 11+11+12= 34
        //a= 13
    }
}
