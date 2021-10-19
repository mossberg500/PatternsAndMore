package ua.lov.mathematic;

import java.util.Arrays;
import java.util.Objects;

public class StreamlongLong {
    public static void main(String[] args) {
        int x = 0;
        Integer y = null;
        System.out.println("y = " + y);
      //  int yy = y;
      //  System.out.println("yy = " + yy);


        Integer[] s = {0, 10, 6, null, 123};
        int[] d = Arrays.stream(s).filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
        for (int i=0; i< d.length; i++) {
            System.out.println("---"+d[i]);
        }

        long[] primitives = new long[s.length];
        for (int i = 0; i < s.length; i++) {
            primitives[i] = s[i];
            System.out.println("primitives " + primitives[i]);
        }
    }
}
