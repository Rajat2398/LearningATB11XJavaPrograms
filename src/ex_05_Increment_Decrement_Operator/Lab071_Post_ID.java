package ex_05_Increment_Decrement_Operator;

public class Lab071_Post_ID {
    public static void main(String[] args) {

        //Pre Increment
        int a=10;
        System.out.println(++a);//11
        System.out.println(a);//11


        //Post Increment---> Print First and then Increase
        int a_post=10;
        System.out.println(a_post++);//10-> Print first
        System.out.println(a_post);//11
    }
}
