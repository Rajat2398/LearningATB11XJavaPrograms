package ex_30_exception;

public class Lab235_Custom_Exception_example {

    public static void main(String[] args) {

        Bank sbi= new Bank("INR",100);
        Bank icici= new Bank("INR",123);
        Bank Jp_chase= new Bank("USD",101);


        int total= sbi.add(icici);//223
        int total1= sbi.add(Jp_chase);//201-> and its not right because currency is different in both bank.
        System.out.println(total);
        System.out.println(total1);

    }
}
