package ex_31_Generics;

public class Lab238_Generic_Class {
    public static void main(String[] args) {

        GenericClass<Integer> intobjref= new GenericClass(5);
        GenericClass<String> Stringobjref= new GenericClass("Rajat");



        //T-> It is a placeholder only, It can be any data type
    }
}

class GenericClass<T>{


    private T data;

    public GenericClass(T data) {
        this.data = data;
    }
    public T getData(){
        return  this.data;
    }

}
