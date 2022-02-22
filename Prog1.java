package CS390Assignment1;

public class Prog1 {
    /**
     * Problem 1
     */
    public static void computeRandomNumber(){

        //assigning x and y to a random number;
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);

        //printing out the result
        System.out.println(Math.pow(Math.PI,x));
        System.out.println(Math.pow(y,Math.PI));

    }

    /**
     *Problem 2
     */

    public static void main(String[] args) {

   computeRandomNumber();


    }
}
