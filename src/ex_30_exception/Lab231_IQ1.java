package ex_30_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab231_IQ1 {


    public static void main(String[] args)  {

        System.out.println("Starting");
        try {
            FileReader fileReader = new FileReader("F://abc.text");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ending");
    }
}
//F:\abc.text (The system cannot find the path specified)
