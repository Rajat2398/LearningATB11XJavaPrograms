package ex_32_Collection_Framework_DSA.List;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Lab245_Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> animals= new LinkedList();

        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("Linkedlist"+ animals);//Linkedlist[Lion, Dog, Cat, Elephant]


        //Accessing Elements
        System.out.println(animals.getFirst());//Lion
        System.out.println(animals.getLast());//Elephant

        //Removing Elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("Animals after removal" + animals);//Animals after removal[Dog, Cat]

        System.out.println(animals.size());//2
    }
}
