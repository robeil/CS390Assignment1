package CS390Assignment1;

import java.util.Arrays;

public class Prog5 {

    public int[] combine(int[] a, int[] b){

        //getting finalArray.lnegth from array a & b and create final array;
        int newLength = a.length + b.length;
        int[] finalArray = new int[newLength];

        //looping through array a and copy yo the finalArray
       for(int i = 0; i < a.length; i++){
           finalArray[i] = a[i];
       }
        //getting the index where to put the first copy
        int destination = a.length;
       //how many element to copy
       int sizeCopy = b.length;
       //copying array b to finalArray
        System.arraycopy(b,0,finalArray,destination,sizeCopy);

        return finalArray;
    }

    public static void main(String[] args) {
        //creating new object of Prog5
        Prog5 p5 = new Prog5();

        int[]a = {5,6,-4,3,1};
        int[]b = {3,8,9,11};

        int[] newAr = p5.combine(a,b);

        System.out.println(Arrays.toString(newAr));


    }
}
