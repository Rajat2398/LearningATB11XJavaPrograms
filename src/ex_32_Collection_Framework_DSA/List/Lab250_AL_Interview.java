package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {
    public static void main(String[] args) {

        List marks= new ArrayList();

        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

//Collections-> Class->it contains complete method which List,set,queue may required)
        System.out.println(marks);//[91, 95, 56, 89]
        Collections.sort(marks);
        System.out.println(marks);//[56, 89, 91, 95]

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);//[95, 91, 89, 56]

    }
}
