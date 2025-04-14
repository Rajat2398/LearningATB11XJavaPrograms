package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List_I {


    public static void main(String[] args) {

       // List Fruit= new List();


       List Fruits= List.of("Orange","Apple", "Guaua","Banana");
        System.out.println(Fruits);
      //  Fruits.add("Watermelon");//"main" java.lang.UnsupportedOperationException
    //  Fruits.remove("Apple");//java.lang.UnsupportedOperationException

        List l= new ArrayList();
        l.add("Hello");
        l.add(123);
        l.add("2333");
        System.out.println(l);




    }
}
