package Tasks;

public class Task010_Count_Vowles {
    public static void main(String[] args) {

        String input= "Java Count Vowles and consonant";
        int vowles=0;
        int consonant=0;

        input= input.toLowerCase();
        System.out.println(input);

        for(int i=0; i<input.length();i++)
        {

          char ch= input.charAt(i);

          if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              vowles++;

          }else {
              consonant++;

          }

            System.out.println("Number of vowels:" + vowles);
            System.out.println("Number of consonant:"  + consonant);


        }

    }
}
