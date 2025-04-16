package ex_32_Collection_Framework_DSA.List;

import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {


    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();

        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator listIterator= vector.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
            //Item1
            //Item2
            //Item3
            //Item4
            //Item5
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            //Item5
            //Item4
            //Item3
            //Item2
            //Item1
        }




    }

}
