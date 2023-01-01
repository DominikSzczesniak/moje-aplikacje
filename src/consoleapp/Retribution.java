package consoleapp;

public class Retribution extends WowCharacter{
    RetributionCharges retributionCharges;      // DODALEM TUTAJ TO
    public Retribution(String nickname, String race, String class1, String spec, RetributionCharges retributionCharges) {
        super(nickname, race, class1, spec);
        this.retributionCharges = retributionCharges;
    }


    public void crusaderStrike(){
        //System.out.println(new RetributionCharges(0).add(new RetributionCharges(1))
        System.out.println("used crusader strike");
        retributionCharges = retributionCharges.add(new RetributionCharges(1));
    }

    public void bladeOfJustice(){

    }

    public void templarVerdict(){

    }

    public void divineStorm(){

    }



    @Override
    public void rotation() {
        crusaderStrike();
    }
}
