public class AddString {

    public static String add(String frstInTwoStrngs, String secndInTwoStrngs) {

        // number sum as string
        // ie, string of letters to be returned
        String numberSumOfTwoStrings = "";

        //  Block of code to be tested for error
        try {
            // convert both strings to numbers
            int numberFromstrngfirst = Integer.parseInt(frstInTwoStrngs);
            int numberFromstrngsecnd = Integer.parseInt(secndInTwoStrngs);

            // add both numbers, then convert the sum to string of letters and assign that string of letters to numberSumOfTwoStrings
            numberSumOfTwoStrings = String.valueOf(numberFromstrngfirst + numberFromstrngsecnd);

            //  Block of code to handle errors when it occurs in the try block
        } catch (Exception e) {
            // on errors, assign "Invalid operation" to string of letters to be returned
            numberSumOfTwoStrings = "Invalid operation";
        }

        // return the string of letters
        return numberSumOfTwoStrings;
    }



    public static void main(String[] args) {

        // call the "add" function for testing and print the returned string values
        System.out.println(add("111", "111"));
        System.out.println(add("10", "80"));
        System.out.println(add("", "20"));
    }
}


