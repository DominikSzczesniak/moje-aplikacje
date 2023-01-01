package poczatkowe;

public class Metody {
    public static void main(String[] args) {
        System.out.println(dodaj());
        System.out.println(dodaj(5));
        System.out.println(dodaj(5, 6));
    }

    static int dodaj(){
        return 0;
    }
    static int dodaj(int x){
        return ++x;
    }
    static int dodaj(int x, int y){
        return x + y;
    }
}
