package ex_30_exception;

public class Lab233_Throw {
    public static void main(String[] args) {

    }


    static void dividebyzero(int a){



        //check

        if(a==0)
        {
            throw new ArithmeticException();
        }

    }
}
