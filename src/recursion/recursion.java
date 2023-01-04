package recursion;

import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13

        System.out.println(fibonacci(6));
        System.out.println(fibonaccidalej(4));
    }

    public static int fibonacci(int y) {
        if (y == 0)
            return 0;
        if (y <= 2)
            return 1;
        return fibonacci(y - 1) + fibonacci(y - 2);
    }
//  fibonacci 5 =
//  fibonacci 4 + fibonacci 3 =
//  fibonacci 3 + fibonacci 2 + fibonacci 3 =
//  fibonacci 2 + fibonacci 1 + fibonacci 2 + fibonacci 3 =
//  1 + 1 + 1 + fibonacci 3 =
//  3 + fibonacci 2 + fibonacci 1 =
//  3 + 1 + 1 =
//  5
//
//
//
//
//
//
//

    public static int fibonaccidalej(int y) {
        if (y == 0)
            return 0;
        if (y == 1)
            return 1;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= y; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}
