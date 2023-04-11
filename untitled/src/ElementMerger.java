import java.util.ArrayList;

import static java.lang.Math.abs;

public class ElementMerger {
    public static void main(String[] args) {
        int [] arr={4,5,1,2,7};
        int arrLength= arr.length-1;

        while(arrLength > 1){
            for(int i=0;i < arrLength;i++){
                arr[i]=abs(arr[i+1] - arr[i]);
            }
            arrLength--;
        }
        System.out.println(arr[1]-arr[0]);
    }

    public static Integer EleM(int []arr){
        ArrayList<Integer> arrOne= new ArrayList<>();
        for(int i=0;i < arr.length-1;i++){
            arrOne.add(Integer.valueOf(abs(arr[i]-arr[i+1])));
        }
        return (arrOne.toArray(new Integer[0])) ;
    }
}
