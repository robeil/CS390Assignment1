package CS390Assignment1;

public class Prog3 {

    /**
     *Method for problem 3
     */
    public static String[] removeDups(String[] duplicate){


       if(duplicate == null || duplicate.length == 0){
           return null;
       }
        int count = 0;
        boolean isDuplicate = false;

       for(int i = 0; i < duplicate.length; i++) {
           for (int j = 0; j < i; j++) {
               if (duplicate[i].equals(duplicate[j])) {
                   isDuplicate = true;
                   count++;
               }
           }
       }
        String[] newArray = new String[duplicate.length - count];
       int index = 0;
        while(!isDuplicate){
         newArray[index++] = duplicate[index];
        }

        return newArray;
    }

    public static void main(String[] args) {
        /**
         *      Problem 3
         * ---------------------------------------------------------------------------
         */
        ///creating duplicated String of array
        String[] duplicate = {"horse","dog","cat","horse","dog"};

        //calling the removeDups method
        String[] newAr = removeDups(duplicate);

        for(String s: newAr){
            System.out.println(s);
        }


    }
}
