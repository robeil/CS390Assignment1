package CS390Assignment1;

public class Prog1 {


    public static void main(String[] args) {

        /**
         *      Problem 1
         * ---------------------------------------------------------------------------
         */
        //assigning x and y to a random number;
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);

        //printing out the result
        System.out.println(Math.pow(x,Math.PI));
        System.out.println(Math.pow(Math.PI,y));

    }
}
