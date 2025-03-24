package ex_12_Functions;

public class Lab132_UD_1 {
    public static void main(String[] args) {

        //1. Without Parameters and Without return type
        //2. Without Parameters and With return type
        //3. With Parameters and Without return type
        //4. With Parameters and With return type




        //1. Without Parameters and Without return type
        wp_wr_greet();


        //2. Without Parameters and With return type
        String result= greet_with_wp_wr();
        System.out.println(result);


        //3. With Parameters and Without return type
        greet_with_details("Rajat",26,200);
        greet_with_details("Text",27,1200);

        //4. With Parameters and With return type
        int r= sum_2_numbers(5,7);
        System.out.println(r);



    }
    //1. Without Parameters and Without return type
    static void wp_wr_greet(){
        System.out.println("Hi How are you?");
    }
    //2. Without Parameters and With return type
    static String  greet_with_wp_wr(){
        System.out.println("Hi");
        return "Hello Sir";
    }
    //3. With Parameters and Without return type(90% will be in use)


    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is ->" + age + "\nYour salary is ->" + salary);

    }
    //4.  With Parameters and With return type

    static int sum_2_numbers(int a, int b){
        return a+b;
    }
}
