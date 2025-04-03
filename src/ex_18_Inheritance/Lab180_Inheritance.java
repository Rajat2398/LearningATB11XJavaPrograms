package ex_18_Inheritance;

public class Lab180_Inheritance {

    public static void main(String[] args) {

        father f1= new father();
        System.out.println(f1.gold_f);
        f1.bhk2();


        son s1= new son();
        s1.bhk3();
        System.out.println(s1.gold_f);
        s1.bhk2();
    }
}


class father {

    int gold_f=1000;// Data variables/ Attributes/Property

    void bhk2(){//Method/Behaviour/Function

        System.out.println("Father- 2bhk");
    }

}

class son extends father{


    void bhk3(){
        System.out.println("3Bhk-Son");
    }
}
