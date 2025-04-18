package ex_32_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_Set_P1 {


    public static void main(String[] args) {

        Set  hs= new HashSet();
        Set lhs= new LinkedHashSet();
        Set ts= new TreeSet();

        hs.add("Rajat");
        hs.add("Rajat");
//[Rajat]-> Duplicate is not allowed, so Only onr time it will print
        System.out.println(hs);



    }
}
