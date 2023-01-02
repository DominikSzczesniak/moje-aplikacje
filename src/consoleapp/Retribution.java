package consoleapp;

import java.util.Objects;

public class Retribution extends WowCharacter {
    RetributionCharges retributionCharges;      // DODALEM TUTAJ TO

    public Retribution(String nickname, String race, String class1, String spec, RetributionCharges retributionCharges) {
        super(nickname, race, class1, spec);
        this.retributionCharges = retributionCharges;
    }


    public void crusaderStrike() {
        //System.out.println(new RetributionCharges(0).add(new RetributionCharges(1))
        System.out.println("used crusader strike");
        retributionCharges = retributionCharges.add(new RetributionCharges(1));
    }

    public void bladeOfJustice() {

    }

    public void templarVerdict() {
        if (retributionCharges.equals(new RetributionCharges(2)) || retributionCharges.equals(new RetributionCharges(3)) || // NOWA METODA NA SPRAWDZENIE LEPIEJ ALE CZY NAJLEPIEJ?
                retributionCharges.equals(new RetributionCharges(4)) || retributionCharges.equals(new RetributionCharges(5))) {  // MOZE GETTERA ZROBIC NA VALUE I WTEDY POROWNYWAC 2 INTY???
            System.out.println("used templar's verdict");
            retributionCharges = retributionCharges.substract(new RetributionCharges(2));  // TUTAJ ZAMIAST NOWY OBIEKT TO ZROBIC WCZESNIEJ JAKIS NP TEMPLARSVERDICT// MOZE ENUM???
        }
        else System.out.println("couldn't use templar's verdict - not enough charges");
    }

    public void divineStorm() {

    }


    @Override
    public void rotation() {
        crusaderStrike();
    }

}
