package poczatkowe;

public class Choinka {
    public static void main(String[] args) {
        int wysokosc = 8;
    //    System.out.println("   *");    i = 1
    //    System.out.println("  ***");   i = 2
    //    System.out.println(" *****");  i = 3
    //    System.out.println("*******"); i = 4
        for (int i = 1; i <= wysokosc; i++) {


            for (int k = 0; k < i; k++) {
                while (k < wysokosc - i) {
                    System.out.print(" ");
                    k++;
                }
            }
            for (int j = 1; j <= i; j++){
                if (i % 3 == 0){
                    while (j < i * 2) {
                        System.out.print("~");
                        j++;
                    }
                }
                else{
                    while (j < i * 2) {
                        System.out.print("*");
                        j++;
                    }
                }
            }
                System.out.println();
        }
    }
}
