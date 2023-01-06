package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursion {
    public static void main(String[] args) {
        int[] asd = new int[5];
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 13, 100, 200));
        System.out.println(sum(lista));

        List<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 13, 100, 200));
        System.out.println(sumTwo(listTwo));

        System.out.println(noVowels("gowno"));
        // 1 2 3 5 8 13

        System.out.println(fibonacci(6));
        System.out.println(fibonaccidalej(4));
        System.out.println(silnia(5));
        System.out.println(fibonaczi(5));
    }

    public static String noVowels(String string){ //gowno
        String regex = "[aeuioAEUIO]";
        if (string.length() == 0)
            return "nothing";
        if (string.length() == 1 && string.matches(regex))
            return "";
        return string.charAt(0) + noVowels(string.substring(1));
    }

    public static int sum(ArrayList<Integer> list){
        if (list.size() == 1)
            return list.get(0);
        int suma = list.get(list.size() - 1) + list.get(list.size() - 2);
        list.set((list.size() - 2), suma);
        list.remove(list.size() - 1);
        return sum(list);
    }

    public static int sumTwo(List<Integer> list){
        if (list.size() == 1)
            return list.get(0);
        return list.get(0) + sumTwo(list.subList(1, list.size()));
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

    public static int silnia(int x) {
        if (x == 1) {
            return 1;
        }
        return x * silnia(x - 1);
    }


    public static int fibonaczi(int x) {
        if (x == 0)
            return 0;
        if (x <= 2)
            return 1;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= x; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


}
