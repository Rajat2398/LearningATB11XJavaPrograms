package ex_30_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab232_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("F://abc.text");


        String s1= null;
        s1.trim();
        int a= 10/0;
        File file= new File("");


    }
    //throws can attach with any method

    static void Text() throws Exception{

        File file= new File("");
    }
}
