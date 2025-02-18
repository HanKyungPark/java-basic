package static2.ex;

import static static2.ex.MathArrUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5};
        System.out.println("sum : " + sum(value));
        System.out.println("average : " + average(value));
        System.out.println("min : " + min(value));
        System.out.println("max : " + max(value));
    }
}
