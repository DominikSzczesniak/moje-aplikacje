package poczatkowe;

public class podstawy {
    public static void main(String[] args) {
        countingSheep(5);

    }

    public static void countingSheep(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " sheep...");
        }
    }
}