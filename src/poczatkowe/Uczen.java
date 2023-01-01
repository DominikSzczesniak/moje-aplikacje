package poczatkowe;

public class Uczen {
    private String nazwisko;
    private int ocena;

    String getNazwisko(){
        return "nazwisko: " + this.nazwisko;
    }
    void setNazwisko(String nazwisko){
        if (nazwisko.length() >= 2) {
            this.nazwisko = nazwisko;
        }
    }
}
