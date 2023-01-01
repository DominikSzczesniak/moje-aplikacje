package poczatkowe;

public class Tablice {
    public static void main(String[] args) {
        String[] tab = new String[20];
        tab[0] = "Ania";
        tab[1] = "Bartek";
        tab[2] = "Adam";
        tab[3] = "Asia";
        // ?????????
        // for (String item : tab){
        //      System.out.println(item);
        //  }


        int i;
        for (i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
