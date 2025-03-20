package ex_05_Increment_Decrement_Operator;

public class Lab077_DE {
    public static void main(String[] args) {

        int a=10;
        int result_post=a--;
        System.out.println(result_post);//10-> because first assign the value then result_post will be 10 and a will be 9
        System.out.println(a);//9

    }
}
