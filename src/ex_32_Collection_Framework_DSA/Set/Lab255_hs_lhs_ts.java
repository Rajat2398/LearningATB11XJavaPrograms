package ex_32_Collection_Framework_DSA.Set;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Lab255_hs_lhs_ts {
    public static void main(String[] args) {


        //Hashset

        Set<String> hs= new HashSet();
        //no order
        //no duplicates
        //hashing mechanism to store the element
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
       // hs.add(123);//we took String
        hs.add(null);
        hs.add(null);//only one  null is allowed.


        System.out.println(hs);

        System.out.println("------");

        for(String s:hs){
            System.out.println(s);
            //null
            //Apple
            //Watermelon
            //Orange
        }

//Iterator
        Iterator iterator= hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//LinkedHashset
         Set <String> lhs= new LinkedHashSet();
        //  Linkedlist mechanism to store the elements
        //order will maintain, no duplicates



        lhs.add("dpple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);//[dpple, Apple, Orange, Watermelon, null]
        System.out.println(lhs.isEmpty());//false
        System.out.println(lhs.contains("Orange"));//true
        System.out.println(lhs.size());//5



        //TreeSet
        Set<String> ts= new TreeSet<>();

        //Black and Red Tree mechanism is used to store the elements
        //order will maintain, Natural sorting is done
        //Naturtsl Sorting- ASCII Order


        ts.add("dapple");//lower case will come last
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
       // ts.add(123);//java.lang.ClassCastException
       // ts.add(null);//java.lang.NullPointerException
        System.out.println(ts);//[Apple, Orange, Watermelon, dapple]

     for (String s:ts){
    System.out.println(s);
         //Apple
         // Orange
         //Watermelon
         //dapple
     }

    }
}
