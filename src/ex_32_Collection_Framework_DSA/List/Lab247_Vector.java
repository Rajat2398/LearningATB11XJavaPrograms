package ex_32_Collection_Framework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab247_Vector {

    public static void main(String[] args) {


        Vector v= new Vector();
        Vector v1= new Vector(10);


        v.add("Rajat");
        v.add("Sharma");
        v.add("Lucky");
        System.out.println(v);//[Rajat, Sharma, Lucky]
        v.remove("Lucky");
        System.out.println(v.contains("Sharma"));//true
        System.out.println(v);//[Rajat, Sharma]


        System.out.println("--- Normal for loop");


        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
            //Rajat
            //Sharma

        }
        System.out.println("---For each loop");
        for(Object o:v){
            System.out.println(o);
            //Rajat
            //Sharma
        }
        System.out.println("---Iterator");
        Iterator iterator= v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //Rajat
            //Sharma
        }
        System.out.println("---Enumeration");

        Enumeration enumeration= v.elements();
while (enumeration.hasMoreElements()){
    System.out.println(enumeration.nextElement());
    //Rajat
    //Sharma

    System.out.println("--- listIterator");
    ListIterator listIterator= v.listIterator();
    while(listIterator.hasNext()) {
        System.out.println(listIterator.next());
        //Rajat
        //Sharma
    }{
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            //Sharma
            //Rajat
        }
    }
}
    }
}
