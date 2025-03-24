package ex_11_DOWHILE;

public class Lab126_Diff_BETWEEN_WhileAndDoWhile {
    public static void main(String[] args) {

        int a=0;
//        while(a<10);
//        {
//            System.out.println(a);//Nothing will print

//            a++;
//        }
        do{
            System.out.println(a);
            a++;
        }while(a<0);// it will print 0
    }
}
