package ex_28_Wrapper_Class;

public class Lab215_Wrapper_Conversion2 {
    public static void main(String[] args) {

        String num="10";
        int aaa=10;

        //String-> Wrapper->parsex(),Integer.parseInt(num),Double.parseDouble(num)
        Integer a= Integer.parseInt(num);
        Integer b= Integer.valueOf(num);


        //String to primitive
        int aa=Integer.parseInt(num);

      //Wrapper to String(to String method)
        System.out.println(b.toString());


        //Primitive to String-> by toString() Method
        int age=10;
        Integer age_wrapper=age;
        System.out.println(age_wrapper.toString());
    }


}
