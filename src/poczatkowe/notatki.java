package poczatkowe;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Queue;
import java.util.*;

public class notatki {
    public static void main(String[] args) {

        int x;
        String y = "Hello World!";
        float z;

        // SCANNER
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        // RANDOM
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10));

        // NUMBERFORMAT 2 SPOSOBY
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123214.892);

        String xFormatted = NumberFormat.getCurrencyInstance().format(x); //TOFAJNIEJSZE

        //DATE
        Date now = new Date();

        //POINT
        Point point = new Point(1,5);

        //FORMATOWANIE STRINGA
        System.out.println(y.replace("o","u"));

        //TABLICA
        String[] NAZWA_TABLICY = new String[5];
        Arrays.sort(NAZWA_TABLICY); //SZEREGUJE ELEMENTY
        System.out.println(Arrays.toString(NAZWA_TABLICY)); //WYSWIETLA TABLICE
        for (int i = 0; i < NAZWA_TABLICY.length; i++)
            System.out.println(NAZWA_TABLICY[i]);
        for (String nazwatablicy : NAZWA_TABLICY)
            System.out.println(nazwatablicy);

        //ZMIANA TYPOW ???
        Integer.parseInt(y);

        //MATH
        int result1 = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.1F);
        int result3 = Math.max(3,9); //WYSWIETLI WIEKSZA
        double result4 = Math.random() * 100; //POKAZUJE LOSOWA LICZBE OD 0-1 ALE DZIEKI *100 POKAZUJE 1-100 Z PRZECINKAMI
        double result5 = Math.round(Math.random() * 100); //ZAOKRAGLA JA
        System.out.println(result5);

        //KOLEKCJE
        ArrayList list = new ArrayList(); //NA OBIEKCIE
        //  list.add(kot1);

        ArrayList<String> listNumberTwo = new ArrayList<>(); // ZWYKLA LISTA
        listNumberTwo.add("poczatkowe");

        HashMap<Integer, String> map = new HashMap<>();  // KLUCZ ORAZ WARTOSC
        map.put(1, "Poniedziałek");

        LinkedHashSet<String> set = new LinkedHashSet<>();  // NIE PRZECHOWUJE DUPLIKATOW
        set.add("Warszawa");

        Queue<String> kolejka = new ArrayDeque<>();  // TYLKO PIERWSZY ELEMENT MOZNA WYCIAGAC/DZIALAC NA NIM
        kolejka.add("Pierwszy");
        kolejka.add("Drugi");
        kolejka.add("Trzeci");
        System.out.println(kolejka.remove());

    }
}
