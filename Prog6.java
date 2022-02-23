package CS390Assignment1;

public class Prog6 {
    public static int min(int[] arrayOfInts){
        int min = 0;

        for(int i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] < min){
                min = arrayOfInts[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arrayOfInts = {2,-21,3,45,0,12,18,6,3,1,0,-22};

        //calling the min method
        System.out.println(min(arrayOfInts));
    }
}
