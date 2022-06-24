import java.util.Arrays;
import java.util.stream.IntStream;

public class Multiples {

    public static int[] arrayOfMultiples(int num, int length) {
        return IntStream.range(0, length).map(i -> (i + 1) * num).toArray();
    }
        public static void main(String args[])
    {
           System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));
    }


}






