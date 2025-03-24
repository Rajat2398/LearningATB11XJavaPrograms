package ex_09_For_Loop;

public class Lab113_For_Loop_ContinueEvenNumber {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {

//            if (i%2==0){
//                System.out.println("Even ->" + i);
//                continue;
//            }
//            System.out.println("odd -> " + i);
//        }
// if only odd number need to print
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("odd -> " + i);

        }
    }
}

