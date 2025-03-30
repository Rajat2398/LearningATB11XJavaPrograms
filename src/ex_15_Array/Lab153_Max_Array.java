package ex_15_Array;

public class Lab153_Max_Array {
    public static void main(String[] args) {

        int[] array = {23, 45, 67, 43, 56, 22, 90, 88};


        int max_output= give_me_maximum(array);
        System.out.println(max_output);

        int min_output=give_me_minimum(array);
        System.out.println(min_output);
        

    }

    private static int give_me_minimum(int[] array) {


        int min=array[0];
        for (int i=0;i<array.length;i++){

            if (array[i]<min){
                min=array[i];
            }

        }return min;
    }

    static int give_me_maximum(int[] array) {


        int max=array[0];
        for (int i=0;i<array.length;i++){

            if (array[i]>max){
                max=array[i];
            }

        }
        return max;
    }
}
