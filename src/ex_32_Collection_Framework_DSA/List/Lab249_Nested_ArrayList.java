package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab249_Nested_ArrayList {
    public static void main(String[] args) {

        List<String> fruits1= new ArrayList<>();

        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");

        System.out.println(fruits1);//[orange, apple, cherry]

        List<String> fruits2=new ArrayList<>();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);//[mango, grapes, papaya]

        List vegetables= new ArrayList();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("onion");
        System.out.println(vegetables);//[tomato, potato, onion]

        List all_fruits= new ArrayList();

        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetables);
        System.out.println(all_fruits);//[[orange, apple, cherry], [mango, grapes, papaya], [tomato, potato, onion]]
        System.out.println(all_fruits.get(2));//[tomato, potato, onion]


    }
}
