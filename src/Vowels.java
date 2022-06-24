public class Vowels {



    public static String countVowels(String str) {
        String[] vowels = {"a","e","i","o","u"};
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                System.out.print(" " + str.charAt(i));
            }


        }
        return str;
    }
    public static void main(String args[]) {
        countVowels("sharpening skills");


    }


}
