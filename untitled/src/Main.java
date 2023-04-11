import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] str= {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
       ArrayList<String> intersection=new ArrayList<>();
        String [] strOne= str[0].split(",");
        String [] strTwo=str[1].split(",");
        int [] intOne=new int[strOne.length];
        int [] intTwo=new int[strTwo.length];

        for(int i=0;i < strOne.length;i++){
            intOne[i]=Integer.parseInt(strOne[i].trim());
        }
        for(int i=0;i < strTwo.length;i++){
            intTwo[i]=Integer.parseInt(strTwo[i].trim());
        }

        for(int i=0;i < strOne.length;i++){
            for(int j=0;j < strTwo.length;j++) {
                if(intOne[i]==intTwo[j]){
                    intersection.add(String.valueOf(intOne[i]));
                }
            }
        }
//        for(String a:intersection){
//            System.out.print(a);
//            System.out.print(",");
//        }
        System.out.println(intersection.toString().replace("[","").replace("]",""));

//        System.out.println(factorial(5));
    }

//    static int factorial(int n){
//        if(n ==1)
//            return 1;
//
//            return n * factorial(n -1);
//
//    }
}