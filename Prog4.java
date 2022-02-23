package CS390Assignment1;

public class Prog4 {
    public static void main(String[] args) {
        float f1 = 1.27f;
        float f2 = 3.881f;
        float f3 = 9.6f;

        //adding without rounding
        int sumFloat = (int) (f1 + f2 + f3);

        //rounding the numbers and adding
        int sumFloatWithRound = Math.round(f1) + Math.round(f2) + Math.round(f3);

        //printing out the result
        System.out.println(sumFloat);
        System.out.println(sumFloatWithRound);
    }
}
