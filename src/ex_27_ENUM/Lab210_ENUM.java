package ex_27_ENUM;

public class Lab210_ENUM {

    public static void main(String[] args) {

        //By objects
        A a1= new A();
        System.out.println(a1.days[3]);//Thur
        //a1.days;


        System.out.println(days.Friday);//Friday
        System.out.println(days.Sunday);//Sunday


        System.out.println(Project_URLS.AON);
    }
}


class A{

    String[] days= {"Mon","Tue","Wed", "Thur","Fri", "Sat","Sun"};

}

enum days{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}


enum Project_URLS{
google,AON,Katalon
}