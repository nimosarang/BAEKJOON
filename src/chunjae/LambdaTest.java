package chunjae;

import java.util.Arrays;

public class LambdaTest {

    public static void main(String[] args) {

        int[] intArray = {12,24,15};
        int count = (int) Arrays.stream(intArray).filter(i -> i % 2 == 0).count();
        System.out.println( "count = " + count);

    }

}
