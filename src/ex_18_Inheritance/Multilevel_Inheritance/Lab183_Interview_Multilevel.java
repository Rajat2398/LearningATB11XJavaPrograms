package ex_18_Inheritance.Multilevel_Inheritance;

public class Lab183_Interview_Multilevel {
    public static void main(String[] args) {


        //Son s1= new Grandfather();
        //Son s1= new Father();
        Son Amit = new Son();


        Grandfather g1 = new Father();
        Grandfather g2 = new Son();// Dynamic Dispatch

        g1.gf();
        g2.home();//It will print the Son that is 3S

        Father f1 = new Son();
//    Father f2= new Grandfather();
        f1.home();//Son


        //WebDriver  driver= new ChromeDriver();
    }
}