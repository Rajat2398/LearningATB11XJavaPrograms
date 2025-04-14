package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_Arraylist {

    public static void main(String[] args) {
        ArrayList T= new ArrayList();

        T.add("Text");
        T.add(424);//Different data type is allowed
        T.add(null);
        T.add(" Oxt");
        T.add(" Oxt");//Duplicates is allowed
        T.add("Test123" );

        System.out.println(T);
        System.out.println(T.size());//6


        List l= new ArrayList();//Dynamic Dispatch
        l.add("Hello");
        l.add(123);
        l.add("2333");
        System.out.println(l);
        System.out.println(l.isEmpty());//false

        List l2= new ArrayList();
        System.out.println(l2.isEmpty());//true


    }
}
