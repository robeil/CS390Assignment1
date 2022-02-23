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

       for(int i = 0; i < duplicate.length; i++) {
           for (int j = 0; j < i; j++) {
               if (duplicate[i].equals(duplicate[j])) {

                   count++;
                   break;
               }
           }
       }
       //creating new length and new array
       int newLength = duplicate.length - count;
        String[] newArray = new String[newLength];

        //making sure the duplicated array and the new array to have the same starting string
        newArray[0] = duplicate[0];
        int index = 1;

        //lloping again and assing the unrepeated string to the new array
        for(int i = 1; i < duplicate.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++){
                if(duplicate[i].equals(duplicate[j])){
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                newArray[index++] = duplicate[i];
            }
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
