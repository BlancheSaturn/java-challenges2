public class CountNumber {

    public static int countNum(int n)
    {
        // converting number to string using
        String num = Integer.toString(n);

        // calculate the size of string
        System.out.println(+num.length());
        return num.length();
    }

    public static void main(String args[])
    {
        int n = 2345;
        countNum(n);
    }

}
